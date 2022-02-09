package wangyf.c.param;

public class Test4 {
    public static void main(String[] args) {
        //需求：从整型数组中查询某个数据的索引返回，不存在该数据返回-10
        //3、定义数组，调用方法
        int[] arr = new int[]{11,28,89,56,24,59,75,15};
        int index = searchIndex(arr,24);
        System.out.println("您查询的数据的索引是：" + index);
    }

    /*
            1、定义一个方法：参数接收数组，要查询的数据，返回值：整型
     */
    public static int searchIndex(int[] arr,int data) {
        //2、开始找出这个数据的索引
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;//查无此元素！
    }
}
