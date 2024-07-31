package Scope;

public class Scope2 {
    public static void main(String[] args) {
        // m 생존 시작
        int m = 10;
        for(int i = 0; i < 2; i++){ //블록 내부 for 문 안
            //i 생존 시작
            System.out.println("for m = " + m); //내부에서 외부 접근 가능
            System.out.println("for i = " + i);
        }//i 생존 종료
//        System.out.println("main i = " + i); - 전 예시처럼 i에 접근 불가
        System.out.println("main m = " + m);
    }
}
