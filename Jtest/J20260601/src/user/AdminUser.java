package user;

import book.Library;

import java.util.Scanner;

public class AdminUser extends User{
    Scanner scanner = new Scanner(System.in);
    public AdminUser(String name, int ID) {
        super(name, ID, "管理员");
    }

    @Override
    public int display() {
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
    Library library = new Library();

    public void update() {

    }


    public void delete() {

    }

    public void addBook() {
    }
    public void updateBook() {

    }
    public void removeBook() {
        library.loadallbooks();
        System.out.println("请输入你要下架的书的名称");
        Scanner sc = new Scanner(System.in);
        library.removeBook(sc.nextLine());
    }
    public void borrowCount() {
        System.out.println("你想要知道哪本书的借阅次数");
        Scanner sc = new Scanner(System.in);
        library.findborrowcount(sc.nextLine());
    }
    public void generatebook() {
        library.getgeneratebook();
    }
    public void checkInventoryStatus() {
        library.checkInventoryStatus();
    }
    public void checkAndRemoveOldBooks() {
    }
    public void exit() {
    }
}
