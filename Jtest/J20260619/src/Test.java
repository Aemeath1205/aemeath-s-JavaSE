public class Test {
    static void main() {
        MyLinkedList list1 = new MyLinkedList();
        list1.addLast(2);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(4);
        list1.addLast(5);
        list1.addLast(6);
        list1.addLast(6);

        list1.display();
        list1.removeAllKey(6);
        System.out.println();
        list1.display();
        System.out.println();
        System.out.println(list1.size());
        list1.clear();
        list1.display();
//        System.out.println(list1.contains(1));

    }
}
