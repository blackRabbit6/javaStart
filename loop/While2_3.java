package loop;

public class While2_3 {
    public static void main(String[] args) {
        // 기존 문제 와 같지만 하나의 조건이 더 추가됨
        // endNum이라는 마지막 수의 변수 선언하고 i~endNum까지 더해라
        int i = 1;
        int endNum = 10;
        int sum = 0;

        while( i <= endNum){
            sum = sum + i;
            System.out.println("i = " + i + ",sum = " + sum);
            i++;
            // 결과 i = 1~10까지 나오고 그에 관한 값들이 나와 마지막에 i=10, sum=55가 나오면 정답이다
        }
    }
}
