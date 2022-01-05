import java.util.Scanner;

public class Ex4_5 {
    public static void main(String[] args) {
        int score = 0 ;
        char grade = ' ', opt = '0'; // char을 한 번 선언하고 쉼표로 구분하여 여러 동일 타입 변수 선언 가능

        System.out.print("점수를 입력하세요 >") ;

        Scanner scanner = new Scanner(System.in) ;
        score = scanner.nextInt() ; // 입력받은 정수 _ Scanner(System.in).nextInt()

        System.out.printf("당신의 점수는 %d 입니다.%n", score) ;

        if (score >= 90) {
            grade = 'A' ;
            if (score%10 >= 8) {
                opt = '+';
            } else if (score%10 < 4){
                opt = '-';
            }
        }else if (score >= 80) {
            grade = 'B';
            if (score % 10 >= 8) {
                opt = '+';
            } else if (score % 10 < 4) {
                opt = '-';
            }
        }else {
            grade = 'C';
        }
        System.out.printf("당신의 학점은 %c%c 입니다. %n", grade, opt);
    }
}
