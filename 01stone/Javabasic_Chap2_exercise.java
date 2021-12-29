// 1.
/*
*       1byte  2byte 4byte 8byte
* 논리형 boolean
* 문자형        char
* 정수형 byte   short  int  long
* 실수형              float double
* */

// 2.
// True(ture), NULL(null), Class(class), System(?)

// 3.
// 0 ~ 2^(16)-1

public class Javabasic_Chap2_exercise {
    public static void main(String args[]) {
        System.out.println("2. 2,3,4,5");
        System.out.println();

        System.out.println("3. " + 0 +" ~ " + (Math.pow(2, 16)-1));
        System.out.println();

//        byte b = 256;
//        char c = '';
//        char answer = 'no';
//        float f = 3.14
        double d = 1.2e3f;
        System.out.println("4. 1,2,3,4");
        System.out.println();

        System.out.println("5. 리터럴 : 100, 100L, 3.14f");
        System.out.println("키워드 : int, long, final, float");
        System.out.println("변수 : i, l");
        System.out.println("상수 : PI");
        System.out.println();

        System.out.println("6. 2");
        System.out.println();

        System.out.println("7.");
        System.out.println("1" + "2");
        System.out.println(true + "");
        System.out.println('A' + 'B');
        System.out.println('1' + 2);
        System.out.println('1' + '2');
        System.out.println('J' + "ava");
        System.out.println("true + null : error");
        System.out.println();

        System.out.println("8.");
        int x = 1, y = 2, z = 3;

        int temp = x;
        x = y;
        y = z;
        z = temp;

        System.out.println("x= "+ x);
        System.out.println("y= "+ y);
        System.out.println("z= "+ z);



    }
}
