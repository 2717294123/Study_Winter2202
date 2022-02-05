package wangyf.operator;

public class OperatorDemo8 {
    public static void main(String[] args) {
        //目标：学会使用三元运算符，理解其流程
        double score = 98;
        String rs = score >= 60 ? "考试通过" : "挂科";//条件符合则为第一个结果，不符合则为第二个结果
        System.out.println(rs);

        //需求：需要从两个整数中找出较大值
        int a = 10;
        int b = 2000;
        int max =  a > b ? a : b;
        System.out.println(max);

        System.out.println("----------拓展知识------------");
        int i = 10;
        int j = 20;
        int k = 30;
        int rsmax = i > j ? i > k ? i : k : j > k ? j : k;
        System.out.println(rsmax);

    }

}