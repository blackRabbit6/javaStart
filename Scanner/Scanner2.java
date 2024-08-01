package Scanner;

import java.util.Scanner;

public class Scanner2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 수: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 수: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("두 수 합: " + sum);
    }
}
