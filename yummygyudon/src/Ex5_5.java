import java.util.Arrays;

public class Ex5_5 {
    public static void main(String[] args) {
        int[] nBall = new int[45]; // 뽑은 번호공의 의미로 45개의 공들(1~45 배열) 만들기

        // 45개의 공들에 1~45 값들을 각각 저장
        for (int i = 0; i < nBall.length; i++) { // 100번 반복해서 섞겠다는 의지....!!
            nBall[i] = i + 1;
        }
        int tmp = 0 ; // 두 값을 바꿀 때 사용할 임시 저장 수단
        int j = 0 ; // 무작위 추첨할 공 index 값 (임의)

        for (int i = 0; i < 6; i ++){ // 앞 6개 값만 45개중 무작위로 뽑아와서 교체하기
            j = (int)(Math.random() * 45) ; // <<index>> 0~44 범위의 무작위 값
            tmp = nBall[i] ;
            nBall[i] = nBall[j] ;
            nBall[j] = tmp ;
        }
        for (int i = 0; i < 6; i++){
            System.out.printf("%d 번째 추첨공 숫자는 %d 입니다! %n", i+1 , nBall[i]);
        }
    }
}
