public class Ex3_9 {
    public static void main(String[] args) {
        int a = 1_000_000 ; // 1백만
        int b = 2_000_000 ; // 2백만
        /*
         a와 b의 곱은 2,000,000,000,000으로 2조 라는 값이 나온다.
         int의 범위인 양/음수 약 20억 범위보다 훨씬 큰 값이기 때문에
         결과값의 타입은 int가 아닌 long이 되어야 한다.

         담으려는 변수는 long일지라도
         산술변환 특성상
         정수 연산을 하게되면 대입하려한 연산결과의 타입은 int형이 되기 때문에

         대입되는 것까지도 에러 발생되지 않지만
         평가결과 타입이 맞지않아 손실된 채로 저장된다.
         */
        long c = a * b ; // 담기긴 하지만 손실된 데이터임
        long d = (long)a * b ; // long + int로 int는 자동으로 long으로 변환되서 연산됨.


        System.out.println(c) ; // -1454759936
        System.out.println(d) ; // 2000000000000
    }
}
