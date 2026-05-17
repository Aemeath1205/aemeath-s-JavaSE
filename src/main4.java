import java.util.Scanner;

public class main4
{
    public static void main(String[] args)
    {
//        写一个递归方法，输入一个非负整数，返回组成它的数字之和
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(task4(n));
    }
    public static int task4(int n)
    {
        if(n<=9)
        {
            return n;
        }
        return n%10+task4(n/10);
    }
}
