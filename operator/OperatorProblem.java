package operator;

public class OperatorProblem {
    public static void main(String[] args) {
        //문제1
        // num1, num2, num3 -> int 변수 선언 , 10,20,30으로 초기화
        // 세 변수 합 - sum에 저장
        // 세 변수 평균 = average에 저장(int) 소수점 이하 결과 버리기
        // 합, 평균 값 출력
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        
        int sum = num1 + num2 + num3;
        int average = sum / 3;
        System.out.println("합 = " + sum); // 합 = 60
        System.out.println("평균 = " + average); // 평균 = 20

        // 문제2
        // double 변수 선언 및 초기회 -> 그 뒤의 문제는 같음
        double val1 = 1.5;
        double val2 = 2.5;
        double val3 = 3.5;

        double sum2 = val1 + val2 + val3;
        double avg = sum2 / 3;
        System.out.println("합 = " + sum2); // 합 = 7.5
        System.out.println("평균 = " + avg); // 평균 = 2.5

        // 문제3
        // int 형 변수 score 선언
        // 80<=score<=100 -> true, 조건에 맞지 않으면 false
        int score = 80;
        boolean result = 80 <= score  && score <= 100;
        System.out.println("result = " + result); // result = true
    }
}
