import java.util.Scanner;
public class Ex5_10 {
    public static void main(String[] args) {
        // 앞서 살펴보았던 정수 2차원 배열과 사용하는 방법은 동일하다
        String[][] words = {
                {"chair", "의자"},
                {"bed", "침대"},
                {"book", "책"},
                {"integer", "정수"}
        };

        Scanner scanner = new Scanner(System.in) ; // 질문응답 형식 프로그램

        for (int i = 0; i < words.length; i++) {
            System.out.printf("질문%d . %s의 뜻은?", i+1, words[i][0]) ; // .printf()를 활용해 %s로 문자열 출력

            String tmp = scanner.nextLine(); // 입력받기

            if (tmp.equals(words[i][1])) {
                System.out.printf("정답! %n%n") ; // 한 줄 공백 간격을 위해 한 번 더
            }else{
                System.out.printf("오답! (정답 : %s) %n%n",words[i][1]);
            }
        }
    }
}
