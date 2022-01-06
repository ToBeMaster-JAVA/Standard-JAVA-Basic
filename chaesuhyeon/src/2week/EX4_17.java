class EX4_17 {
    public static void main(String args[]) {
        for (int i=0;i<=10;i++) {
            if (i%3==0)
                continue;
            System.out.println(i); // continue문이 실행되면 i출력 x
        } // continue문이 실행되면 여기로 이동
    } // main 끝
}