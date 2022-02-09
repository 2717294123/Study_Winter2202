package wangyf.a.create;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //目标：学会使用静态初始化的方式定义数组
        //数组类型[] 数组名称 = new 数据类型[] {元素1，元素2,....}

        //数组变量名中存储的是数组在内存中的地址，数组是引用类型。

        //double[] scores = new double[] {99.5,88.0,75.5};
        double[] scores = {99.5, 88.0, 75.5};//简化写法

        //int[] ages = new int[]{12 , 14 , 24};
        int[] ages = {12 , 14 , 24};

        //String[] names = new String[]{"张三","李四","王五"};
        String[] names = {"张三","李四","王五"};

        System.out.println(scores);
    }
}
