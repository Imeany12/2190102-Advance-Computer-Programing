package task1;

import java.util.NoSuchElementException;

public abstract class PythonList implements FindMinMaxStrategy {
    private int[] array;
    
    public PythonList(int[] array){
        this.array = array;
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

    public boolean contains(int v) {
        for(int i = 0; i < array.length;i++) {
            if(v == array[i]) {
                return true;
            };
        }
        return false;
    }

    public String toString() {
        if(array.length == 0) return "[]";
        String out = "[";
        for(int a:array) {
            out += a+", ";
        }
        out = out.substring(0,out.length()-2)+"]";
        return out;
    }

    public int findMax(){
        if (array.length == 0) throw new NoSuchElementException("No element in array");
        int max = Integer.MIN_VALUE;
        for(int a: array) {
            if(a > max) max = a;
        }
        return max;
    }
    public int findMin(){
        if (array.length == 0) throw new NoSuchElementException("No element in array");
        int min = Integer.MAX_VALUE;
        for(int a: array) {
            if(a < min) min = a;
        }
        return min;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

  
}