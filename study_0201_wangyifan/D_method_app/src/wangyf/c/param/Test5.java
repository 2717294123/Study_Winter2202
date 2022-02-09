package wangyf.c.param;

public class Test5 {
    public static void main(String[] args) {
        //需求：比较任意2个整型数组的内容是否一样，一样返回true，反之
        int[] arr1 = new int[]{10,120,30};
        int[] arr2 = new int[]{10,20,30};
        System.out.println(compare(arr1, arr2));
    }

    /*
           1、定义一个方法：参数：接受2个整型数组，返回值类型：布尔类型
     */
    public static boolean compare(int[] arr1,int[] arr2){
        //2、判断2个数组的内容是否是一样的呢
        if (arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i] != arr2[i]){
                    return false;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }
}
