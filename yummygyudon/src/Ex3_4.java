public class Ex3_4 {
    public static void main(String[] args) {
        int x;
        x = -10;
        x = + x; // 부호연산자 '+'는 효과가 없음 +(-)나 -(+)은 그대로 -가 되는 형식
        System.out.println(x);

        x = -10;
        x = - x; // +(+)나 -(-)는 양수가 되는 공식
        System.out.println(x);
    }
}
