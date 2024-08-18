import java.util.Arrays;
import java.util.List;

public class Main {
    public static int bubbleSort(int[] array, int length, int begin) {
        if(begin == length) {return  0;};

        for(int i = begin; i < length; i++) {
            for(int j = begin+1; j < length; j++) {
                if(array[begin] > array[j]) {
                    int temp = array[begin];
                    array[begin] = array[j];
                    array[j] = temp;
                }
             }
        }
        begin++;
        return bubbleSort(array, length, begin);
    }

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(12, 2, 4, 65, 2, 1, 45, 6);
        int[] integerArray = {2, 4, 6, 8, 1, 12, 5};

        System.out.println("Sum of all array numbers: " + Arrays.stream(integerArray).sum());
        System.out.println("Sum of all list numbers: " + integerList.stream().reduce(0, Integer::sum));

        bubbleSort(integerArray, integerArray.length, 0);
        for(int x : integerArray) {
            System.out.print(x + " ");
        }
    }
}