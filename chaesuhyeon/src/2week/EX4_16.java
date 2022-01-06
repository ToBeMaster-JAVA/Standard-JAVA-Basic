class EX4_16 {
    public static void main(String args[]) {
        int sum=0, i=0;

        while (true) {
            if(sum > 100) // sum의 값이 100을 넘으면 if문이 참이 되어 break문이 실행되고, while문을 빠져나가게 됨
                break;
            ++i;
            sum += i;
        } // while문 끝

        System.out.println("i=" +i);
        System.out.println("sum=" + sum);
    } // main 끝
}