import java.util.Scanner;
public class chapter4_exercises {
    public static void main(String[] args) {
        // ex1
        int score = 80;
        if(score > 60){
            System.out.println("합격입니다!");
        }


        // ex2
        int x = 1;
        System.out.printf("x = %d 일 때, 참인 것은 \n", x);
        if (x == 0) System.out.println("x == 0");
        if (x != 0) System.out.println("x != 0");
        if (!(x == 0)) System.out.println("!(x == 0)");
        if (!(x != 0)) System.out.println("!(x != 0)");


        // ex3
        System.out.print("숫자를 하나 입력하세요 > ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == 0){
            System.out.println("입력하신 숫자는 0 입니다.");
        }else {
            System.out.println("입력하신 숫자는 0이 아닙니다.");
        }


        // ex6
        score = 0;
        char grade = ' ';

        System.out.print("점수를 입력하세요 > ");
        Scanner scanner2 = new Scanner(System.in);
        score = scanner2.nextInt();

        if (score >= 90){
            grade = 'A';
        }else if (score >= 80){
            grade = 'B';
        }else if (score >= 70){
            grade = 'C';
        }else {
            grade = 'D';
        }
        System.out.println("당신의 학점은 " + grade + "입니다." );


        // ex5
        score = 94;
        char opt = '0';
        if (score >= 90){
            grade = 'A';
            if (score >= 98){
                opt = '+';
            }else if (score < 94){
                opt = '-';
            }
        }else if (score >= 80){
            grade = 'B';
            if (score >= 88){
                opt = '+';
            }else if (score < 84){
                opt = '-';
            }
        }else {
            grade = 'C';
        }
        System.out.printf("당신의 점수는 %d이고, 학점은 %c%c 입니다.\n", score, grade,opt);


        // ex6
        System.out.print("현재 월을 입력하세요 > ");
        Scanner scanner3 = new Scanner(System.in);
        int month = scanner3.nextInt();

        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;

            case 6: case 7: case 8:
                System.out.println("Summer");
                break;

            case 9: case 10: case 11:
                System.out.println("Autumn");
                break;

            default:
                System.out.println("Winter");
        }


        // ex7 난수 구하기
        int num = 0;

        for (int i = 1; i <=5; i++){
            num = (int)(Math.random() * 6) + 1;
            System.out.println(num);
        }

        // ex8
        for (int i = 1; i <=3; i++){
            System.out.println("Hello!");
        }

        // ex10
        int sum = 0;

        for (int i = 1; i <=5; i++){
            sum += i;
            System.out.printf("1부터 %2d 까지의 합: %2d\n", i, sum);
        }

        // ex11
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // ex13
        sum = 0;
        int i = 0;

        while (sum <= 100){
            System.out.printf("%d - %d\n", i, sum);
            sum += ++i;
        }

        // ex15
        int number = 0, answer = 0;

        answer = (int)(Math.random() * 100) + 1;
        Scanner scanner4 = new Scanner(System.in);

        do{
            System.out.print("1과 100 사이의 정수를 입력하세요 > ");
            number = scanner4.nextInt();

            if(number > answer){
                System.out.println("더 작은 수로 시도해보세요.");
            }else if (number < answer){
                System.out.println("더 큰 수로 시도해보세요.");
            }
        }while (number != answer);
        System.out.println("정답입니다!");


        // ex18
        int menu = 0;
        num = 0;

        Scanner scanner5 = new Scanner(System.in);
        while(true){
            System.out.print("(1) square \n(2) square root \n(3) log\n");
            System.out.print("원하는 메뉴(1~3)를 선택사에요. (종료:0) > ");
            menu = scanner5.nextInt();

            if (menu==0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else if (!(1 <= menu && menu <=3)){
                System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
                continue;
            }
            System.out.println("선택하신 메뉴는 " + menu + "번입니다.");


        }
    }
}
