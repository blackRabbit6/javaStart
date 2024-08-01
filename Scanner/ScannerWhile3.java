package Scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while(true) {
            System.out.print("정수 입력(0 입력 시 종료): ");
            int num = input.nextInt();

            if(num == 0){
                System.out.println("시스템 종료");
                break;
            }

            sum += num;
        }
        System.out.println("입력한 모든 수의 합: " + sum);
    }
}
