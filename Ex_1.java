package Home_Tasks.HT_13;

import java.util.Arrays;

//1. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//        каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//        Если длины массивов не равны, необходимо как-то оповестить пользователя.
public class Ex_1 {

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrDifference = diffOfArr(arr1, arr2);
        if (arrDifference != null)
            System.out.println(Arrays.toString(arrDifference));
    }

    private static int[] diffOfArr(int[] arr1, int[] arr2) {
        //Под "оповещением" я понял такой алгоритм:
        if (arr1 == null || arr2 == null) {
            System.out.println("Array is null");
            return null;
        }
        //Под "оповещением" я понял такой алгоритм:
        if (arr1.length != arr2.length) {
            System.out.println("\n\uD83D\uDE03 Arrays length isn't equal \uD83D\uDE03");
            return null;
        }
        int[] arr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i] - arr2[i];
        }
        return arr;
    }
}
