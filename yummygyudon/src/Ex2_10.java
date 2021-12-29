// 입력받을 때 사용하는 모듈 : Scanner
import java.util.Scanner;

public class Ex2_10 {
    public static void main(String[] args) {
        // Scanner 객체 생성해야함
        // 타입이 Scanner이며 선언 또한 new를 통해 생성해야한다.
        Scanner scanner = new Scanner(System.in) ;

        System.out.print("두 자리 정수를 입력하시오. >> ") ;
        // 입력대기 상태 -( nextLine() )-> 입력 마치면 입력 내용 문자열로 반환
        String input = scanner.nextLine() ;
        int num = Integer.parseInt(input) ; // 문자열을 숫자 변환

        System.out.println("입력 : " + input) ;
        System.out.printf("num = %d %n", num) ;
    }
}
