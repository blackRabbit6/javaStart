package Scanner;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째와 두 번째 수 둘 다 0 입력하면 시스템 종료");

        while(true){
            System.out.print("첫 번째 수: ");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 수: ");
            int num2 = scanner.nextInt();

            if(num1 == 0 && num2 == 0){
                System.out.println("시스템 종료");
                break;
            }

            int result = num1 + num2;
            System.out.println("두 수의 합: " + result);
        }
    }
}
