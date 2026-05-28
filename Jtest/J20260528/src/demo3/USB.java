package demo3;

public interface USB {
    // 1. 接口常量：USB协议版本，默认public static final
    String PROTOCOL_VERSION = "3.0";

    // 2. 抽象方法：设备接入，默认public abstract
    void connect();

    // 3. 抽象方法：设备断开
    void disconnect();

    // 4. 默认方法：通用的设备检测逻辑，所有实现类可以直接用
    default void check() {
        System.out.println("检测USB设备，协议版本：" + USB.PROTOCOL_VERSION);
    }

    // 5. 静态方法：打印协议信息，属于接口本身
    static void printProtocol() {
        System.out.println("当前USB协议版本：" + USB.PROTOCOL_VERSION);
    }
}
