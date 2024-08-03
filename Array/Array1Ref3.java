package Array;

public class Array1Ref3 {

    public static void main(String[] args) {
        int[] students; // 배열선언
        students = new int[]{90, 80, 70, 60, 50}; // 배열 크기 선언 및 생성 및 초기화

        for(int i = 0; i < students.length; i++){
            System.out.println("학생" + (i+1) + " 점수: " + students[i]);
        }
    }
}
