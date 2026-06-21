public class Test {
    static void main() {
        MyStack myStack = new MyStack();
        System.out.println(myStack.used_size);
        myStack.push(1);
        myStack.pop();
        System.out.println(myStack.peek());
        System.out.println(myStack.size());

    }
}
