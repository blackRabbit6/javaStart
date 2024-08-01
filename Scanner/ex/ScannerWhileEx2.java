package Scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("상품 가격 입력(-1 입력 시 종료): ");
            int price = scanner.nextInt();
            if(price == -1){
                System.out.println("종료");
                break;
            }

            System.out.print("구매 수량 입력: ");
            int quantity = scanner.nextInt();

            int cost = price * quantity;
            System.out.println("총 비용: " + cost);

        }
    }
}
