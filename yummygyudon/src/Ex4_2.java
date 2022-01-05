public class Ex4_2 {
    public static void main(String[] args) {
        int x = 0 ;
        // x가 0일 때 참(true)인 경우 : 2가지 & 거짓(false)인 경우 : 2가지
        if (x==0) System.out.println("x==0"); // 참(출력됨)
        if (x!=0) System.out.println("x!=0"); // 거짓
        if (!(x==0)) System.out.println("!(x==0)"); // 거짓
        if (!(x!=0)) System.out.println("(!(x!=0))"); // 참(출력됨)


        String str = "apple" ;

        // (대소문자 구분 O) 문자열 str 내용이 'Apple' 일 때
        System.out.println(str.equals("Apple")) ; // false
        // (대소문자 구분 X) 문자열 str 내용이 'Apple' 일 때
        System.out.println(str.equalsIgnoreCase("Apple")) ; // true

    }
}
