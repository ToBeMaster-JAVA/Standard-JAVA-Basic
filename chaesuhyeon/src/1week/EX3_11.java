class EX3_11 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0; // 실수로 나눠줘서 소숫점까지 표현됨
        System.out.println(shortPi);
    }
}