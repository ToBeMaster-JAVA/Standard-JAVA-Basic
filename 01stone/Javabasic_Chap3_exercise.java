public class Javabasic_Chap3_exercise {
    public static void main(String[]args){
        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;
        b = (byte)i;
        ch = (char)b;
        short s = (short)ch;
        float f = (float)l; // float 범위가 long보다 큼
        i = (int)ch;  // char(2), int(4)
        System.out.println("1. 4,5");
        System.out.println();

        System.out.println("2. 6 true 13 5 false 2 5 66 B B C");
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A' 65 의 문자코드는
        System.out.println(1 + x << 33);
        System.out.println(y >= 5 || x < 0 && x > 2);
        System.out.println(y += 10 - x++);
        System.out.println(x+=2);
        System.out.println( !('A' <= c && c <='Z') );
        System.out.println('C'-c);
        System.out.println('5'-'0');
        System.out.println(c+1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);
        System.out.println();

        System.out.println("3. num/100*100");
        int num = 456;
        System.out.println(num/100*100);
        System.out.println();

        System.out.println("4. (numOfApples%sizeOfBucket > 0 ? 1 : 0)");
        int numOfApples = 123; // 사과의 개수
        int sizeOfBucket = 10; // ( ) 바구니의 크기 바구니에 담을 수 있는 사과의 개수
        int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0) ;
        System.out.println(" :"+numOfBucket);
        System.out.println();

        System.out.println("5. num5 > 0 ? \"양수\":(num5 < 0 ? \"음수\" : \"0\")");
        int num5 = 10;
        System.out.println(num5 > 0 ? "양수":(num5 < 0 ? "음수" : "0"));
        System.out.println();

        System.out.println("6. (int)((5/9f * (fahrenheit - 32))*100 + 0.5) / 100f");
        int fahrenheit = 100;
        float celcius = (int)((5/9f * (fahrenheit - 32))*100 + 0.5) / 100f;
        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
        System.out.println();


    }
}
