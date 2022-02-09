package wangyf.c.param;

public class ParamDemo2 {
    public static void main(String[] args) {
        //目标：理解引用类型的参数传递机制：值传递，区分其不同点
        int[] arrs = new int[]{10 , 20 , 30};
        change(arrs);//传递的是地址
        System.out.println(arrs[1]);//222
    }

    public static void change(int[] arrs){
        System.out.println(arrs[1]);//20
        arrs[1] = 222;
        System.out.println(arrs[1]);//222
    }
}
