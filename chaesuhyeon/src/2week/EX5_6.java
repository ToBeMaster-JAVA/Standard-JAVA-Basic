class EX5_6 {
    public static void main(String args[]) {
        String[] name = {"lee", "park", "kim"};

        for(int i=0; i < name.length; i++){
            System.out.println("name["+i+"] : " + name[i]);
        }

        String tmp = name[2];
        System.out.println("tmp : "+ tmp);
        name[0] = "choi";

        for(int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }
    } // main 끝
} // end of class