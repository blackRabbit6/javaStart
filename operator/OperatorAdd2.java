package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        // 전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;

        b = ++a; // a먼저 증가 시킨 후 -> a, b에 저장
        System.out.println("a = " + a + " ,b = "+ b); // a = 2, b = 2

        // 후위 증감 연산자 사용 예
        a = 1; // a 값을 1로
        b = 0; // b 값을 0로
        b = a++; // a 값을 b에 저장, a 증가 후 증가 값 저장
        System.out.println("a = " + a + " ,b = "+ b); // a = 2, b = 1
    }
}
