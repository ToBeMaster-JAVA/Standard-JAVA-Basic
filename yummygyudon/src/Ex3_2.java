public class Ex3_2 {
    public static void main(String[] args) {
        int x, y;
        x = 5 ;
        y = 0 ;

        y = x++;
        System.out.println("(후위형) y = x++ ; 실행 후 x = " + x + ", y = " + y) ;
        // (후위형) y = x++ ; 실행 후 x = 6, y = 5

        x = 5 ;
        y = 0 ;

        y = ++x;
        System.out.println("(전위형) y = ++x ; 실행 후 x = " + x + ", y = " + y) ;
        // (전위형) y = ++x ; 실행 후 x = 6, y = 6
    }
}
