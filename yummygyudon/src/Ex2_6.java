public class Ex2_6 {
    public static void main(String args[]) {
        int x = 100 ;
        double pi = 3.14 ;
        char ch = 'a' ;
        String str = "Java" ; // 큰 따옴표가 아닌 작은 따옴표일 때 : unclosed character literal 에러

        System.out.println(x);
        System.out.println(pi);
        System.out.println(ch);
        System.out.println(str);

        // 상수(constant)
        // final을 붙여주고 선언
        final int ONLY_TEN = 10; // 'ONLY_TEN'이라는 변수에 처음이자 마지막 대입 성공
        System.out.println(ONLY_TEN);
        /*
        ONLY_TEN = 20 ; // 에러 : cannot assign a value to final variable ONLY_TEN
        */


        // 리터럴(literal) 타입 이해
        // (JDK 1.7~) 정수형 리터럴 중간에 구분자 '_' 삽입 가능 -> 큰 숫자 가독성 증가

        // 정수형
        long mega = 100_000_000_000L ; // (20억 이상) long mega = 100000000000L
        long hex = 0xFFFF_FFFF_FFFF_FFFFL ; // (0x 접미사) long hex = 0xFFFFFFFFFFFFFFFFL

        int octTen = 010 ; // 10 -> 8진수
        int hexTen = 0x10 ; // 10 -> 16진수

        System.out.println(mega); // 100000000000
        System.out.println(hex); // -1
        System.out.println(octTen); // 8
        System.out.println(hexTen); // 16

        // 실수형
        float Pi = 3.141592f; // [필수]
        // 오류 : incompatible types: possible lossy conversion from double to float

        double rev = 0.9876d ;

        System.out.println(Pi); // 3.141592
        System.out.println(rev); // 0.9876

        // 문자
        String name = "Java";
        char J = 'J' ; // 'Java' 불가능 _ 오류 : unclosed character literal

        System.out.println(name); // Java
        System.out.println(J); // J

        String blk = "" ; // 허용
        // char ch = '' ;
        // 에러 : empty character literal (빈 char 리터럴 불가능)

        char chblk = ' ' ; // 공백(blank)를 사용하면 가능
        System.out.println(blk); // (없음)
        System.out.println(chblk); // (빈 칸)
    }
}
