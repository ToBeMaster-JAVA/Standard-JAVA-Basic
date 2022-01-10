class EX6_14 {
    static {
        System.out.println("static { }");
    }

    {
        System.out.println("{ }");
    }

    public EX6_14(){
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("EX6_14 bt = new EX6_14();");
        EX6_14 bt = new EX6_14();

        System.out.println("EX6_14 bt2 = new EX6_14();");
        EX6_14 bt2 = new EX6_14();
    }
}