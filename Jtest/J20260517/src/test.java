import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class test {
//    实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
//        并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[]{1,2,3,4,5};
        transform(array1);
        System.out.println(Arrays.toString(array1));
    }
    public static void transform(int[] array1 ){

        for(int i = 0; i < array1.length; i++){
            array1[i] *= 2;
        }
    }
//    调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
//
//    如数组：[1,2,3,4,5,6]
//
//   调整后可能是：[1, 5, 3, 4, 2, 6]
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = {1,2,3,4,5};
        transform1(array1);
        System.out.println(Arrays.toString(array1));
}
    public static void transform1(int[] arrary1){
        int count = 0;
        for(int i = 0; i < arrary1.length; i++){
            if(arrary1[i]%2!=0){
                int temp = arrary1[count];
                arrary1[count] = arrary1[i];
                arrary1[i] = temp;
                count++;
            }
        }
    }

    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array2 =new int[]{1,2,3,4,5};
        int n = sc.nextInt();
        transform2(array2,n);
    }
    public static void transform2(int[] arrary2,int n){
        int left = 0;
        int right = arrary2.length-1;
        while(left<right){
            int mid = (left+right)/2;
            if(arrary2[mid]==n){
                System.out.println("找到了！在第"+(mid+1)+"个");
                break;
            }
            else if(arrary2[mid]>n){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        if(left==right){
            System.out.println("没找到!");
        }
    }

    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array3 = new int[]{2,3,1,4,5};
        tranform3(array3);
        System.out.println(Arrays.toString(array3));
    }
    public static void tranform3(int[] array3){
        for(int i = 0; i < array3.length; i++){
            for(int j = 0; j < i; j++){
                if(array3[i]<array3[j]){
                    int temp = array3[i];
                    array3[i] = array3[j];
                    array3[j] = temp;
                }
            }
        }
    }
//    给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
//    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
//    你可以按任意顺序返回答案。
//    示例 1：
//    输入：nums = [2,7,11,15], target = 9
//
//    输出：[0,1]
//
//    解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        int[] array4 = new int[]{1,2,3,4,5};
        tranform4(array4,n);
    }
    public static void tranform4(int[] array4, int n){
        for(int i = 0; i < array4.length; i++){
            for(int j = i+1; j < array4.length; j++){
                if(array4[i]+array4[j]==n){
                    System.out.println("找到了！！！且下标分别为"+i+"和"+j);
                }
            }
        }
    }
//    给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//    示例 1:
//    输入: [2,2,1]
//    输出: 1
//
//    示例 2:
//    输入: [4,1,2,1,2]
//    输出: 4
    public static void main6(String[] args) {
        int[] array1 = new int[]{1,1,2,3,4,5,5};
        transform5(array1);
}
    public static void transform5(int[] array1){
        for(int i = 0; i < array1.length; i++){
            int count = 0;
            for(int j = 0;j < array1.length; j++){
                if(array1[i]==array1[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(array1[i]);
            }
        }
    }
//    给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
//    你可以假设数组是非空的，并且给定的数组总是存在多数元素。
//    示例 1：
//    输入：[3,2,3]
//    输出：3
//
//    示例 2：
//    输入：[2,2,1,1,1,2,2]
//    输出：2
    public static void main7(String[] args) {
        System.out.println("n的值为:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        int[] array1 = new int[n];
        System.out.println("请输入"+n+"个数");
        for(int i = 0; i < n; i++){
            array1[i] = sc.nextInt();
        }
        transform6(array1);
    }
    public static void transform6(int[] array1){
        int temp = array1[array1.length/2];
        for(int i = 0; i < array1.length; i++){
            int count = 0;
            for(int j = 0; j < array1.length; j++){
                if(array1[i]==array1[j]&&i!=j){
                    count++;
                }
            }
            if(count>temp){
                System.out.println(array1[i]);
            }
        }
    }
//    给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：如果存在，请返回 true ；否则，返回 false 。
//    示例 1：
//    输入：arr = [2,6,4,1]
//    输出：false
//    解释：不存在连续三个元素都是奇数的情况。
//
//    示例 2：
//    输入：arr = [1,2,34,3,4,5,7,23,12]
//    输出：true
//    解释：存在连续三个元素都是奇数的情况，即 [5,7,23] 。
    public static void main(String[] args) {
        int[] array1 = new int[]{1,3,5,2,3};
        transform8(array1);
    }
    public static void transform8(int[] array1){
        int count = 0;
        for(int i = 0; i < array1.length-3; i++){
            if(array1[i]%2!=0&&array1[i+1]%2!=0&&array1[i+2]%2!=0){
                System.out.println("True");
                count++;
            }
        }
        if(count==0){
            System.out.println("False");
        }
    }
}


