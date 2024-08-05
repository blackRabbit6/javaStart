package method.ex;

public class MethodEx1Ref {

    public static void main(String[] args) {
        System.out.println("평균값: " + aver(1, 2, 3));
        System.out.println("평균값: " + aver(15, 25, 35));
    }

    public static double aver(int a, int b, int c){
        int sum = a + b + c;
        double aver = sum / 3.0;
        return aver;
    }

}
