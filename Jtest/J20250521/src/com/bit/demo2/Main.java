package com.bit.demo2;
import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            Sub sub = new Sub(x, y, z);
            System.out.println(sub.calculate());
        }
    }

}

class Base {

    public int x;
    public int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

class Sub extends Base {

    public int z;

    public Sub(int x , int y , int z) {
        super.x = x;
        super.y = y;
        this.z = z;
        //write your code here
    }

    public int getZ() {
        return z;
    }

    public int calculate() {
        return super.getX() * super.getY() * this.getZ();
    }

}
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextInt()) {
//            int x = scanner.nextInt();
//            int y = scanner.nextInt();
//            Data data = new Data(x, y);
//            System.out.println(data.getX() + data.getY());
//        }
//    }
//
//}
//
//class Data {
//
//    private int x;
//    private int y;
//
//    public Data(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public int getX() {
//        return x;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//}