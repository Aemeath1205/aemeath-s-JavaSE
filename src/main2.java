import java.util.Scanner;

public class main2
{
//    递归求 1 + 2 + 3 + ... + 10
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = task2(n);
        System.out.println(a);
    }
    public static int task2(int n)
    {
        if(n==1)
            return 1;
        return n+task2(n-1);
    }
}
