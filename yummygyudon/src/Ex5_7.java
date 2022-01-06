public class Ex5_7 {
    public static void main(String[] args) {
        System.out.println("Properties : " + args.length +"개");

        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = \"" + args[i] + "\"");
        }
    }
}
