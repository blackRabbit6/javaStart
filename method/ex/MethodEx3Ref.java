package method.ex;

public class MethodEx3Ref {

    public static void main(String[] args) {
        int balance = 10000;
        balance = deposit(balance, 1000);
        balance = withdraw(balance, 2000);
//        balance = withdraw(balance,20000); 부족하게 해도 잘 나옴
        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int deposit(int balance, int amount){
        balance += amount;
        System.out.println(amount + "원 입금. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount){
        if(balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원 출금. 현재 잔액: " + balance + "원");
        }else {
            System.out.println(amount + "원 출금 불가");
            System.out.println("잔액 부족");
        }
        return balance;
    }
}
