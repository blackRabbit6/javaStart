package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4. 종료");
            System.out.println("---------------------------------");
            System.out.print("선택: ");
            int nums = scanner.nextInt();

            if (nums == 1){
                System.out.print("입금액을 입력하세요: ");
                int amount = scanner.nextInt();
                balance = deposit(balance, amount);
            } else if (nums == 2) {
                System.out.print("출금액을 입력하세요: ");
                int amount = scanner.nextInt();
                balance = withdraw(balance, amount);
            } else if (nums == 3) {
                balance= check(balance);
            }else if (nums == 4){
                System.out.println("시스템 종료");
                break;
            }else {
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

    public static int check(int balance){
        System.out.println("현재 잔액: " + balance + "원");
        return  balance;
    }
}
