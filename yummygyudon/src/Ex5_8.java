public class Ex5_8 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100},
                {70, 80, 90},
                {65, 85, 93},
                {100, 75, 60}
        };
        int tsum = 0;
        int rsum = 0;

        for (int i = 0; i < score.length; i++) {
            for (int k = 0; k < score[i].length; k++) {
                System.out.printf("score[%d][%d] (%d행 %d열) = %d %n", i,k, i+1, k+1, score[i][k]) ;
                rsum += score[i][k];
                tsum += score[i][k];
            }
            System.out.printf("score[%d] (%d행) 합 = %d %n", i, i+1, rsum);
            rsum = 0;
            System.out.println();
        }
        System.out.println("배열 내 총 합 = "+tsum) ;
    }
}
