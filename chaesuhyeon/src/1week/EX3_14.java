class EX3_14 {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 =  new String("ABC");

        System.out.printf("\"ABC\" ==\"ABC\" ? %b%n", "ABC" == "ABC");
        System.out.printf(" str1 ==\"ABC\" ? %b%n", str1 == "ABC");
        System.out.printf(" str2 ==\"ABC\" ? %b%n", str2 == "ABC");
        System.out.printf(" str1.equals(\"ABC\") ? %b%n", str1.equals("ABC"));
        System.out.printf(" str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
        System.out.printf(" str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
        System.out.printf(" str2.equalsIgnoreCase(\"abc\") ? %b%n", str2.equalsIgnoreCase("abc"));
    }
}