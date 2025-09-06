package strategy;

public class InsertionSort implements AlgorithmStrategy {

    @Override
    public void sort(int[] array){
        for(int i=1; i<array.length; i++){
            if(array[i]<array[i-1]){
                for(int j=0; j<i; j++){
                    if(array[i]<array[j]){
                        int k = array[i];
                        for(int l = i; l>j; l--){
                            array[l]=array[l-1];
                        }
                        array[j]=k;
                    }
                }
            }
        }
    }
}
