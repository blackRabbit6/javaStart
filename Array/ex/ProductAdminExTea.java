package Array.ex;

import java.util.Scanner;

public class ProductAdminExTea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        //변수명 똑같은걸 바꾸는 법 = shift+f6
        int productCount = 0;
//        int productCount = 10; 10으로 바꾸니 더이상 상품 등록 불가라고 잘뜸

        while(true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3 . 종료");
            System.out.print("메뉴를 선택하세요: ");
            int menus = scanner.nextInt();
            scanner.nextLine();

            if(menus == 1){
                if(productCount >= maxProducts){
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요: ");
                productNames[productCount] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요: ");
                productPrices[productCount] = scanner.nextInt();

                productCount++;

            } else if (menus == 2) {
                if (productCount == 0){
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                // 반복문
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " +productPrices[i]);
                }
            } else if (menus == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        }

    }
}
