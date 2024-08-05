package method;

public class Overloading3 {

    public static void main(String[] args) {
        // 첫번째 메서드가 없어져도 1,3 번의 int -> double로 변환되어 작동되지만
        // 두번째 메서드가 없어지면 오류가 나타남 double -> int로 자동 변환이 안되기 때문(크기 때문에)
        System.out.println("1: " + add(1, 2) );
        System.out.println("2: " + add(1.5, 2.5) );
        System.out.println("3: " + add(1, 4));
    }

    public static int add(int a, int b){
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add(double a, double b){
        System.out.println("2번 호출");
        return a + b;
    }
}
