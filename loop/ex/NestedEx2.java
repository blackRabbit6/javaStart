package loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {
//        2번 피라미드 int rows 선언 print() 사용
        int rows = 5;
        for(int i=1; i<= rows; i++){
            for(int j=1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
