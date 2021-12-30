public class Ex3_14 {
    public static void main(String[] args) {
        String str1 = "abc" ; //

        boolean result = str1.equals("abc") ; //true
        System.out.println(result) ;
        System.out.println(str1 == "abc") ; // true

        String str2 = new String("abc") ; // str1과 ==연산자 차이점을 만들기 위해 다른'객체'로 생성 _ 내용은 같으나 다른 객체 (주소값 다름)

        System.out.printf("\"abc\" == \"abc\" 는 %b %n", "abc"=="abc") ; // ""를 문자열로 사용할 땐 \" 의 형식으로 작성해야함.
        System.out.printf("str1 == \"abc\" 는 %b %n", str1=="abc") ;
        System.out.printf("str2 == \"abc\" 는 %b %n", str2=="abc") ;
        System.out.printf("str1.equals(\"abc\") 는 %b %n", str1.equals("abc")) ;
        System.out.printf("str2.equals(\"abc\") 는 %b %n", str2.equals("abc")) ;
        System.out.printf("str2.equals(\"ABC\") 는 %b %n", str2.equals("ABC")) ;
        System.out.printf("str2.equalsIgnoreCase(\"ABC\") 는 %b %n", str2.equalsIgnoreCase("ABC")) ;
    }
}
