import java.util.Scanner;

class EX5_10 {
    public static void main(String[] args) {
        String[][] word = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"}
        } ;

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i < word.length; i++) {
            System.out.printf("Q%d. %s의 뜻은?", i + 1, word[i][0]);

            String tmp = scanner.nextLine();

            if(tmp.equals(word[i][1])){
                System.out.printf("정답입니다. %n%n");
            } else {
                System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n", word[i][1]);
            } // end of if
        } // end of for

    } // end of main
} // end of class