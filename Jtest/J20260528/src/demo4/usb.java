package demo4;

public interface usb {
    String brand = "雷蛇";
    public abstract void usbin();
    public abstract void usbout();
    public default void anythingshow(){
        System.out.println("brand是"+brand);
    }
}
