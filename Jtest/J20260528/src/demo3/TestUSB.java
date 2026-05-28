package demo3;

public class TestUSB {
    public static void main(String[] args) {
//         1. 调用接口静态方法
        USB.printProtocol(); // 输出：当前USB协议版本：3.0

        // 2. 创建电脑和设备
        Computer myComputer = new Computer();
        USB mouse = new Mouse(); // 接口多态：接口引用指向实现类对象
        USB keyboard = new KeyBoard("雷蛇");

        // 3. 同一接口，不同实现类表现出不同行为（多态）
        myComputer.plugInUSB(mouse);    // 输出：检测USB设备，协议版本：3.0 → 鼠标接入USB口
        myComputer.pullOutUSB(mouse);    // 输出：鼠标拔出USB口

        System.out.println("----------");

        myComputer.plugInUSB(keyboard);  // 输出：自定义检测雷蛇键盘设备 → 雷蛇键盘接入USB口
        myComputer.pullOutUSB(keyboard); // 输出：雷蛇键盘拔出USB口
    }
}
