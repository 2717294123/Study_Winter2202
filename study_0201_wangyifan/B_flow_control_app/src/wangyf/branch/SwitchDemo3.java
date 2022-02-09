package wangyf.branch;

public class SwitchDemo3 {
    public static void main(String[] args) {
        //需求：用户输入月份可以展示该月份的天数
        //1、3、5、7、8、10、12月份为31天
        //2月份闰年是29天，非闰年为28天。
        //4、6、9、11月份是30天
        int month = 2;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "月是31天！");
                break;
            case 2:
                System.out.println(month + "月闰年是29天，非闰年是28天！");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "月是30天！");
                break;
            default:
                System.out.println("数据有误");
        }
    }
}
