package demo3;

public class Computer {
    // 依赖接口，不依赖具体实现：只要是符合USB规范的设备都能插
    public void plugInUSB(USB device) {
        device.check(); // 调用接口方法
        device.connect();
    }

    public void pullOutUSB(USB device) {
        device.disconnect();
    }
}
//当前USB协议版本：3.0
//检测USB设备，协议版本：3.0
//鼠标接入USB口
//        鼠标拔出USB口
//----------
//自定义检测雷蛇键盘设备
//        雷蛇键盘接入USB口
//雷蛇键盘拔出USB口