package cond;

public class CondEx3 {
    public static void main(String[] args) {
        //문제 3 - 환율계산
        // 1달러 - 1300원
        // 달러 0 미만 - "잘못된 금액입니다." , 달러 0 - "환전할 금액이 없습니다." , 달러 0 초과 - "환전 금액은 (계산 원화금액) 원 입니다." 출력
        // 달러 -> int dollar로 변수 선언 후 초기화

        int dollar = 10;

        if(dollar < 0){
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        }else{
            int won = dollar * 1300;
            System.out.println("환전할 금액은 " + won +" 원입니다.");
        }
    }
}
