public class SimpleList implements PythonListOfInt {
    private int[] array;
    public SimpleList(int[] array) {
        this.array = array;
    }
    public int findMax() {
        int max = Integer.MAX_VALUE;
        for(int a: array) {
            if(a > max) max = a;
        }
        return max;
    }
    public int findMin() {
        int min = Integer.MIN_VALUE;
        for(int a: array) {
            if(a < min) min = a;
        }
        return min;
    }
    public int findSum() {
        int sum = 0;
        for(int a: array) sum += a;
        return sum;
    }
    public boolean contains(int v) {
        for(int a: array) {
            if(a==v) return true;
        }
        return false;
    }
    public void add(int v) {
        int[] a = new int[array.length+1];
        for(int i=0;i<array.length;i++) {
            a[i] = array[i];
        }
        a[array.length]=v;
        array=a;
    }
}

