package week2;

import java.util.Scanner;

public class ConditionalLoops {
    public static void main(String[] args) {
        ConditionalLoops examples = new ConditionalLoops();
        examples.ex20();
    }

    public void ex1() {
        int score = 80;

        if (score > 60) {
            System.out.println(("합격"));
        }
    }

    public void ex2() {
        String x = "ABC";
        String y = new String("ABC"); // 새로운 객체
        String z = "abc";

        System.out.println(x == y); // == 연산자는 주소값을 비교하고 있음
        System.out.println(x.equals(y)); // 값을 비교
        System.out.println(x.equals(z)); // equals ->  대소문자 구분
        System.out.println(x.equalsIgnoreCase(z)); // equalsIgnoreCase -> 대소문자 구분 X

        int a = 0;
        System.out.printf("a=%d 일 때, 참인 것은%n", a);

        if (a==0) System.out.println("a==0"); // 한줄일 때에는 블럭({}) 안써도 되지만 쓰는게 좋음 길어질수록 복잡해지기 때문
        if (a!=0) System.out.println("a!=0");
        if (!(a==0)) System.out.println("!(a==0)");
        if (!(a!=0)) System.out.println("!(a!=0)");

        a = 1;
        System.out.printf("a=%d 일 때, 참인 것은%n", a);

        if (a==0) System.out.println("a==0");
        if (a!=0) System.out.println("a!=0");
        if (!(a==0)) System.out.println("!(a==0)");
        if (!(a!=0)) System.out.println("!(a!=0)");
    }

    public void ex3() {
        System.out.println("숫자 입력: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == 0) {
            System.out.println("입력한 숫자는 0");
        } else {
            System.out.println("입력한 숫자는 0이 아님");
        }
    }

    public void ex4() {
        int score = 0;
        char grade = ' ';

        System.out.print("점수 입력 > ");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80 /* && score < 90 은 안써도 된다. 위에서 이미 거짓으로 넘어갔기 때문*/) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.printf("학점은 %c입니다.", grade);
    }

    public void ex5() {
        int score = 0;
        char grade = ' ', opt = '0';

        System.out.print("점수 입력 > ");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80 /* && score < 90 은 안써도 된다. 위에서 이미 거짓으로 넘어갔기 때문*/) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else if (score >= 70) {
            grade = 'C';
            if (score >= 78) {
                opt = '+';
            } else if (score < 74) {
                opt = '-';
            }
        } else {
            grade = 'D';
        }
        System.out.printf("학점은 %c%c입니다.", grade,opt);
    }

    public void ex6() {
        System.out.print("월 입력 >");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;
            default: // 12, 1, 2
                System.out.println("겨울");
                break;
        }
    }

    public void ex7() {
        int num = 0;

        for (int i=1; i<=5; i++) {
            num = (int) (Math.random() * 6) + 1; // Math.random()은 0.0 부터 1.0 사이의 랜덤한 수를 준다.
            System.out.println(num);
        }
    }

    public void ex8_10() {
        for (int i=1; i<=3; i++) { // i--, i+=2, i-=2 등이 올 수 있다
            System.out.println("Hello World!");
        }
        System.out.println();

        for (int i=1; i<=5; i++) {
            System.out.println(i);
            System.out.print(i);
        }
        System.out.println();

        int sum = 0;

        for (int i=1; i<=5; i++) {
            sum += i;
            System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
        }
    }

    public void ex11() {
        for (int i=1; i<=5; i++) {
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void ex12_14() {
        int i = 5;
        while (i--!=0) {
            System.out.println(i + " - I can do it.");
        }

        i = 0;
        int sum = 0;

        while (sum<=100) {
            System.out.printf("%d -%d%n", i, sum);
            sum += ++i;
        }

        int num =0;
        sum = 0;
        System.out.print("숫자 입력(ex: 12345) >");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        while (num!=0) {
            sum += num%10;
            System.out.printf("sum=%3d num=%d%n", sum, num);

            num /= 10;
        }
        System.out.println("각 자리수 합: "+sum);
    }

    public void ex15() {
        int input = 0, answer = 0;

        answer = (int)(Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1~100 중 하나 입력 >");
            input = scanner.nextInt();

            if (input > answer) {
                System.out.println("더 작은 수 ㄱㄱ");
            } else if (input < answer) {
                System.out.println("더 큰 수 ㄱㄱ");
            }
        } while (input != answer);
        System.out.println("정답!");
    }

    // break는 가장 가까운 루프를 끝낸다
    public void ex16() {
        int sum = 0, i = 0;

        while (true) {
            if (sum > 100) break;
            ++i;
            sum += i;
        }
        System.out.println("i=" + i);
        System.out.println("sum=" + sum);
    }

    // continue는 아래 코드를 실행하지 않고 다음 루프로 넘어간다
    public void ex17() {
        for (int i=0;i <= 10; i++) {
            if (i%3==0) continue;
            System.out.println(i);
        }
    }

    public void ex18() {
        int menu = 0, num = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴(1~3) 선택. (종료: 0) >");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if(menu==0) {
                System.out.println("종료");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴 틀림, 종료: 0");
                continue;
            }
            System.out.println("선택한 메뉴: "+menu+"번");
        }
    }

    public void ex19() {
        // loop에 이름을 주면 break할 때 해당 loop를 종료할 수 있다.
        Loop1 : for(int i=2; i <= 9; i++) {
            for(int j=1; j<=9; j++) {
                if(j==5) {
                    break Loop1;
//                    break;
//                    continue Loop1;
//                    continue;
                }
                System.out.println(i + "*" + j + "=" + i*j);
            }// end of loop > continue 실행시
            System.out.println();
        } //end of Loop1 > continue Loop1 실행시
    }

    public void ex20() {
        int menu = 0, num = 0;
        Scanner scanner = new Scanner(System.in);

        outer: //while에 outer라 이름 붙임
        while(true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴(1~3) 선택. (종료: 0) >");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if(menu==0) {
                System.out.println("종료");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴 틀림, 종료: 0");
                continue;
            }
            for(;;) {
                System.out.println("계산할 값 입력(0: 종료, 전체 종료: 99) >");
                tmp = scanner.nextLine();
                num = Integer.parseInt(tmp);

                if(num==0) {
                    break;
                } else if(num==99) {
                    break outer;
                }

                switch(menu) {
                    case 1:
                        System.out.println("result="+num*num);
                        break;
                    case 2:
                        System.out.println("result="+Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("result="+Math.log(num));
                        break;
                }
            } // for loop
        } // while loop
    }
}

