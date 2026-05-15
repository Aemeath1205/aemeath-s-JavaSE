public class Main
{
    public static void main(String[] args)
    {
//        test1();
//        test2();
//        test3();
//        test4();
        test5();
    }
//            打印 1 - 100 之间所有的素数
    static void test1()
    {
        System.out.println(1);
        for (int i = 2;i<=100;i++)
        {
            int sum = 0;
            for(int j = 1;j<i;j++)
            {
                if(i%j==0)
                {
                    sum++;
                }
            }
            if (sum==1)
                System.out.println(i);
        }
    }
//    输出 1000 - 2000 之间所有的闰年
    static void test2()
    {
        for (int i = 1000;i<=2000;i++)
        {
            if((i%4==0&&i%100!=0)||i%400==0)
            {
                System.out.println(i);
            }
        }
    }
//    编写程序数一下 1到 100 的所有整数中出现多少个数字9
    static void test3()
    {
        int sum = 0;
        for (int i = 1;i<=100;i++)
        {
            if(i%10==9)
            {
                sum++;
            }
            if (i/10 ==9)
            {
                sum++;
            }
        }
        System.out.println(sum);
    }
//    给定两个数，求这两个数的最大公约数
//    例如：
//    输入：20 40
//    输出：20
    static void test4()
    {
        int a = 20;
        int b = 40;
        for(int i = a;i>=1;i--)
        {
            if(a%i==0&&b%i==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
//    计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值    。
    static void test5()
    {
        double a = 0;
        for(double i =1;i<=100;i++)
        {
            a+=1/i;
        }
        System.out.println(a);
    }
//    求出0～n之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本 身，如；153＝1^3＋5^3＋3^3，则153是一个“水仙花数“。）
//    static void test6()
//    {
//        for(int a = 100;a<1000;a++)
//        {
//            if(a%10)
//        }
//    }
//}