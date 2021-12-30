class EX3_2 {
    public static void main(String[] args) {
        int x=7 ,y=0;

        y = x++;
        System.out.println("y=x++; 실행 후, x=" + x +", y=" + y );

        x=7;
        y=0;

        y = ++x;
        System.out.println("y=++x; 실행 후, x=" + x +", y=" + y );
    }
}