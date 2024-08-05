package method;

public class MethodCasting1 {

    public static void main(String[] args) {
        double number = 1.5;
//        printNumber(number); 오류 이유: 매서드가 받아야되는건 int인데, 현재 number의 형은 double이기 때문
        printNumber((int) number); // double -> int 형변환
    }

    public static void printNumber(int n){
        System.out.println("숫자: " + n);
    }
}
