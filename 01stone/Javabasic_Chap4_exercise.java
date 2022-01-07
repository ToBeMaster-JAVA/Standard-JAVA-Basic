public class Javabasic_Chap4_exercise {
    public static void main(String[]args){
        System.out.println("1.1 10<x && x<20");
        System.out.println("1.2 !(ch==' ' || ch=='\t')");
        System.out.println("1.3 (ch=='x' || ch=='X')");
        System.out.println("1.4 '0'<=ch && ch<='9'");
        System.out.println("1.5 ('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z')");
        System.out.println("1.6 year % 400 == 0 || year % 4 == 0 && year$100!=0");
        System.out.println("1.7 !powerOn");
        System.out.println("1.8 str.equals('yes') -> 쌍따옴표여야 함");

        // 2. 1부터 20까지 정수중에서 2 또는 3의 배수가 아닌 것
        System.out.println("2.");
        int sum = 0;
        for(int i=1; i <=20; i++) {
            if(i%2!=0 && i%3!=0){
                sum += i;
            }
        }
        System.out.println("2. sum = "+sum);

        // 3.
        System.out.println("3.");
        int sum_3 = 0;
        int sum_3_tot = 0;
        for(int i=1; i <=10; i++) {
                sum_3 += i;
                sum_3_tot += sum_3;
        }
        System.out.println("3. sum_3_tot = "+sum_3_tot);

        //4.
        System.out.println("4.");
        int sum_4 = 0;
        int s = 1;
        int num = 0;
        for(int i=1; sum_4<100; i++, s=-s) {
            num = i * s;
            sum_4 += num;
        }
        System.out.println("num="+num);
        System.out.println("sum_4="+sum_4);

        //5.
        System.out.println("5.");
        int i_5 = 0;
        while(i_5<=10){
            int j_5 = 0;
            while (j_5<=i_5){
                System.out.println('*');
                j_5++;
            }
            System.out.println();
            i_5++;
        }

        //6.
        System.out.println("6.");
        for(int i = 1; i<=6; i++)
            for(int j = 1; j<=6; j++)
                if(i+j==6)
                    System.out.println(i+"+"+j+"="+(i+j));

        //7.
        System.out.println("7.");
        String str = "12345";
        int sum_7 = 0;
        for(int i=0; i < str.length(); i++) {
            sum_7 += str.charAt(i) - '0';
        }
        System.out.println("sum_7="+sum_7);

        //8.
        System.out.println("8.");
        int value = (int)(Math.random()*6)+1;
        System.out.println("value = "+value);

        //9.
        int num_9 = 12345;
        int sum_9 = 0;
        String num__to_str = Integer.toString(num_9);
        for(int i=0; i < num__to_str.length(); i++) {
            sum_9 += num__to_str.charAt(i) - '0';
        }
        System.out.println("sum_9="+sum_9);

        //9. 정답
        int num9 = 12345;
        int sum9 = 0;
        while(num9 > 0) {
            sum9 += num9%10;
            num9 /= 10;
        }
        System.out.println("sum9="+sum9);

    }
}
