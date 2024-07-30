package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
//        3번 누적 합 계산 1~max까지 합, sum 변수 사용 누적 합 표현, i 변수 사용해 카운트 수행
//        1. while
        int max = 100;
        int sum = 0;
        int i = 1;
        while(i <= max){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
