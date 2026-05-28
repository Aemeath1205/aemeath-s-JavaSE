package demo3;

// 实现类1：鼠标，实现USB接口
public class Mouse implements USB {
    @Override // 必须重写所有抽象方法
    public void connect() {
        System.out.println("鼠标接入USB口");
    }

    @Override
    public void disconnect() {
        System.out.println("鼠标拔出USB口");
    }
    // 可以不重写默认方法check()，直接继承接口的实现
}