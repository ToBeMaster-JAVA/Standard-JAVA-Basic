class EX2_7 {
    public static void main(String[] args){
        String name = "JA" + "VA";
        String str = name + 5.0;

        System.out.println(name);
        System.out.println(str);
        System.out.println(5+" ");
        System.out.println(" " + 5);
        System.out.println(5+"");
        System.out.println("" + 5);
        System.out.println("" + "");
        System.out.println(5 + 5 + ""); // 10연산 후에 문자열로 변환 됨  10
        System.out.println("" + 5 + 5); // 5가 문자열로 변환 된 후 나머지 5도 문자열로 변환 55
    }
}