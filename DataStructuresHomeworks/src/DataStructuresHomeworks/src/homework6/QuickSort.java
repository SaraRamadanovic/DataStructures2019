package DataStructuresHomeworks.src.homework6;


public class QuickSort {

    public Object[] getArray() {
        return array;
    }

    private Object array[];
    private int length;

    public void sort(Object[] inputArr) {

        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        //int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
        String pivot = ((String[]) array[lowerIndex + (higherIndex - lowerIndex) / 2])[5];

        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a
             * number from right side which is less then the pivot value. Once
             * the search is done, then we exchange both numbers.
             */

            while (((String[]) array[i])[5].compareTo(pivot) < 0) {
                i++;
            }
            while (((String[]) array[j])[5].compareTo(pivot) > 0) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    private void exchangeNumbers(int i, int j) {
        Object temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
