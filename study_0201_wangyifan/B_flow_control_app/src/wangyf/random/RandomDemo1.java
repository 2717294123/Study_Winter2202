package wangyf.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {
        //目标：学会使用Java提供的随机数类Random
        //1、导包
        //2、创建随机数对象
        Random r = new Random();

        //3、调用nextInt功能（方法）可以返回一个整型的随机数给你,只能生成：0 - （n-1）之间的随机数，
        for (int i = 0;i<20;i++) {
            int data = r.nextInt(10);//0-9不包含10的（包前不包后）
            System.out.print(data+"\t");
        }
        System.out.println();
        for (int j = 0;j<20;j++) {
            int data1 = r.nextInt(10) + 1;//1 - 10之间
            System.out.print(data1 + "\t");
        }
        //减加法，先减再加
        //1 - 10 ==> -1 ==> (0 - 9) + 1
        //3 - 17 ==> -3 ==> (0 - 14) + 3
    }
}
