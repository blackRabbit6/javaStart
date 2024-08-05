package method.ex;

import java.util.Scanner;

public class MethodEx4Tea {

    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);
        // 나와는 다르게 switch 문 활용함
        while (true){
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4. 종료");
            System.out.println("---------------------------------");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            int amount;


            // 1,2,3 눌렀을 때 break를 만나면 스위치문은 종료지만 while 루프는 계속 작동하기에 다시 선택가능
            // 4 눌렀을 때 return을 만났기에, 현재 메서드인 main 메서드를 종료하고 호출하는 곳으로 가기에 시스템 종료
            switch (choice){
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = withdraw(balance, amount);
                    break;
                case 3:
                    System.out.println("현재 잔액: " + balance + "원");
                    break;
                case 4:
                    System.out.println("시스템 종료");
                    return;
                default:
                    System.out.println("잘못된 번호이니 다시 입력하세요.");
            }

        }


    }

    public static int deposit(int balance, int amount){
        balance += amount;
        System.out.println(amount + "원 입금. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println(amount + "원 출금. 현재 잔액: " + balance + "원");
        }else{
            System.out.println(amount + "원 출금 실패. 잔액 부족");
            System.out.println("현재 잔액: " + balance + "원");
        }
        return balance;
    }

}
