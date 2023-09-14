package SortStrategy;

public abstract class PythonList {
    private int[] array;
    private FindMinMaxStrategy findMinMaxStrategy;
    
    public PythonList(int[] array){
        this.array = array;
    }

    public void setFindMinMaxStrategy(FindMinMaxStrategy findMinMaxStrategy) {
        this.findMinMaxStrategy = findMinMaxStrategy;
    }

    public void sort(){
        for (int lastIndex = array.length - 1; lastIndex >= 1; lastIndex--) {
            for (int i = 0; i < lastIndex; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    public int findMin(){
        return findMinMaxStrategy.findMin(array);
    }

    public int findMax(){
        return findMinMaxStrategy.findMax(array);
    }
}

class SortedList extends PythonList{
    public SortedList(int[] array) {
        super(array);
        sort();
    }
    
}

class UnsortedList extends PythonList{
    public UnsortedList(int[] array) {
        super(array);
    }
    
}
