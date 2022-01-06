class EX5_5 {
    public static void main(String args[]) {
        int[] ball = new int[45]; // 45개의 정수 값을 저장하기 위한 배열 생성

        for(int i = 0; i < ball.length; i++){
            ball[i] = i+1 ;// 1~45 까지 저장
        }

        int tmp = 0; // 두 값을 바꾸는데 사용할 임시변수
        int j = 0; // 임의의 값을 얻어서 저장할 변수

        for(int i = 0; i < 6; i++){
            j = (int)(Math.random()*45); // 0~44사이의 난수 값
            tmp = ball[i];
            ball[i] = ball[j]; // ball[i]와 ball[j]의 값을 서로 바꿈
            ball[j] = tmp;
        }

        for(int i = 0; i<6; i++){
            System.out.printf("ball[%d]=%d%n", i, ball[i]);
        }

    } // main 끝
}