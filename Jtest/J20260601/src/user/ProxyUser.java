package user;

import java.util.Scanner;

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
            System.out.println("管理员 " + name + " 的操作菜单:");
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
            System.out.println("普通⽤⼾ " + name + " 的操作菜单:");
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
    public void addBook() {
    }
    public void updateBook() {
    }
    public void removeBook() {
    }
    public void borrowCount() {
    }
    public void generatebook() {
    }
    public void checkInventoryStatus() {
    }
    public void checkAndRemoveOldBooks() {
    }
    public void exit() {
    }
    public void borrowBook() {
    }
    //归还图书
    public void returnBook() {
    }
    // 查看个⼈借阅情况
    public void viewBorrowBooks() {
    }

}
