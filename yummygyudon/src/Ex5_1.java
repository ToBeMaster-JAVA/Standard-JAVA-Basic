import java.util.Arrays ;
public class Ex5_1 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10] ;
        int[] iArr2 = new int[10] ;
        int[] iArr3 = new int[]{100, 95, 80, 70, 60} ;
//      int[] iArr3 = {100, 95, 80, 70, 60} ; //위와 같은 형식의 배열 생성 방법
        char[] chArr = {'a', 'b', 'c', 'd'} ;

        for (int i = 0; i < iArr1.length ; i++) {
            iArr1[i] = i+1 ;// 1~10 채우기
        }
        for (int i = 0; i < iArr2.length ; i++) {
            iArr2[i] = (int)(Math.random()*10 + 1) ; // 1~10 범위내 난수 채우기 _ 0.0일 경우 대비 +1
        }

        for (int i = 0; i < iArr1.length ; i++) {
            System.out.print(iArr1[i] + ",") ;
        }
        System.out.println() ;

        System.out.println(Arrays.toString(iArr2)) ;
        System.out.println(Arrays.toString(iArr3)) ;
        System.out.println(Arrays.toString(chArr)) ;
        System.out.println(chArr) ;
        System.out.println(iArr3) ;
    }
}
