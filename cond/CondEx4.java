package cond;

public class CondEx4 {
    public static void main(String[] args) {
        //문제 4 - 평점에 관한 영화 추천
        // double rating -> 평점 변수 초기화 후 사용
        // if문 사용
        // 평점 9 - 어바웃 타임, 평점 8 - 토이 스토리 , 평점 7 - 고질라
        
         double rating = 7.1;

         if (rating <= 9 ){
             System.out.println("'어바웃 타임'을 추천합니다.");
         }
        if (rating <= 8){
            System.out.println("'토이 스토리'을 추천합니다.");
        }
        if (rating <= 7){
            System.out.println("'고질라'을 추천합니다.");
        }
    }
}
