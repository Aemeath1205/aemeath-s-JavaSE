import java.util.Scanner;

public class main3
{
//    按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)    （递归）
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        task3(n);
    }
    public static void task3(int n)
    {
        if(n>9)
        {
            System.out.print(n/10);
        }
        System.out.println(n%10);
    }
}

