package demo6;

public class test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = animal.clone();
        System.out.println(animal == animal2);
    }
}
