import java.util.Arrays; // Arrays.toString() 사용하기 위해 추가
class EX5_1 {
    public static void main(String args[]) {
        int[] iArr1 = new int[10]; // index 0 ~ 9
        int[] iArr2 = new int[10];
        //     int[] iArr3 = new int[]{100,95,80,70,60};
        int[] iArr3 = {100,95,80,70,60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for(int i=0; i < iArr1.length; i++){
            iArr1[i] = i+1; // i = 1 ~ 10
        }

        for(int i=0; i < iArr2.length; i++){
            iArr2[i] = (int)(Math.random()*10) +1 ;
            // 1 ~ 10의 난수 값을 배열에 저장
        }

        for(int i = 0; i < iArr1.length; i++){
            System.out.print(iArr1[i] + ",");
        }
        System.out.println();

        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3); // 실행할 때 마다 달라질 수 있음
        System.out.println(chArr);
    } // main 끝
}