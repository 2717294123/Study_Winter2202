package wangyf.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        //1、随机一个幸运号码 1 - 100 之间  （0 - 99 ） + 1
        Random r = new Random();
        int luckNumber = r.nextInt(100) + 1;

        //2、使用一个死循环让用户不断地去猜测，并给出提示
        Scanner sc = new Scanner(System.in);
        while (true){
            //让用户输入数据猜测
            System.out.println("请你输入猜测数据（1 - 100）：");
            int guessNumber = sc.nextInt();

            //3、判断这个猜测的号码与幸运号码的大小情况
            if (guessNumber > luckNumber){
                System.out.println("您输入的数过大，请重新输入！");
            }
            else if (guessNumber < luckNumber){
                System.out.println("您输入的数过小，请重新输入！");
            }
            else {
                System.out.println("您猜对了！~~");
                break;//直接跳出并结束当前死循环！！
            }

        }
    }
}
