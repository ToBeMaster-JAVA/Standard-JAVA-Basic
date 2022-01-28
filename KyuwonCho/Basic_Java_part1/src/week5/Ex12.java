package week5;

public class Ex12 {
    public static void main() {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main메서드에서 예외처리");
        }
    }

    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1에서 예외처리");
            throw e;
        }
    }
}
