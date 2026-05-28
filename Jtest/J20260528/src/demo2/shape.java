package demo2;

public abstract class shape {
    public int a;
    public int b;
    shape(int a, int b) {
        this.a = a;
        this.b = b;
    }
    shape() {}
    public abstract void show();

}
