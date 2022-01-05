public class Ex4_11 {
    public static void main(String[] args) {
        // 별찍기
        for  (int a = 1; a<=11;a++) { //1차 반복 : 총 층수
            for (int b = 1; b <= 11-a; b++){
                System.out.print(" ");
            }
            for (int s = 1; s <= a*2-1;s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
