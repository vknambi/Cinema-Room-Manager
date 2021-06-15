import java.util.Arrays;

class ArrayOperations {
    public static int[][][] createCube() {
        // write your code here
        int[][][] arr = new int[3][3][3];

        int element = 0;

        for (int i = 0; i < arr.length; i++) {
            element = 0;
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = element;
                    element++;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[][][] arr3d = createCube();
        for (int[][] arr2d : arr3d) {
            for (int[] arr : arr2d) {
                System.out.print(Arrays.toString(arr));
            }
            System.out.println();
        }
    }

}
