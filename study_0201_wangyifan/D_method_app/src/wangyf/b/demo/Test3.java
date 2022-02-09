package wangyf.b.demo;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //  需求：使用方法，支持找出任意整数型数组的最大值返回。
        int[] ages = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
        }
        System.out.println("您输入的数据中最大值是：" + getArrayMaxData(ages));
    }

    public static int getArrayMaxData(int[] arr){
        //找出数组的最大值返回
        int max = arr[0];
        //遍历数组的每个元素与最大值的数据进行比较，若较大则替换
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
