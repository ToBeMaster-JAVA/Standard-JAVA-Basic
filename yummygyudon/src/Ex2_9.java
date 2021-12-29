public class Ex2_9 {
    public static void main(String args[]) {
        // printf 연습
        String url = "github.com/yummygyudon";
        System.out.printf("[%s] %n", url) ;
        //숫자는 총 출력할 길이를 정해놓는 것 : 몇 글자를 쓰던 부족한 부분은 공백으로 채울 예정
        // 30자를 넘지 못할 경우 : 남은 자리 공백 출력
        // 30자를 넘기는 경우 : 그대로 양쪽 모두 공백없이 문자열 그대로 출력
        System.out.printf("[%30s] %n", url) ; // 오른쪽에  공백
        System.out.printf("[%-30s] %n", url) ; // 왼쪽에  공백 ('-' 는 좌측 끝)

        //'.'을 통해 제한 걸기 ( 넘기면 자름 _ 위와 다른 점)
        System.out.printf("[%.8s] %n", url) ; // "왼쪽"에서부터 8글자만
        // System.out.printf("[%8.s] %n", url) -> 왼쪽에서만 가능

        float f1 = .10f;// 0.10 = 1.0e-1
        float f2 = 1e1f;// 0.10 = 1.0e-1
        float f3 = 3.14e3f;// 3140.0 = 3.140000e+3
        double d = 1.23456789 ;

        // 기본적으로 %f는 소수점 아래 6자리 까지출력
        // f , e , g 3가지방법으로 실수형값 출력 가능
        System.out.printf("f1 = (f 버전)%f , (지수 버전)%e , (간략)%g %n", f1, f1, f1 ) ;
        System.out.printf("f2 = (f 버전)%f , (지수 버전)%e , (간략)%g %n", f2, f2, f2 );
        System.out.printf("f3 = (f 버전)%f , (지수 버전)%e , (간략)%g %n", f3, f3, f3 );
        // 자동으로 7자리 반올림되서 6자리까지만 출력
        System.out.printf("double타입 d = (f 버전)%f %n", d); //1.234568

        // 출력하고픈 자릿수까지 지정해주기
        // %(전체자리).(출력할 점 아래 자리)f  _ 넘치는 자리는 알아서 -> 0 (소수점 아래) / 공백(양수 자리)으로 채워서 출력
        System.out.printf("내 입맛대로 d = (점 아래 10자리까지) %14.10f %n", d) ; //  1.2345678900
        System.out.printf("내 입맛대로 d = (점 아래 10자리까지) %12.9f %n", d) ; //1.234567890
    }
}
