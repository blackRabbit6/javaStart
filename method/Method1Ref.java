package method;

public class Method1Ref {

    public static void main(String[] args) {
        int sum1 = add(5, 10);
        System.out.println("결과1 = " + sum1);

        int sum2 = add(10, 40);
        System.out.println("결과2 = " + sum2);
    }

    // add 매세드(함수)
    public static int add(int a, int b){
        System.out.println(a + " +" + b +" 시작");
        int sum = a + b;
        return sum;
    }
}
