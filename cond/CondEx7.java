package cond;

public class CondEx7 {
    public static void main(String[] args) {
        // 문제 7 - 홀 짝
        //  x 가 홀이면 홀수 출력 , 짝 이면 짝수 출력
        // 삼항 연산자 사용
        int x = 7;
        String result = (x%2 == 0) ? "짝수" : "홀수";
        System.out.println("x는 " + x +" 이며 "+ result + " 입니다.");
    }
}
