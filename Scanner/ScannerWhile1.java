package Scanner;

import java.util.Scanner;

public class ScannerWhile1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("문자열 입력(종료: exit): ");
            String str = scanner.nextLine();

            if(str.equals("exit")){
                System.out.println("시스템 종료");
                break;
            }

            System.out.println("입력한 문자열: " + str);
        }
    }
}
