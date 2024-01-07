package cond;

public class CondEx6 {
    public static void main(String[] args) {
        // 문제 6 - 더 큰 수 찾기
        //  a = 10, b = 20
        // 삼항 연산자 사용에서 더 큰 수 출력

        int a = 60;
        int b = 20;
        int big = (a > b) ? a : b;
        System.out.println("더 큰 수 = " + big + " 입니다.");
    }
}
