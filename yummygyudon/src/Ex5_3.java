public class Ex5_3 {
    public static void main(String[] args) {
        int[] score = {74, 83, 99, 64, 100, 95};

        int max = score[0],min = score[0] ; // 첫번째 값을 우선 최댓값, 최솟값으로 초기화

        for (int i = 1 ; i < score.length; i++) { // 두 번째 값부터 비교시작
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
        }

        System.out.println("최댓값 : "+ max) ;
        System.out.println("최솟값 : "+ min) ;
    }
}
