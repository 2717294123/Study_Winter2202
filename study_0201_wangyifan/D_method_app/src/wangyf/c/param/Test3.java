package wangyf.c.param;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //需求：打印任意整型数组的内容
        int[] ages = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            ages[i] = sc.nextInt();
        }

        printArray(ages);

        System.out.println("------------------");
        int[] years = null;
        printArray(years);
    }

    public static void printArray(int[] arr){
        System.out.print("[");

        if(arr != null && arr.length > 0){

            for (int i = 0; i < arr.length; i++) {
            /*
            if(i == arr.length - 1){
                System.out.print(arr[i]);
            }
            else {
                System.out.print(arr[i] + "，");
            }
            */
                System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + "，");
            }

        }

        System.out.println("]");

    }
}
