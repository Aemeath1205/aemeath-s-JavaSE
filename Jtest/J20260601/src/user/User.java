package user;

public abstract class User {
    String name;
    int ID;
    String role;
    public User(String name, int ID, String role) {
        this.name = name;
        this.ID = ID;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public abstract int display();
}
