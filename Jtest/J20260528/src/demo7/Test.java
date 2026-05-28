package demo7;

//class Outer {
//    // 外部类私有成员
//    private int outerNum = 10;
//
//    // 成员内部类：定义在成员位置，无static修饰
//    public class MemberInner {
//        private int innerNum = 20;
//        public void print() {
//            // 直接访问外部类私有成员
//            System.out.println("外部类成员：" + outerNum);
//            // 同名成员通过Outer.this区分
//            System.out.println("内部类成员：" + this.innerNum);
//        }
//    }
//}
//
//// 实例化方式：必须先创建外部类对象，再创建内部类
//public class Test {
//    public static void main(String[] args) {
//        Outer outer = new Outer();
//        Outer.MemberInner inner = outer.new MemberInner();
//        inner.print(); // 输出：外部类成员：10 \n 内部类成员：20
//    }
//}
//class Outer {
//    // 外部类静态成员
//    private static int staticNum = 100;
//    // 外部类非静态成员
//    private int normalNum = 200;
//
//    // 静态内部类
//    public static class StaticInner {
//        public void print() {
//            // 只能访问外部类静态成员
//            System.out.println("外部类静态成员：" + staticNum);
//            // 编译报错：无法访问非静态成员
//            // System.out.println(normalNum);
//        }
//    }
//}
//
//// 实例化方式：不需要外部类对象，直接创建
//public class Test {
//    public static void main(String[] args) {
//        Outer.StaticInner inner = new Outer.StaticInner();
//        inner.print(); // 输出：外部类静态成员：100
//    }
//}


//class Outer {
//    private int outerNum = 10;
//    public void testMethod() {
//        // 方法内的局部变量，事实final（没有被修改）
//        final int localVar = 20;
//
//        // 局部内部类：定义在方法内部
//        class LocalInner {
//            public void print() {
//                // 可以访问外部类成员
//                System.out.println("外部类成员：" + outerNum);
//                // 可以访问方法的final局部变量
//                System.out.println("方法局部变量：" + localVar);
//            }
//        }
//
//        // 只能在当前方法内实例化使用
//        LocalInner localInner = new LocalInner();
//        localInner.print();
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        Outer outer = new Outer();
//        outer.testMethod();
//        // 输出：外部类成员：10 \n 方法局部变量：20
//    }
//}

//interface Greeting {
//    void sayHello();
//}
//
//class Outer {
//    public void test() {
//        // 匿名内部类：直接实现接口，重写方法，同时完成实例化
//        Greeting greeting = new Greeting() {
//            @Override
//            public void sayHello() {
//                System.out.println("匿名内部类实现的打招呼");
//            }
//        };
//        greeting.sayHello();
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        Outer outer = new Outer();
//        outer.test(); // 输出：匿名内部类实现的打招呼
//    }
//}

// 普通父类
//class Animal {
//    public void eat() {
//        System.out.println("动物吃东西");
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        // 匿名内部类：继承Animal类，重写eat方法，同时实例化
//        Animal cat = new Animal() {
//            @Override
//            public void eat() {
//                System.out.println("猫吃鱼");
//            }
//        };
//        cat.eat(); // 输出：猫吃鱼
//    }
//}

//// 抽象父类
//abstract class Calculator {
//    public abstract int calculate(int a, int b);
//}
//
//public class Test {
//    public static void main(String[] args) {
//        // 匿名内部类实现抽象类
//        Calculator add = new Calculator() {
//            @Override
//            public int calculate(int a, int b) {
//                return a + b;
//            }
//        };
//        System.out.println(add.calculate(3,5)); // 输出：8
//    }
//}

//class Person {
//    public String name;
//    public Person(String name) {
//        this.name = name;
//    }
//    public void sayName() {
//        System.out.println("我的名字是：" + name);
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        // 把参数传给父类的构造方法
//        Person person = new Person("小明") {
//            @Override
//            public void sayName() {
//                System.out.println("重写后：我的名字是" + this.name);
//            }
//        };
//        person.sayName(); // 输出：重写后：我的名字是小明
//    }
//}
// 接口定义
interface OnClickListener {
    void onClick();
}

// 工具类方法
class Button {
    public void setOnClickListener(OnClickListener listener) {
        listener.onClick();
    }
}

public class Test {
    public static void main(String[] args) {
        Button btn = new Button();
        // 匿名内部类直接作为方法实参传入
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("按钮被点击了");
            }
        });
    }
}