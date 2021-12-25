import java.util.Scanner; // Scanner 클래스 사용하기 위해 import시킴

class EX2_10 {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in); // Scanner 클래스의 객체를 생성

        System.out.print("두 자리 정수를 하나 입력해주세요:");
        String input = scanner.nextLine();  // 입력받은 내용을 input에 저장
        // nextLine() 메서드 호출하면 입력 대기 상태에 있다가 입력을 마치고 엔터키를 누르면 입력한 내용이 문자열로 반환
        int num = Integer.parseInt(input); // 입력 받은 문자열을 숫자로 변환

        System.out.println("입력내용 :" + input);
        System.out.printf("num=%d%n", num);
    }
}