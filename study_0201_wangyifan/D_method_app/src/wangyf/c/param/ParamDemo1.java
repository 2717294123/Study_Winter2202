package wangyf.c.param;

public class ParamDemo1 {
    public static void main(String[] args) {
        //目标：理解Java的基本类型的参数传递，值传递
        int a = 10;
        change(a);//传递的是值
        System.out.println(a);//10
    }

    public static void change(int a){
        System.out.println(a);//10
        a = 20;
        System.out.println(a);//20
    }
}
