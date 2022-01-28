package week5;

public class Ex9 {
    public static void main() throws Exception{
        method1();
    }

    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        throw new Exception();
    }
}
