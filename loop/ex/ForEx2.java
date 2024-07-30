package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
//        2번 2~20까지 짝수 출력, num 변수 사용
//        2. for
//        for(int num = 2; num<=20; num+=2){
//            System.out.println(num);
//        }
//        교수님 좋은 코드
        int num = 2;
        for(int count = 1; count <= 10; count++){
            System.out.println(num);
            num += 2;
        }
    }
}
