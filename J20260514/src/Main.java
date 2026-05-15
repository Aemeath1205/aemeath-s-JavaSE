import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
//        task1();
//        task2();
//        task3();
        sum(1,2);
        sum(1,2,5);
    }
    public  static void task1()
    {
//        输出一个整数的每一位，如：123的每一位是3，2，1
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while(num!=0)
        {
            int mid = num%10;
            num = num/10;
            System.out.println(mid);
        }
    }
    public static void task2()
    {
//        编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
        int key = 123;
        Scanner scanner = new Scanner(System.in);
        int mid2 = 0;
        while(mid2<3)
        {
            System.out.println("请输入三位密码");
            int num = scanner.nextInt();
            int mid = key;
            for(int i = 0;i<3;i++)
            {
                if(num%10!=mid%10)
                {
                    mid2 ++;
                    break;
                }

                mid /= 10;
                num /= 10;
            }
            if(mid2==0)
                break;
        }
        scanner.close();
    }
    public static void task3()
    {
//        求1！+2！+3！+4！+........+n!的和
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for(int i = 1;i<=num;i++)
        {
            int mid = 1;
            for(int j = 1;j<=i;j++)
            {
                mid *= j;
            }
            sum += mid;
        }
        System.out.println(sum);
    }
//    在同一个类中定义多个方法：要求不仅可以求2个整数的最大值，还可以求3个小数的最大值？
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static int sum(int a,int b,int c)
    {
        return a+b+c;
    }
}