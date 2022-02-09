package wangyf.loop;

public class WhileTest1 {
    public static void main(String[] args) {
        //需求：珠穆朗玛峰高度是8848860毫米，纸张厚度0.1 折叠纸张直到不低于珠穆朗玛峰位置，求折叠几次
        //1、定义变量记录山峰高度，纸张厚度
        double peakHeight = 8848860;
        double paperThickness = 0.1;
        //3、定义一个变量用于记录纸张折叠次数
        int count = 0;
        //2、定义一个while循环控制纸张进行折叠
        while (paperThickness < peakHeight){
            paperThickness *= 2;
            count++;
        }
        System.out.println("折叠的次数是："+count);
        System.out.println("纸张的最终厚度是：" + paperThickness);
    }
}
