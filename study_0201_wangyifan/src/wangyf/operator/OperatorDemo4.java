package wangyf.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        //目标：学会使用自增自减运算符： ++ ，--
        int a = 10;
        a++;//a = a + 1
        ++a;
        System.out.println(a);
        a--;//a = a - 1
        --a;
        System.out.println(a);
        ;
        System.out.println("-------------------");

        //在表达式或者不是单独操作的情况，++，--在变量前后存在区别
        // ++ -- 在变量前面，先+1，-1 再使用。
        int i = 10;
        int j = ++i;//先给i加了之后再赋值给j
        System.out.println(i);//11
        System.out.println(j);//11

        int m = 10;
        int n = m++;//先把m赋值给n，再给m加1
        System.out.println(m);
        System.out.println(n);

        System.out.println("------------拓展案例---------------");
        int k = 3;
        int p = 5;
        //k  3  4  5  4
        //p  5  4  3  4
        //rs 3  +  5  -  4  +  4  -  5  +  4  +  2 == 9
        int rs = k++ + ++k - --p + p-- - k-- + ++p + 2;
        System.out.println(k);//4
        System.out.println(p);//4
        System.out.println(rs);//9

    }
}
