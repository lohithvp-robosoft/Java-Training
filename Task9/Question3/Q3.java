//iii. Write a generic method swap that swaps the values of two elements in an array. The method should work for any type of array.
//===================================================

package Task9.Question3;

import java.util.Arrays;

public class Q3 {
    public static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        Integer[] arrInt = {1, 2, 3, 4, 5, 6};
        String[] arrStr = {"Hi", "Hello", "Hey", "Hola"};
        Character[] arrChar = {'a', 'b', 'c', 'd', 'e'};

        swap(arrStr, 1, 3);
        swap(arrInt, 1, 2);
        System.out.println(Arrays.toString(arrInt));
        swap(arrChar, 2, 3);


    }
}
