package algorithms.sort;

public class InsertionSort {

    //https://www.ee.ryerson.ca/~courses/coe428/sorting/insertionsort.html
    public static void main(String[] args) {
        int[] dataToSort = {9, 5, 6, 3, 2, 8, 1, 4, 6, 5};
        int indexOfTheCurrentElement = 1;
        for (int i = 0; i < dataToSort.length - 1; i++) {
            for (int j = indexOfTheCurrentElement; j > 0; j--) {
                if (dataToSort[j] < dataToSort[j - 1]) {
                    int dataAtNextElement = dataToSort[j - 1];
                    dataToSort[j - 1] = dataToSort[j];
                    dataToSort[j] = dataAtNextElement;
                }
            }
            indexOfTheCurrentElement++;
        }
        for (int i = 0; i < dataToSort.length; i++) {
            System.out.println(dataToSort[i]);
        }
    }
}
