public class Test {
    static void main() {

        System.out.println(new Person().age);
    }
    public static void main1(String[] args) {
        int[] array = {1, 2, 3};
        try {
            System.out.println("before");
//            array = null;
            System.out.println(array [100]);
            System.out.println("after");
        } catch (NullPointerException e) {
            System.out.println("这是个空指针异常");
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }
        System.out.println("after try catch");
    }
}
