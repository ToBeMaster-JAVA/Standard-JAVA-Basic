public class Ex3_16 {
    public static void main(String[] args) {
        boolean i = true ;

        System.out.printf("i = %b %n", i) ; // true
        System.out.printf("!i = %b %n", !i) ; // false
        System.out.printf("!!i = %b %n", !!i) ; // true
        System.out.printf("!!!i = %b %n", !!!i) ; // false
        System.out.println() ;

        char chr = 'A' ;// 대문자

        System.out.printf("chr = %c %n", chr) ; // ""를 문자열로 사용할 땐 \" 의 형식으로 작성해야함.
        System.out.printf("chr < 'a' || chr > 'z' = %b %n", chr < 'a' || chr > 'z') ;
        System.out.printf("!('a' <= chr && chr <= 'z') = %b %n", !('a' <= chr && chr <= 'z')) ;
        System.out.printf("'a' <= chr && chr <= 'z' = %b %n", 'a' <= chr && chr <= 'z') ;
    }
}
