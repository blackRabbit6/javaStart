package method;

public class MethodValue1 {

    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. 보내기 전 num1 = " + num1);
        changNum(num1);
        System.out.println("4. 보낸 후 num1 = " + num1);
    }

    public static void changNum(int num2){
        System.out.println("2. 변경 전 num2 = " + num2);
        num2 = num2 * 2;
        System.out.println("3. 변한 후 num2 = " + num2);
    }

}
