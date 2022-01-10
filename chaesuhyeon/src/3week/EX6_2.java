class EX6_2 {
    public static void main(String[] args) {
        Tv t1 = new Tv(); // Tv t1; t1 = new Tv(); 를 한 문장으로 가능 \
        Tv t2 = new Tv();
        System.out.println("t1의 현재 채널은" + t1.channel + "입니다.");
        System.out.println("t2의 현재 채널은" + t2.channel + "입니다.");

        t1.channel = 7; // channel 값을 7으로 한다．
        System.out.println("t1의 채널 값을 7로 변경하였습니다.");

        System.out.println("t1의 현재 채널은" + t1.channel + "입니다.");
        System.out.println("t2의 현재 채널은" + t2.channel + "입니다.");
    }
}
