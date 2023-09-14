package SortStrategy;

import java.util.NoSuchElementException;

class FindMinMaxStrategyImplementation implements FindMinMaxStrategy{

    @Override
    public int findMin(int[] array) {
        if (array.length == 0) throw new NoSuchElementException("No element in array");
        int min = Integer.MAX_VALUE;
        for(int a: array) {
            if(a < min) min = a;
        }
        return min;
    }

    @Override
    public int findMax(int[] array) {
        if (array.length == 0) throw new NoSuchElementException("No element in array");
        int max = Integer.MIN_VALUE;
        for(int a: array) {
            if(a > max) max = a;
        }
        return max;
    }

    @Override
    public void sortArray(int[] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortArray'");
    }

    @Override
    public int[] append(int value, int[] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'append'");
    }

    
}

class SortedFindMinMaxStrategy extends FindMinMaxStrategyImplementation{

    @Override
    public int findMin(int[] array) {
        if (array.length == 0) throw new NoSuchElementException("No element in array");
        return array[0];
    }

    @Override
    public int findMax(int[] array) {
        if (array.length == 0) throw new NoSuchElementException("No element in array");
        return array[array.length - 1];
    }

    @Override
    public void sortArray(int[] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortArray'");
    }

    @Override
    public int[] append(int value, int[] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'append'");
    }
    
}

class UnsortedFindMinMaxStrategy extends FindMinMaxStrategyImplementation{

    @Override
    public int findMin(int[] array) {
        if (array.length == 0) throw new NoSuchElementException("No element in array");
        return array[0];
    }

    @Override
    public int findMax(int[] array) {
        if (array.length == 0) throw new NoSuchElementException("No element in array");
        return array[array.length - 1];
    }

    @Override
    public void sortArray(int[] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortArray'");
    }

    @Override
    public int[] append(int value, int[] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'append'");
    }
    
}
