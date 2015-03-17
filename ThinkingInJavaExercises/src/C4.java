/**
 * Created by apple on 15-3-13.
 */
public class C4 {
    public static void main(String[] args) {
        e10();
    }

//    private static void printArr(int[] arr) {
//        for (int i : arr) {
//            System.out.println(i);
//        }
//    }

    private static void e10() {
        for (int i = 10; i <= 99; ++i) {
            for (int j = i; j <= 99; ++j) {
                if (isVamPireNumber(i, j)) {
                    System.out.println("VampireNumber: " + i * j + " = " + i + " * " + j);
                }
            }
        }
    }

    private static boolean isVamPireNumber(int i, int j) {
        int n = i * j;
        int i1 = i % 10, i2 = i / 10;
        int j1 = j % 10, j2 = j / 10;
        int n1 = n % 10;
        int n2 = n % 100 / 10;
        int n3 = n % 1000 / 100;
        int n4 = n / 1000;

        int[] arr1 = {i1, i2, j1, j2};
        int[] arr2 = {n1, n2, n3, n4};
        bubblesort(arr1);
        bubblesort(arr2);
        for (int c = 0; c < 4; ++c) {
            if (arr1[c] != arr2[c]) {
                return false;
            }
        }
        return true;

    }

    static void bubblesort(int[] arr) {
        int i = arr.length - 1;
        while (i > 0) {
            int j = 0;
            while (j <= i - 1) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j + 1] + arr[j];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
                ++j;
            }
            i--;
        }

    }
}
