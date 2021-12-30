import java.util.Scanner;

public class Ex3_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ; //입력받기
        char chr = ' '; //빈 char

        System.out.printf("문자를 하나 입력하시오. >> ") ;

        String input = scanner.nextLine();
        chr = input.charAt(0) ;

        if ('0' <= chr && chr <= '9') {
            System.out.printf("입력하신 문자는 숫자입니다.");
        }
        if (('a' <= chr && chr <= 'z') || ('A' <= chr && chr <= 'Z')) {
            System.out.printf("입력하신 문자는 영문자입니다.") ;
        }
        else {
            System.out.printf("입력하신 문자는 영문자나 숫자가 아닙니다.");
        }
    }
}
