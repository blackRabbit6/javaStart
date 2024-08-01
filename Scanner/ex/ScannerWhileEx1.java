package Scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.print("이름(종료 입력 시 종료): ");
            String name = scanner.nextLine();
            if(name.equals("종료")){
                System.out.println("프로그램 종료");
                break;
            }

            System.out.print("나이: ");
            int age = scanner.nextInt();
            scanner.nextLine(); //줄바꿈 처리

            System.out.print("입력한 이름: " + name + ", 나이: " + age);

        }
    }
}
