import java.util.Scanner;

public class main5
{
    public static void main(String[] args)
    {
//        递归求斐波那契数列的第 N 项
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = task5(n);
        System.out.println(a);
    }
    static int task5(int n)
    {
        if(n==1||n==2)
            return 1;
        return task5(n-1)+task5(n-2);
    }
}
