package user;

import book.Library;
import utils.PermissionException;

import java.util.Scanner;

import static java.lang.System.exit;

public class ProxyUser {
    Scanner scanner = new Scanner(System.in);
    private User realUser;
    public ProxyUser(User user) {
        this.realUser = user;
    }

    public User getRealUser() {
        return realUser;
    }
    public int display(){
        if(realUser instanceof AdminUser){
            System.out.println("管理员 " + getRealUser() + " 的操作菜单:");
            System.out.println("1. 查找图书");
            System.out.println("2. 打印所有的图书");
            System.out.println("3. 退出系统");
            System.out.println("4. 上架图书");
            System.out.println("5. 修改图书");
            System.out.println("6. 下架图书");
            System.out.println("7. 统计借阅次数");
            System.out.println("8. 查看最后欢迎的前K本书");
            System.out.println("9. 查看库存状态");
            System.out.println("10. 检查超过⼀年未下架的图书");
            System.out.println("请选择你的操作：");
            return scanner.nextInt();
        }
        else if(realUser instanceof NormalUser){
            System.out.println("普通⽤⼾ " + getRealUser() + " 的操作菜单:");
            System.out.println("1. 查找图书");
            System.out.println("2. 打印所有的图书");
            System.out.println("3. 退出系统");
            System.out.println("4. 借阅图书");
            System.out.println("5. 归还图书");
            System.out.println("6. 查看当前个⼈借阅情况");
            System.out.println("请选择你的操作：");
            return scanner.nextInt();
        }
        else
            return 0;
    }
    Library library = new Library();
    public void handleOperation(int choice){
        if(realUser instanceof AdminUser){
            switch (choice){
                case 1:
                    library.lookforbooks();
                case 2:
                    library.loadallbooksname();
                case 3:
                    exit(0);
                case 4:
                    addBook();
                case 5:
                    updateBook();
                case 6:
                    removeBook();
                case 7:
                    borrowCount();
                case 8:
                    generateBook();
                case 9:
                    library.loadallbooks();
                case 10:
                    library.checkoneyearbooks();
                default:
                    break;
            }

        }
        if(realUser instanceof NormalUser){
            switch (choice){
                case 1:
                    library.lookforbooks();
                case 2:
                    library.loadallbooksname();
                case 3:
                    exit(0);
                case 4:
                    borrowBook();
                case 5:
                    returnBook();
                case 6:
                    viewBorrowedBooks();
                default:
                    break;
            }
        }
    }
   //-----------------------------------------------------------------------admin's method
    private void checkwhetheradmin(String message){
        if(!(realUser instanceof AdminUser)){
            throw new PermissionException(message);
        }
    }

    public void addBook(){
        checkwhetheradmin("你不是管理员，没有权限上架书");
    }
    //更新书籍操作
    public void updateBook(){
        realUser.update();
    }
    //移除图书
    public void removeBook(){
        realUser.removeBook();
    }
    //查看图书的借阅次数
    public void borrowCount( ) {
        realUser.borrowCount();
    }
    //查看最受欢迎的前K本书
    public void generateBook() {
        realUser.generatebook();
    }
    //查看库存状态
    public void checkInventoryStatus() {
        realUser.checkInventoryStatus();
    }
    //移除上架超过1年的书籍

    //------------------------------------------------------------------normaluser's method
    private void checkrealuserwhethernormaluser(String message){
        if(!(realUser instanceof NormalUser)){
            throw new PermissionException(message);
        }
    }
    //借阅图书
    public void borrowBook() {
        realUser.borrowBook();
    }
    //归还图书
    public void returnBook() {
        realUser.returnBook();
    }
//查看个⼈借阅情况
    public void viewBorrowedBooks() {

    }

}
