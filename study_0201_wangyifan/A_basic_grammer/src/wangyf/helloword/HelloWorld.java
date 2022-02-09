package wangyf.helloword;

/**
 * 文档注释：可自动提取到程序说明书中
 *可以写多行
 */

public class HelloWorld {
    public static void main(String[] args) {

        //单行注释
        System.out.println("Hello World!");

        /*
        多行注释
        注释以下代码的功能或用法
         */
        System.out.println("Hello World!");

        double money = 6.0;
        money = money + 4.0;
        System.out.println(money);

        //强制类型转换
        int a = 20;
        byte b = (byte) a;
        System.out.println(a);
        System.out.println(b);

        int i = 1500;
        byte j = (byte) i;
        System.out.println(j);
    }
}




















