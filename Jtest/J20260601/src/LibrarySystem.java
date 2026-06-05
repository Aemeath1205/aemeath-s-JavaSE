import book.Library;
import user.*;
import user.factory.AdminUserFactory;
import user.factory.IUserFactory;
import user.factory.NormalUserFactory;

import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        IUserFactory factory = new AdminUserFactory();
        User adminUser = factory.createUser("admin",1);

        IUserFactory factory1 = new NormalUserFactory();
        User normalUser1 = factory1.createUser("normal1",1);
        User normalUser2 = factory1.createUser("normal2",2);

        ProxyUser proadminUser = new ProxyUser(adminUser);
        ProxyUser pronormalUser1 = new ProxyUser(normalUser1);
        ProxyUser pronormalUser2 = new ProxyUser(normalUser2);

        LibrarySystem librarySystem = new LibrarySystem();
        ProxyUser currentUser = librarySystem.selectProxyRole(proadminUser,pronormalUser1,pronormalUser2);
        while(true){
            int choice = currentUser.getRealUser().display();
            currentUser.handleOperation(choice);
        }
    }


    public ProxyUser selectProxyRole(ProxyUser proadminUser, ProxyUser pronormalUser1,ProxyUser pronormalUser2) {
        ProxyUser currentUser = null;
        System.out.println("Please enter your choice:");
        System.out.println(("1.管理员\n2.普通⽤⼾1\n3.普通⽤⼾2\n4.退出系统"));
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                currentUser = proadminUser;
                break;
            case 2:
                currentUser = pronormalUser1;
                break;
            case 3:
                currentUser = pronormalUser2;
                break;
            case 4:
                System.exit(0);
                System.out.println("系统已退出");
                break;
            default:
                break;
        }
        return currentUser;
    }

}
