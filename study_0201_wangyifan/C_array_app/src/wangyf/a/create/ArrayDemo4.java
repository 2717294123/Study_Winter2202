package wangyf.a.create;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //目标：掌握动态初始化数组元素默认值的规则
        //1、整型数组的元素默认值都是0
        int[] arr = new int[10];
        System.out.println(arr[0]);
        System.out.println(arr[9]);

        //2、字符数组的元素默认值是0
        char[] chars = new char[1000];
        System.out.println(chars[0]);
        System.out.println(chars[99]);
        System.out.println((int) chars[0]);
        System.out.println((int) chars[99]);

        //3、浮点型数组元素默认值是0.0
        double[] scores = new double[100];
        System.out.println(scores[0]);
        System.out.println(scores[99]);

        //4、布尔类型数组
        boolean[] booleans = new boolean[100];
        System.out.println(booleans[0]);
        System.out.println(booleans[99]);

        //5、引用类型数组
        String[] names = new String[100];
        System.out.println(names[0]);
        System.out.println(names[99]);
    }
}
