package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0 ;
        int i = 1;
//        for( ; ;) -> for문은 조건 없으면 무한 반복
        for( ; ; ){
            sum += i;
            if(sum>10){
                System.out.println("sum>10 이면 break 발동 i = "+ i +" ,sum = "+ sum);
                break;
            }
            i++;
        }
    }
}
