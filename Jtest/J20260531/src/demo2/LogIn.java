package demo2;

public class LogIn {
    String userName = "meng";
    String password = "123456";
    public void login(String username, String password) throws UserNameException, PasswordException {
        if(!this.userName.equals(username)){
            throw new UserNameException();
        }
        if(!this.password.equals(password)){
            throw new PasswordException();
        }
    }

    static void main() {
        try {
            new LogIn().login("meng", "123456");
        } catch (UserNameException e) {
            throw new RuntimeException(e);
        }catch (PasswordException e){
            throw new RuntimeException(e);
        }
    }
}
