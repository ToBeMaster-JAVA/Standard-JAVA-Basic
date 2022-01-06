import java.util.Arrays;

class EX5_4 {
    public static void main(String args[]) {
        int[] numArr = {0,1,2,3,4,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numArr));

        for(int i=0; i < 100; i++){
            int n = (int)(Math.random()*10); // 0~9사이의 난수
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
            // numArr[0]값과 numArr[n]값을 서로 바꿈
        } // end of for문
        System.out.println(Arrays.toString(numArr));
    } // main 끝
} // end of class