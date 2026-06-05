package user;

import book.Library;

import java.util.Scanner;

public class NormalUser extends User {
    Scanner scanner = new Scanner(System.in);
    public NormalUser(String name, int ID) {
        super(name, ID, "普通用户");
    }
    Library library = new Library();

    @Override
    public int display() {
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
    public void borrowBook() {
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();

        library.borrowbook(bookName);
    }
    //归还图书
    public void returnBook() {
        library.returnbook();
    }
    // 查看个⼈借阅情况
    public void viewBorrowBooks() {
    }
}
