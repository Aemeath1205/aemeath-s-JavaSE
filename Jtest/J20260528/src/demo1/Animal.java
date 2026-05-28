package demo1;

public class Animal {
    public String name;
    public int age;
    public static int height = 1;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println(name+"在吃饭");
    }
    public void say(){
        System.out.println(age+"的"+name+"说话");
    }
    public static void heightshow(){


    }
}
