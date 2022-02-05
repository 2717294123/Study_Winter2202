package wangyf.operator;

public class OperatorTest2 {
    public static void main(String[] args) {

        //需求：拆分三位数，把个位十位百位分别输出
        int data = 359;

        //1.个位
        int ge = data%10;
        System.out.println(ge);

        //2.十位
        int shi = data/10%10;
        System.out.println(shi);

        //3.百位
        int bai = data / 100;
        System.out.println(bai);

    }
}
