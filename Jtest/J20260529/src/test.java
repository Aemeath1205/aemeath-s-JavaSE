import java.sql.SQLOutput;
import java.util.Scanner;

public class test {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println(str1.toLowerCase());
    }

    static void main2() {
        String str1 = new String("hi cool boy");
        String[] result = str1.split(" ");
        System.out.println(result[result.length-1]);
        }


    static void main1() {
        String str1 = new String("bcadc");
        int[] arr1 = new int[str1.length()];
        for (int i = 0; i < str1.length(); i++){
            for(int j = 0; j < str1.length();j++){
                if(str1.charAt(i)==str1.charAt(j)){
                    arr1[i]++;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]==1){
                System.out.println(str1.charAt(i));
                break;
            }
        }
    }
}
