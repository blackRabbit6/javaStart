package loop.ex;

public class ForEx3 {
    public static void main(String[] args) {
//        3번 누적 합 계산 1~max까지 합, sum 변수 사용 누적 합 표현, i 변수 사용해 카운트 수행
//        2. for
        int max = 100;
        int sum = 0;
        for(int i = 1; i<=max; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
