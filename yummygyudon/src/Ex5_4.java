import java.util.Arrays ;
public class Ex5_4 {
    public static void main(String[] args) {
        int[] nArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(nArr));

        for (int i = 0; i < 100; i++) { // 100번 반복해서 섞겠다는 의지....!!
            int n = (int) (Math.random() * 10); // 0이상 1미만의 범위 -> 10 곱해서 0~9 정수 범위 무작위 추출
            // 값 교환은 이전 정리글 참고
            int tmp = nArr[0]; // 첫번째 값은 임시로 tmp에 담아놓기
            nArr[0] = nArr[n]; // 무작위로 뽑은 주소의 값을 배열 첫번째로 위치 이동
            nArr[n] = tmp; // 그 무작위로 뽑은 주소에 배열 첫번재였던 값으로 바꾸기(채워넣기)
        }
        System.out.println(Arrays.toString(nArr));
    }
}
