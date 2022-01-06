import java.util.Arrays ;
public class Ex5_practice {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(Arrays.toString(arr1)); // [1, 2, 3]
        System.out.println(Arrays.deepToString(arr2)); //[[1, 2, 3],[4, 5, 6]]


        String[][] str2D = {
                {"chair", "의자"},
                {"bed", "침대"}
        };
        String[][] str2D2 = {
                {"chair", "의자"},
                {"bed", "침대"}
        };

        System.out.println(Arrays.equals(str2D, str2D2)); //false
        System.out.println(Arrays.equals(str2D[0], str2D2[0])); // true
        System.out.println(Arrays.deepEquals(str2D, str2D2)); // true

        int[] array = {0, 1, 2, 3, 4};
        int[] array2 = Arrays.copyOf(array, array.length) ; //
        int[] array3 = Arrays.copyOf(array, 3) ; //
        int[] array4 = Arrays.copyOf(array, 7) ; //
        int[] array5 = Arrays.copyOfRange(array, 2, 4) ; //
        int[] array6 = Arrays.copyOfRange(array, 0, 7) ; //

        System.out.println(Arrays.toString(array)) ;
        System.out.println(Arrays.toString(array2)) ;
        System.out.println(Arrays.toString(array3)) ;
        System.out.println(Arrays.toString(array4)) ;
        System.out.println(Arrays.toString(array5)) ;
        System.out.println(Arrays.toString(array6)) ;
    }
}
