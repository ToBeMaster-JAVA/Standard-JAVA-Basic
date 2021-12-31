public class chapter3_exercises {
    public static void main(String args[]){
        // ex1
        int x, y;
        x = y = 3;
        System.out.println("x=" +x);
        System.out.println("y="+y);

        // ex2
        int i=5, j=0;
        j = i++;
        System.out.println("j = i++; 실행 후, i =" + i +", j="+ j);

        i=5;
        j=0;
        j = ++i;
        System.out.println("j = ++i; 실행 후, i =" + i +", j="+ j);

        // ex4
        i = -10;
        i = -i;
        System.out.println(i);

        // ex5
        double d = 85.4;
        int score = (int)d;
        System.out.println("score=" +score);
        System.out.println("d=" +d);

        // ex6
        int a = 10, b =4;
        System.out.printf("%d / %d = %d%n", a, b, a/b);
        System.out.printf("%d / %f = %f%n", a, (float)b, a/(float)b);

        // ex8
        byte w = 10, q = 30, z = (byte)(w*q);
        System.out.println(z);

        // ex10
        long integer = 1_000_000 * 1_000_000;
        long longer = 1_000_000 * 1_000_000L;
        System.out.println("integer="+integer);
        System.out.println("longer="+longer);



    }
}