package algorithms.sort;


//https://www.khanacademy.org/computing/computer-science/algorithms/sorting-algorithms/a/selection-sort-pseudocode
public class SelectionSort {

    public static void main(String[] args) {
        int[] dataToSort = {9, 5, 6, 3, 2, 8, 1, 4, 6, 5};
        int currentReplaceIndex = 0;
        for (int i = 0; i < dataToSort.length; i++) {
            int indexOfCurrentSmallestNumber = currentReplaceIndex;
            for (int j = currentReplaceIndex; j < dataToSort.length; j++) {
                if (dataToSort[j] < dataToSort[indexOfCurrentSmallestNumber]) {
                    indexOfCurrentSmallestNumber = j;
                }
            }
            int valueAtCurrentReplaceIndex = dataToSort[currentReplaceIndex];
            dataToSort[currentReplaceIndex] = dataToSort[indexOfCurrentSmallestNumber];
            dataToSort[indexOfCurrentSmallestNumber] = valueAtCurrentReplaceIndex;
            currentReplaceIndex++;
        }
        for (int i = 0; i < dataToSort.length; i++) {
            System.out.println(dataToSort[i]);
        }
    }
}
