public class Test {
    static void main() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(0);
        linkedList.add(6);
        linkedList.add(9);
        linkedList.add(2);
        linkedList.display();
        linkedList.add(2,3);
        linkedList.display();
    }
}
