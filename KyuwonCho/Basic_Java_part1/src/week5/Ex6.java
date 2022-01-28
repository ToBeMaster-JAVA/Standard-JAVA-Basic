package week5;

public class Ex6 {
    public static void main() {
        try {
            Exception e = new Exception("고의 예외");
            throw e; // 예외 발생
        } catch (Exception e) {
            System.out.println("에러 메시지: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
