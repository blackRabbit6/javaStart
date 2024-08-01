package Scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        double average = 0;

        System.out.println("숫자 입력(입력 중단 원할 시 -1 입력): ");
        while(true){
            int num = scanner.nextInt();
            if(num == -1){
                break;
            }
            sum += num;
            count++;

        }
        System.out.println("입력한 수 총합 = " + sum);
        average = (double) sum / count;
        System.out.println("입력한 수들의 평균 = " + average);
    }
}
