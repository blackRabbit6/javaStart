package Scanner.ex;

public class ChangeVarEx {

    public static void main(String[] args) {
        //변수값 교환 a->b로 b->a

        int a = 10;
        int b = 20;
        // 결과 a=20, b=10

        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
