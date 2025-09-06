package strategy;

public class AlgorithmContext {
    AlgorithmStrategy strategy;

    public void setStrategy(AlgorithmStrategy strategy){
        this.strategy = strategy;
    }

    public void sort(int[] array){
        strategy.sort(array);
    }
}
