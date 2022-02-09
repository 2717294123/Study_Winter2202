package wangyf.b.traverse;

public class ArrayDemo {
    public static void main(String[] args) {
        //目标：学会数组元素的遍历
        int[] arr = new int[]{12,24,12,48,93};
        //                              0   1    2   3   4

        //原始遍历方式
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //循环遍历
        for (int i = 0;i < 5;i++){
            System.out.println(arr[i]);
        }
        
        //常用方式
        for (int j = 0; j < arr.length; j++){
            System.out.println(arr[j]);
        }
        
        //快捷方式：  数组名.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
