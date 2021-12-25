class EX2_8 {
    public static void main(String[] args){
        int x = 15, y = 5;
        System.out.println("x="+x);
        System.out.println("y="+y);

        int var = x;
        x = y;
        y = var;
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}