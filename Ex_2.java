package Home_Tasks.HT_13;

import java.util.Arrays;

//2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//        каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
//        Если длины массивов не равны, необходимо как-то оповестить пользователя.
//        Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
public class Ex_2 {
    public static void main(String[] args) {

        int[] arr1 = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        double[] arrDivision = divOfArr(arr1, arr2);
        System.out.println(Arrays.toString(arrDivision));
    }

    private static double[] divOfArr(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new RuntimeException("Array is null");
        }
        if (arr1.length != arr2.length) {
            throw new RuntimeException("\uD83D\uDE32 Arrays length isn't equal \uD83D\uDE32");
        }
        double[] arr = new double[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0 || arr2[i] == 0) {
                throw new RuntimeException("Arrays elements contains \"0\"");
            } else
                arr[i] = arr1[i] * 1.0 / arr2[i];
        }
        return arr;
    }
}
