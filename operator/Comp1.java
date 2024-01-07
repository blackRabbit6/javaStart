package operator;

public class Comp1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        // = -> 대입 연산자, == -> 비교 연산자
        System.out.println( a == b); // false
        System.out.println( a != b); // true
        System.out.println( a > b ); // false
        System.out.println( a < b ); // true
        System.out.println( a >= b); // false
        System.out.println( a <= b); // true

        // 결과를 boolean 변수에 담기
        boolean result = a == b; // false
        System.out.println("result = " + result); // result = false
    }
}
