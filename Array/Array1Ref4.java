package Array;

public class Array1Ref4 {

    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; // 배열선언 및 생성 간략화 (여기서는 new int[] 생략 가능)

        for(int i = 0; i < students.length; i++){
            System.out.println("학생" + (i+1) + " 점수: " + students[i]);
        }
    }
}
