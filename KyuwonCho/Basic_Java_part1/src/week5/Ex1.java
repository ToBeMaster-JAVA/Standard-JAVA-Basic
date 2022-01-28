package week5;

public class Ex1 {
    public static void main() {
        System.out.println(1);
        try {
            System.out.println(2);
            System.out.println(3);
        } catch (Exception e) {
            System.out.println(4);
        }
        System.out.println(5);
    }
}
