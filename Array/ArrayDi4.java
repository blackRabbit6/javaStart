package Array;

public class ArrayDi4 {

    public static void main(String[] args) {
        // 2*3 2차원 배열 생성
        int[][] arr = new int[2][3];
        // 순서대로 1씩 증가하는 값을 입력
        int i = 1;

        for(int row=0; row < arr.length; row++){
            for(int column = 0; column < arr[row].length; column++){
                arr[row][column] = i++;
            }
        }

        for(int row = 0; row < arr.length; row++){
            for(int column = 0; column < arr[row].length; column++){
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
