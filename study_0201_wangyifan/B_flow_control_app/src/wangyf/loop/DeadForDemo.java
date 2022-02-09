package wangyf.loop;

import java.util.Scanner;

public class DeadForDemo {
    public static void main(String[] args) {
        //1、定义正确的密码
        int okPassword = 520;
        //2、定义一个死循环让用户不断的输入密码认证
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请您输入正确的密码：");
            int password = sc.nextInt();
            //3、使用if判断密码是否正确
            if (password == okPassword){
                System.out.println("登陆成功了~~");
                break;//可以立即结束当前所在循环的执行
            }
            else {
                System.out.println("密码错误！");
            }
        }
    }
}
