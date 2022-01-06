public class Ex5_2 {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0f ; // 실수값 평균을 담을 경우 대비, float형으로 선언
        int[] score = {100, 93, 99, 100, 100};
        for (int i = 0 ; i < score.length; i++) {
            sum += score[i];
        }
        average = sum / (float)score.length; // 계산 결과 자체를 실수형으로 바꾸기 위해 형변환

        System.out.println("총 합 : "+ sum) ;
        System.out.println("평균 : "+ average) ;
    }
}
