public class Test {
    public static void main(String[] args) {
        MyArraylist myArraylist1 = new MyArraylist();
        MyArraylist myArraylist2 = new MyArraylist();

        myArraylist1.add(1);
        myArraylist1.add(9);
        myArraylist1.add(2);
        myArraylist1.add(5);

        myArraylist1.set(3,2);

        myArraylist1.display();
    }
}
