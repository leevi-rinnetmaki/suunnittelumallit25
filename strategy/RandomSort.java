package strategy;

import java.util.Arrays;

public class RandomSort implements AlgorithmStrategy {
    
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
    public void sort(int[] array){
        int memory;
        int random1;
        int random2;

        while(!checkIfSorted(array)){
            random1=(int)(Math.random()*array.length);
            random2=(int)(Math.random()*array.length);

            memory=array[random1];
            array[random1]=array[random2];
            array[random2]=memory;
            System.out.println(Arrays.toString(array));
        }
    }
}
