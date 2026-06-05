package user.factory;

import user.AdminUser;
import user.User;

public class AdminUserFactory implements IUserFactory {

    @Override
    public User createUser(String name, int ID) {
        return new AdminUser(name, ID);
    }
}
