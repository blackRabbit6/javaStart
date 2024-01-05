package operator;

public class Operator1 {
    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        //덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); //출력 a + b = 7
        System.out.println("sum = " + sum); //출력 sum = 7

        //뺄셈
        int dif = a - b;
        System.out.println("a - b =  " + dif); //출력: a - b = 3
        System.out.println("dif = " + dif); //출력:dif = 3

        //곱셈
        int mul = a * b;
        System.out.println("a * b = " + mul); //출력: a * b = 10
        System.out.println("mul = " + mul); //출력: mul = 10

        //나눗셈
        int div = a / b;
        System.out.println("a / b = " + div); //출력: a / b = 2
        System.out.println("div = " + div); //출력: div = 2

        //나머지
        int mod = a % b;
        System.out.println("a % b = " + mod); //출력: a % b =1
        System.out.println("mod = " + mod); //출력: mod =1
    }
}
