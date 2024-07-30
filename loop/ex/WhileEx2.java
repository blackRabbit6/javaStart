package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
//        2번 2~20까지 짝수 출력, num 변수 사용
//        1. while
        int num = 0;
        while(num < 20){
            num += 2;
            System.out.println(num);
        }
    }
}
