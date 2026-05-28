package demo5;

public class test {
    public static void main(String[] args) {
        Scorecompare compare1 = new Scorecompare("qhc",90);
        Scorecompare compare2 = new Scorecompare("qhx",91);
//        System.out.println(compare1.compareTo(compare2));
       namecompare t = new namecompare();
        System.out.println(new namecompare().compare(compare1, compare2));
        System.out.println(t.compare(compare1, compare2));

    }
}
