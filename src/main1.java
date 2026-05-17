import java.util.Scanner;

public class main1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        System.out.println(task1(num));
        input.close();
    }
    public static int task1(int n)
    {
//        递归求 N 的阶乘
        int a = 0;
        if(n==1)
        {
            return 1;
        }
        a = n*task1(n-1);
        return a;
    }
}
