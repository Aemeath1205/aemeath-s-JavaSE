import java.util.Scanner;

public class main6
{
    public static void main(String[] args)
    {
//        递归求解汉诺塔问题
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        task6(n,'a','b','c');
    }
    public static void task6(int n,char a,char b,char c)
    {
        if(n==1){
            move(a,c);
            return;
        }
        task6(n-1,a,c,b);
        move(a,c);
        task6(n-1,b,a,c);
    }
    public static void move(char a,char c)
    {
        System.out.println(a+"-->"+c);
    }
}
