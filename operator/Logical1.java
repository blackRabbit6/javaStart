package operator;

public class Logical1 {
    public static void main(String[] args) {
        // 논리 연산자
        System.out.println("&&: AND 연산");
        System.out.println(true && true); // 결과: true
        System.out.println(true && false); // 결과: false
        System.out.println(false && false); // 결과: false

        System.out.println("||: OR 연산");
        System.out.println(true || true); // 결과: true
        System.out.println(true || false); // 결과: true
        System.out.println(false || false);  // 결과: false

        System.out.println("! 연산");
        System.out.println(!true); // 결과: false
        System.out.println(!false); // 결과: true

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println( a && b ); // 결과: false
        System.out.println( a || b ); // 결과: true
        System.out.println( !a ); // 결과: false
        System.out.println( !b ); // 결과: true
    }
}
