package week2;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.copyOf;

public class Arrays_java {
    public static void main(String[] args) {
        Arrays_java examples = new Arrays_java();
        examples.pro6();

//        System.out.println("매개변수의 개수: " + args.length);
//        for (int i=0; i<args.length; i++) {
//            System.out.printf("args[%d] = "+args[i], i);
//            System.out.println();
//        }
    }

    public void practice() {
        /*
        배열: 같은 타입의 데이터를 한 곳에 묶어서 다루는 변수
        (파이썬 list와 비슷하지만 파이썬 list는 다른 타입도 같이 묶을 수 있음)

        생성: 원하는 타입 옆에 대괄호 []를 붙여 배열로 선언
        int[] test_variable;
        이렇게 한다고 배열이 만들어진 것은 아니다. 이 변수를 배열로 쓸 것이라고만 정해둔 것
        test_variable = new int[10]
        이렇게 원하는만큼의 데이터 수를 정해주고 나서야 정수 10개분의 자리가 확보된 배열이 만들어진 것.

        만약 한번에 만들고 싶다면,, 합쳐주자..
        int[] test_variable = new int[10]
        test_variable을 정수를 위한 배열로 선언함과 동시에 10자리를 확보해주는 것.
        */
        int[] array1;
        array1 = new int[5];

        int[] array2 = new int[5];
        // array2[0] ~ array2[4] 까지 존재 총 5개

        // array.length로 배열의 길이를 알수 있음.. 파이썬과 같이 length는 1부터 계산
        // -> length-1까지 배열을 집어 넣을 수 있음. length가 5면 0, 1, 2, 3, 4 까지..
        for (int i=0; i<array2.length; i++) {
            array2[i] = (i+1) * 10;
            System.out.println(array2[i]);
        }
        //for 루프를 돌려서 initialize도 가능하지만
        // 배열을 만들때 바로 줘도 됨 중괄호로 {}
        int[] array3 = new int[]{1, 2, 3};

        int[] array4 = {1, 2, 3};

        int[] array5;
        array5 = new int[]{1, 2, 3, 4};


    }

    public void ex1() {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
//        int[] iArr3 = new int[]{100, 95, 80, 70, 60};
        int[] iArr3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for (int i=0; i<iArr1.length; i++) {
            iArr1[i] = i + 1;
        }

        for (int i=0; i<iArr2.length; i++) {
            iArr2[i] = (int)(Math.random() * 10) + 1;
        }

        for (int i=0; i<iArr1.length; i++) {
            System.out.print(iArr1[i]+", ");
        }

        System.out.println();

        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3); // 주소를 보여준다
        /*
        character Array는 출력시 문자열처럼 출력된다.
        C와 C++에서는 문자 배열은 문자열과 같지만 자바에서는 둘은 다르다
        두개 다 문자의 모음이지만 서로가 가지고 있는 특성이 다르다.
        String은 하나의 데이터 타입 vs 문자 배열은 문자의 모음
        String은 부분 수정 불가 vs 문자 배열은 중간 수정 가능 (chArray[i] = 'd')
        문자열만의 built in function 존재 vs 문자 배열을 위한 built in function 없음
        +로 문자열 더하기 가능 vs 이미 정해져 있는 크기이기 때문에 + 불가
        문자열은  String Constant Pool을 사용
        추후에 나옴.... 괜히 찾아봄
        */
        System.out.println(chArr);

    }

    public void ex2() {
        int sum = 0;
        float average = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for (int i=0; i<score.length; i++) {
            sum += score[i];
        }
        average = sum / (float) score.length;

        System.out.println("총합: " + sum);
        System.out.println("평균: " + average);
    }

    public void ex3() {
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0];
        int min = score[0];

        for (int i=1; i<score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }

    public void ex4() {
        int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(numArr));

        for (int i=0; i<100; i++) {
            int n = (int)(Math.random() * 10);
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }
        System.out.println(Arrays.toString(numArr));
    }

    public void ex5() {
        int[] ball = new int[45];

        for (int i=0; i<ball.length; i++) {
            ball[i] = i+1;
        }

        int tmp = 0;
        int j = 0;

        for (int i=0; i<6; i++) {
            j = (int)(Math.random() * 45);
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
        }

        for (int i=0; i<6; i++) {
            System.out.printf("ball[%d] = %d%n", i, ball[i]);
        }
    }

    public void ex6() {
        // String 또한 다른 것들과 같다.  ch만 좀 다름
        String[] names = {"Kim", "Park", "Yi"};

        for (int i=0; i<names.length; i++) {
            System.out.printf("names[%d]: "+names[i], i);
            System.out.println();
        }

        String tmp = names[2];
        System.out.println("tmp: " + tmp);
        names[0] = "Yu";

        for (int i=0; i<names.length; i++) {
            System.out.println(names[i]);
        }
    }
    /*
    String 클래스 = Character Array + Methods
    Methods:
        charAt(index: int)                          -> char
        length()                                    -> int
        substring(from index: int, to index: int)   -> String
        equals(object: another string)              -> boolean
        toCharArray()                               -> char[]

    String 클래스 -> String Constant Pool에 저장
        literal로 string 저장시 String Constant Pool에 저장
        String a = "123"; 으로 저장시, String Constant Pool에 저장되고,
        String b = "123"; 처럼 같은 값을 b에 저장해주면 같은 주소값(String Constant Pool)을 가지게 된다
        a == b 확인시 true가 나옴.

        String c = new String("abc"); 을 사용하면 새로운 객체를 만들게 되므로,
        a == c는 false가 된다.

        앞에서 작성한 것과 같이 ==는 주소값을 비교하는 것이고, 값을 비교하기 위해서는
        a.equals(c) 또는 c.equals(a)로 비교하면 된다.
    */

    public void ex7() {
        // 7번 예제는 메인함수에서 진행
        // 매개변수를 넣음으로 메인함수 실행 시 같이 args에 넣어주게 된다.
    }

    // 2차원 배열은 배열 안에 또다른 배열들의 묶음이라고 보면 된다. 나머지는 같다.
    public void ex8() {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40}
        };
        int sum = 0;

        for (int i=0; i<score.length; i++) {
            for (int j=0; j<score[i].length; j++) {
                System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);

                sum += score[i][j];
            }
        }

        System.out.println("sum = " + sum);
    }

    public void ex9() {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50}
        };

        int korTotal = 0, engTotal = 0, mathTotal = 0;

        System.out.println("번호  국어  영어  수학  총점  평균 ");
        System.out.println("===============================");

        for (int i=0; i < score.length; i++) {
            int sum = 0;
            float avg = 0.0f;

            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];
            System.out.printf("%3d", i+1);

            for (int j=0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("%5d", score[i][j]);
            }

            avg = sum/(float)score[i].length;
            System.out.printf("%5d %5.1f%n", sum, avg);
        }

        System.out.println("===============================");
        System.out.printf("총점: %3d %4d $4d%n", korTotal, engTotal, mathTotal);
    }

    public void ex10() {
        String[][] words = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"}
        };

        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<words.length; i++) {
            System.out.printf("Q%d. %s의 뜻? ", i+1, words[i][0]);

            String tmp = scanner.nextLine();

            if (tmp.equals(words[i][1])) {
                System.out.printf("정답!%n%n");
            } else {
                System.out.printf("틀림! 정답: %s%n%n", words[i][1]);
            }
        }
    }
    /*
    * 비교: equals()
    * 출력: toString(array)
    * 복사: copyOf(array, end_index)
    * 부분 복사: copyOfRange(arr, start_index, end_index)
    * 정렬: sort() -> 느림
    * */

    public void pro1_2() {
        /*
        Problem1.
            * 1. int[] arr[]; 2차원 배열
            * 2. int[] arr = {1, 2, 3,}; 쉼표 있어도 됨
            * 3. int[] arr = new int[5]
            * 4. int[] arr = new int[5]{1, 2, 3, 4, 5} -> int[] arr = {1, 2, 3, 4, 5}
            * 5. int arr[5]; -> int arr[] = new int[5];
            * 6. int[] arr[] = new int[3][]; 2차원 배열
        */

        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10},
                {20, 20, 20, 20},
                {30, 30} //arr[3]
        };
        System.out.println(arr[3].length == 2);
    }

    public void pro3() {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i=0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum); //150
    }

    public void pro4() {
        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };

        int total = 0;
        float average = 0;

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                total += arr[i][j];
            }
        }

        average = (float)total/(arr.length * arr[0].length);

        System.out.println("total = " + total);
        System.out.println("average = " + average);
    }

    public void pro5() {
        int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ball3 = new int[3];

        for (int i=0; i<ballArr.length; i++) {
            int j = (int)(Math.random() * ballArr.length);
            int tmp = 0;

            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }

        ball3 = copyOf(ballArr, 3);

        for (int i=0; i<ball3.length; i++) {
            System.out.print(ball3[i]);
        }
    }

    public void pro6() {
        String[] words = {"television", "computer", "mouse", "phone"};

        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<words.length; i++) {
            char[] question = words[i].toCharArray();
            for (int j=0; j<question.length; j++) {
                int k = (int)(Math.random() * question.length);
                char tmp = ' ';

                tmp = question[j];
                question[j] = question[k];
                question[k] = tmp;
            }

            System.out.printf("Q%d. %s의 정답 입력 > ", i, new String(question));

            String answer = scanner.nextLine();

            if (words[i].equals(answer.trim())) {
                System.out.printf("정답!%n");
            } else {
                System.out.println("틀림!");
            }

        }
    }
}
