package demo1;

public class test {
    static void main() {
        cat cat1 = new cat("v",18,"yellow");
//        cat1.say();
        cat cat2 = new cat("qhc",5,"yellopw");
//        cat2.eat();
        Animal.height = 3;
        cat1.height = 4;
        cat.height = 5;
        cat1.say();
    }

}
