package week6;

public class Ex8 {
    public static void main() {
        char[] cArr = new char[0];
        String s = new String(cArr);

        System.out.println("cArr.length = " + cArr.length);
        System.out.println("@@@" + s + "@@@");
    }
}
