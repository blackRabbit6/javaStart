package Scope;

public class Scope1 {
    public static void main(String[] args) {
        // m 생존 시작
        int m = 10;

        if(true){
            int x = 20; // x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 생존 종료

//        System.out.println("main m = " + m); -> x는 생존하지 않았기 때문에 오류
        System.out.println("main m = " + m);

    } // m 생존 종료
}
