package operator;

public class Operator4 {
    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3; // 계산식 -> (2*2)+(3*3) -> sum3 = 13
        System.out.println("sum3 = " + sum3); // 13
        int sum4 = ( 2 * 2 ) + ( 3 * 3 ); // 이런 식 으로 복합연산 나오면 괄호 사용이 좋음
        System.out.println("sum4 = " + sum4); // sum4 = 13
    }
}
