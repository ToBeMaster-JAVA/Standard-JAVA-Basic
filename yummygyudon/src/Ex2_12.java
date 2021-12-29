public class Ex2_12 {
    public static void main(String[] args) {
        String str = "5" ;

        System.out.println(str.charAt(0) - '0') ; // (문자열 -> 문자) -> 숫자
        System.out.println('5' - '0' + 1) ; // (문자 -> 숫자) & 숫자끼리 계산
        System.out.println(Integer.parseInt("3") + 1) ; // 4
        System.out.println(Double.parseDouble("3.14")) ; // 3.14
        System.out.println("3" + 1) ; // 단순 숫자 계산 시도하면 그냥 문자열로 합쳐짐
        System.out.println((char)(3+'0')) ; // 문자(char)형 3
    }
}
