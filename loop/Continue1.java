package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        while(i <= 5){
//            3번째에서는 i가3이라 if문으로 들어가지만 출력은 안하고 i가 증가해서 넘어감
            if(i == 3){
                i++;
                continue;
            }
            System.out.println("i = "+ i);
            i++;
        }
    }
}
