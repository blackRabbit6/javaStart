package loop.ex;

public class NestedEx1 {
    public static void main(String[] args) {
//        중첩for문으로 구구단 출력
        for(int i=1; i<=9; i++){
            System.out.println(i+"단 시작");
            for(int j=1; j<=9; j++){
                System.out.println(i+" * "+j+" = "+i*j);
            }
            System.out.println(i+"단 끝");
        }
    }
}
