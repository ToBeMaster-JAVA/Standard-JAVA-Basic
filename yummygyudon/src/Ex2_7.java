public class Ex2_7 {
    public static void main(String args[]) {
        // 문자열 결합
        String name = "Ja" + "va" ;
        String str = name + 8.0 ;

        System.out.println(name) ; // Java
        System.out.println(str) ; // Java8.0

        System.out.println(7 + " ") ;  // "7 "
        System.out.println(" " + 7) ;  // " 7"
        System.out.println(7 + "7") ;  // "77"

        // 단, 앞서서 숫자 리터럴이 연속적으로 나오는 경우
        // 숫자들 간 계산이 우선적으로 이루어진다.
        System.out.println(7 + 7 + " ") ;  // "14 "
        System.out.println(" " + 7 + 7) ;  // " 77"
        System.out.println(7 + " " + 7) ;  // "7 7"
    }
}
