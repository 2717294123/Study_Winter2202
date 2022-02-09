package wangyf.loop;

public class BreakAndContinueDemo {
    public static void main(String[] args) {
        //目标：理解break和continue的作用
        //场景：假如你又有对象了，然后你又犯错了，你对象罚你做五天家务，每天都是洗碗，但是洗完到底三天后心软了，不罚了
        for (int i = 0;i < 5;i++){
            System.out.println("快乐的洗碗~~");
            if (i == 2){
                break;//跳出并结束当次循环的执行~~
            }
        }

        //continue跳出当前循环的当次执行，进入循环的下一次
        //场景：加入你又有对象了，然后你又双犯错了，你对象罚你做5天家务
        //每天都是洗碗，但是洗完到底三天后心软了，原谅你不用洗了，但是依旧不解恨，继续洗第四天第五天
        for (int i= 1;i <= 5;i++){
            if (i == 3){
                continue;//立即跳出当次执行，进入循环的下一次！
            }
            System.out.println("洗碗：" + i);
        }
    }
}
