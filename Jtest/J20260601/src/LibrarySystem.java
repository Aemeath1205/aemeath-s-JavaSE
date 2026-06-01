import user.*;

public class LibrarySystem {
    public static void main(String[] args) {
        IUserFactory factory = new AdminUserFactory();
        User adminUser = factory.createUser("admin",1);

        IUserFactory factory1 = new NormalUserFactory();
        User normalUser1 = factory1.createUser("admin1",1);
        User normalUser2 = factory1.createUser("admin2",2);

        ProxyUser proadminUser = new ProxyUser(adminUser);
        ProxyUser pronormalUser1 = new ProxyUser(normalUser1);
        ProxyUser pronormalUser2 = new ProxyUser(normalUser2);
    }
}
