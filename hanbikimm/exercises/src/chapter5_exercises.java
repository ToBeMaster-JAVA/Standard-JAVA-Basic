import java.util.Arrays;
import java.util.Scanner;

public class chapter5_exercises {
    public static void main(String[] args) {

        //ex1
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for(int i=0; i< iArr1.length; i++) {
            iArr1[i] = i+1;
        }

        for (int i=0; i < iArr2.length; i++) {
            iArr2[i] = (int)(Math.random()*10)+1;
        }

        for (int i=0; i < iArr1.length; i++) {
            System.out.print(iArr1[i]+",");
        }
        System.out.println();

        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);
        System.out.println(chArr);


        //ex2
        int sum = 0;
        float average = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for (int i=0; i < score.length; i++) {
            sum += score[i];
        }
        average = sum / (float)score.length;

        System.out.println("총합: " + sum);
        System.out.println("평균: " + average);


        //ex3
        int[] scores = {79, 88, 91, 33, 100, 55, 95};

        int max = scores[0];
        int min = scores[0];

        for(int i=1; i < scores.length; i++) {
            if(scores[i] > max) {
                max = scores[i];
            } else if(scores[i] < min) {
                min = scores[i];
            }
        }
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);


        //ex4
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numArr));

        for(int i=0; i < 100; i++) {
            int n = (int)(Math.random()*10);
            int tmp = numArr[0];

            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }
        System.out.println(Arrays.toString(numArr));


        //ex5
        int[] ball = new int[45];

        for(int i=0; i < ball.length; i++)
            ball[i] = i+1;

        int tmp = 0;
        int j = 0;

        for(int i=0; i < 6; i++) {
            j = (int)(Math.random() * 45);
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
        }

        for(int i=0; i < 6; i++)
            System.out.printf("ball[%d] = %d%n", i, ball[i]);


        //ex6
        String[] names = {"Kim", "Park", "Yi"};

        for(int i=0; i < names.length; i++)
            System.out.println("names["+i+"]:"+names[i]);

        String tmps = names[2];
        System.out.println("tmps:"+tmps);
        names[0] = "Yu";

        for(int i=0; i < names.length; i++)
            System.out.println(names[i]);


        //ex7
        System.out.println("매개변수의 개수:"+args.length);
        for(int i=0; i<args.length; i++) {
            System.out.println("args[" + i + "] = \"" + args[i] + "\"");
        }


        //ex8
        int[][] score1 = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40}
        };
        sum = 0;

        for(int i = 0; i < score1.length; i++) {
            for(j = 0; j < score1[i].length; j++) {
                System.out.printf("score1[%d][%d]=%d%n", i, j, score1[i][j]);

                sum += score1[i][j];
            }
        }
        System.out.println("sum= " + sum);


        //ex9
        int[][] score2 = {
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
                , {50, 50, 50}
        };

        int korTotal = 0, engTotal = 0, mathTotal = 0;

        System.out.println("번호 국어 영어 수학 총점 평균");
        System.out.println("================================");

        for(int i=0; i < score.length; i++) {
            sum = 0;
            float avg = 0.0f;

            korTotal += score2[i][0];
            engTotal += score2[i][i];
            mathTotal += score2[i][2];
            System.out.printf("%3d", i+1);

            for(j=0; j < score2[i].length; j++) {
                sum += score2[i][j];
                System.out.printf("%5d", score2[i][j]);
            }

            avg = sum/(float)score2[i].length;
            System.out.printf("%5d %5.1f%n", sum, avg);
        }
        System.out.println("===============================");
        System.out.printf("총점: %3d %4d %4d%n", korTotal, engTotal, mathTotal);


        //ex10
        String[][] words = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"}
        };

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);

            String ttmp = scanner.nextLine();

            if(ttmp.equals(words[i][1])) {
                System.out.printf("정답입니다.%n%n");
            } else {
                System.out.printf("틀렸습니다.정답은 %s 입니다.%n%n", words[i][1]);
            }
        }
    }
}
