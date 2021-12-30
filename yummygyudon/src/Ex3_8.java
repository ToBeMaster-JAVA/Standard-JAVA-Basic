public class Ex3_8 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        /*
         a와 b가 byte형으로 int보다 작기 때문에
         산술하게되면 자동으로 int형으로 산술변환 되기때문에
         저장되는 변수가 int타입이거나 더 넓은 범위여야 함.
         byte c = a + b ; 는 incompatible types: possible lossy conversion from int to byte 에러
         */
        int c = a + b; //정상적인 값 저장
        int d = a * b;
        System.out.println(c) ;
        System.out.println(d) ;

        //강제 형변환 해주었을 때는 '손실'발생
        byte e = (byte)(a+b) ;
        byte f = (byte)(a*b) ;

        System.out.println(e) ; // byte 범위 내의 값이기 때문에 손실은 발생하지 않음 _ (byte) 강제 형변환되면 산술연산 가능
        System.out.println(f) ; // -56 _ 연산은 가능해졌지만 데이터 손실 발생
    }
}
