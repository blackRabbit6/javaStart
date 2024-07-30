package loop;

public class While1_2 {
    public static void main(String[] args) {
        // while문 
        int count = 0;
        
        // count가 3이 되면 while 반복문 종료 됨, while이 3이 될 때 까진 참이기에 while문 반복됨
        while (count < 3){
            count = count + 1;
            System.out.println("현재 숫자는: " + count);
        }
    }
}
