package strategy;

import java.util.Arrays;

public class Main {


    public static int[] createArray(int length){
        int[] array = new int[length]; 
        for(int i = 0; i<length; i++){
            array[i] = (int)(Math.random()*100);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array0 = createArray(20);
        int[] array1 = createArray(20);
        int[] array2 = createArray(14);


        
        AlgorithmContext sorter = new AlgorithmContext();
        sorter.setStrategy(new BubbleSort());
        System.out.println(Arrays.toString(array0));
        sorter.sort(array0);
        System.out.println(Arrays.toString(array0));

        sorter.setStrategy(new InsertionSort());
        System.out.println(Arrays.toString(array1));
        sorter.sort(array1);
        System.out.println(Arrays.toString(array1));

        sorter.setStrategy(new RandomSort());
        System.out.println(Arrays.toString(array2));
        sorter.sort(array2);
        System.out.println(Arrays.toString(array2));

    }
}
