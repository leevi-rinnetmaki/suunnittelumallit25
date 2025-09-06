package strategy;

public class BubbleSort implements AlgorithmStrategy {

    public boolean checkIfSorted(int[] array){
        boolean sorted = true;
        for (int i = 1; i<array.length; i++){
            if(array[i-1]>array[i]){
                sorted=false;
            }
        }
        return sorted;
    }

    @Override
    public void sort(int[] array) {
        boolean sorted = false;
        while (!sorted){
            for (int i = 1; i<array.length; i++){
                if(array[i]<array[i-1]){
                    int first = array[i];
                    int second = array[i-1];
                    array[i] = second;
                    array[i-1] = first;
                }
            }
            sorted = checkIfSorted(array);
        }
    }
}
