package wangyf.a.create;

/**
 *      目标：能够说出使用 方法 的优点；
 *           1、可以提高代码的复用性和开发效率
 *           2、让程序的逻辑更清晰
 */

public class MethodDemo1 {
    public static void main(String[] args) {
        //张工
        /*
        int a = 10;
        int b = 30;
        int c = a + b;
        System.out.println(c);
        */
        int c1 = sum(10,30);
        System.out.println(c1);

        //徐工
        /*
        int a1 = 10;
        int b1 = 30;
        int c1 = a1 + b1;
        System.out.println(c1);
         */
        int c2 = sum(10,20);
        System.out.println(c2);
    }

    public static int sum(int a,int b){
        return a + b;
    }
}
