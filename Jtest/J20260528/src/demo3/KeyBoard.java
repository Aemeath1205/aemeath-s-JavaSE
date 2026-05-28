package demo3;

// 实现类2：键盘，实现USB接口
public class KeyBoard implements USB {
    private String brand;
    public KeyBoard(String brand) { this.brand = brand; }

    @Override
    public void connect() {
        System.out.println(brand + "键盘接入USB口");
    }

    @Override
    public void disconnect() {
        System.out.println(brand + "键盘拔出USB口");
    }

    // 自定义重写接口的默认方法
    @Override
    public void check() {
        System.out.println("自定义检测" + brand + "键盘设备");
    }
}
