class EX4_13 {
    public static void main(String args[]) {
        int sum=0;
        int i=0;

        while (sum <= 100) {
            System.out.printf("%d - %d%n", i,sum);
            sum += ++i; // i를 1씩 증가시켜서 sum에 더해나감
        }
    } // main 끝
}