package wangyf.c.demo;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //需求： 5 个 1 - 20 之间的随机数，让用户猜测，猜中要提示猜中，还要输出该数据在数组中第一次出现的索引，并打印数组的内容出来
        //没有猜中继续

        //1、定义一个动态初始化的数组存储5个随机的 1 - 20 之间的数据
        int[] data = new int[5];

        //2、动态的生成 5 个 1 - 20 之间的随机数并入到数组中去
        Random r = new Random();
        for (int i = 0; i < data.length; i++) {
            // i = 0 1 2 3 4
            data[i] = r.nextInt(20) + 1;
        }

        //3、使用一个死循环让用户进行猜测
        Scanner sc = new Scanner(System.in);
        OUT:
        while (true){
            System.out.println("请你输入一个 1 - 20 之间的整数进行猜测：");
            int guessData = sc.nextInt();

            //4、遍历数组的每个数据，看是否有数据与猜测的数据相同，相同代表猜中了，给出提示
            for (int i = 0; i < data.length; i++) {
                if (data[i] == guessData){
                    System.out.println("您已经猜中了，运气不错！您猜中的数据索引是：" + i);
                    break OUT;//结束整个死循环（while循环），代表游戏结束了！
                }
            }
            System.out.println("当前猜测的数据不存在，请重新猜测！");
        }

        //5、输出数组的全部元素，让用户看到自己确实猜中了某个数据。
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
    }
}