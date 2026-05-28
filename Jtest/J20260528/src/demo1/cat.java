package demo1;

public class cat extends Animal {
    public String color;

   public cat(String name, int age, String color) {
       super(name, age);
       this.color = color;
       super.height = 2;
   }
   public void sleep(){
       System.out.println("sleep");
   }

    @Override
    public void say() {
        System.out.println("这是重写的say方法"+color);
        super.say();
        dog.a();
    }

    @Override
    public void eat() {
        System.out.println("这是重写的eat方法"+color);
    }
    public static void heightshow(){

    }
}
