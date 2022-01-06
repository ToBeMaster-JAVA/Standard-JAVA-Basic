public class Ex5_9 {
    public static void main(String[] args) {
        int[][] score = { // 5행 3열 Table형 2차원 배열 생성
                {100, 100, 100},
                {70, 80, 90},
                {65, 85, 93},
                {100, 75, 60},
                {50, 50, 50}
        };
        int korSum = 0, engSum = 0, mathSum = 0 ;

        System.out.println("번호  국어  영어  수학  총점  평균");
        System.out.println("==============================");

        for (int i = 0; i < score.length; i++){
            int sum = 0; // 개인별(행별) 총점
            float avg = 0.0f; // 개인별(행별) 평균

            korSum += score[i][0] ;
            engSum += score[i][1] ;
            mathSum += score[i][2] ;
            System.out.printf("%3d", i+1) ; // 순번(행번호) _ 3으로 길이 지정 -> 남는 공간 공백 만들어 출력

            for (int k = 0; k < score[i].length; k++) {
                sum += score[i][k]; // 행별 총점 변수에 각 배열의 각 값들을 누적합
                System.out.printf("%5d", score[i][k]); // 각 값들을 출력 _ %n은 빼서 이어붙여 출력 (%5 길이 지정)
            }
            avg = sum/(float)score[i].length;
            System.out.printf("%5d %5.1f %n", sum, avg); // 각 값 대상 for문 마치고 총합 평균 출력
        }
        System.out.println("==============================");
        System.out.printf("총점 : %3d %4d %4d %n", korSum, engSum, mathSum) ;
    }
}
