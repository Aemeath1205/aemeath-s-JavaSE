package demo4;

import java.awt.event.MouseListener;

public class mouse implements usb {
    public String brand ;
    mouse(String brand){
        this.brand = brand;
    }
    @Override
    public void usbin() {
        System.out.println("这是重写的usbin方法"+brand);
    }

    @Override
    public void usbout() {
        System.out.println("这是重写的usbout方法"+brand);
    }

    @Override
    public void anythingshow() {
        System.out.println("brand不是"+brand);
    }
}
