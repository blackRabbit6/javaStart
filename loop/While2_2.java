package loop;

public class While2_2 {
    // while2_1 클래스 문제 -> while문으로
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i <= 3){
            sum = sum + i;
            System.out.println(" i = " + i + " , sum = " + sum);
            // i = i+1 -> 이거 안 쓰면, i = 1에서 무한으로 늘어나서 코드가 안끝남!
            i++;
        }

    }
}
