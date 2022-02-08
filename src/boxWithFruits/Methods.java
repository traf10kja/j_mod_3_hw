package boxWithFruits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Methods {
    public static void main(String[] args) {
        Integer[] intArr = {1, 5, 6, 87, 1, 7, 0};
        System.out.println(Arrays.toString(intArr));

        String[] stringArr = {"qqq", "www", "rrr"};
        System.out.println(Arrays.toString(stringArr));

        Methods meth = new Methods();
        meth.swap(intArr, 2, 5);
        System.out.println(Arrays.toString(intArr));

        meth.toArrayList(intArr);

        meth.swap(stringArr, 0, 2);
        System.out.println(Arrays.toString(stringArr));

        meth.toArrayList(stringArr);

    }

    /**
     * Метод, который меняет два элемента массива местами
     */
    public <T> void swap(T[] arr, int i, int j) {
        T t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    /**
     * Метод, который преобразует массив в ArrayList
     * */
    public <T> void toArrayList(T[] arr) {
        List<T> listOf = new ArrayList<>(Arrays.asList(arr));
        System.out.println(listOf);
    }

}
