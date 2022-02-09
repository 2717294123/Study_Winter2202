package wangyf.operator;

public class OperatorDemo9 {
    public static void main(String[] args) {
        //目标：康康Java是否存在优先级，以后需要注意优先级问题
        System.out.println(10 > 3 || 10 > 3 && 10 < 3);//true
        System.out.println((10 > 3 || 10 > 3) && 10 < 3);//false
    }
}
