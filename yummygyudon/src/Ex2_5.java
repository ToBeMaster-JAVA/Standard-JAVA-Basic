public class Ex2_5 {
    public static void main(String args[]) {
        int x = 10 ;
        int y = 5 ;
        System.out.println(x+y); // 15
        System.out.println(x-y); // 5
        System.out.println(x*y); // 50
        System.out.println(x/y); // 2

        x = 5;// 재선언&대입
        System.out.println(x) ; // 5
        System.out.println(x+y); // 10 _ 바뀐 값 반영됨.
    }
}
