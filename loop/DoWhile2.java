package loop;

public class DoWhile2 {
    public static void main(String[] args) {

        int i = 10;
        //do 안에 있는 코드블럭을 실행후 조건식 while 검사 만약 false이면 while문 탈출, 아니면 계속 진행
        do{
            System.out.println(" 현재 숫자는: " + i);
            i++;
        }
        while(i < 3);
    }
}
