public class Ex4_12 {
    public  static void main(String[] args) {
        int i =5;
        while(i--!=0) {
            System.out.println("시작 i : "+i);
            System.out.println(i + "번 남음_후위형");
        }
        System.out.println();

        int j =5;
        while(j!=0) {
            j--;
            System.out.println("시작 j : "+j);
            System.out.println(j + "번 남음_후위형");
        }
        System.out.println();
        int k = 5;
        while(k!=0) {
            System.out.println("시작 k : "+k);
            System.out.println(k + "번 남음_후위형 : 후위형이지만 출력문 이후 --k를 실행");
            --k;
        }
        System.out.println("아래와 달리 5는 출력되지만 2까지만 가능하다.");
        System.out.println();
        int s = 5;
        while(--s!=0) {
            System.out.println("시작 s : "+s);
            System.out.println(s + "번 남음_전위형(4번 반복) :5,4,3,2 일 경우만_ 1이 들어오면(--1 -> 0) 실행 불가");
        }
    }
}
