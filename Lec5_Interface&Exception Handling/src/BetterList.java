public class BetterList implements PythonListOfInt {
    private int[] array;
    public BetterList(int[] a) {
        array = a;
        // implements bubblesort for integer array array
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
    public int findMax() {
        return array[array.length - 1];
    }
    public int findMin() {
        return array[0];
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
        int i = 0;
        while(v > array[i]) {
            a[i] = array[i];
            i++;
        }
        a[i++] = v;
        for(int j=i-1;j<array.length;j++) {
            a[i++] = array[j];
        }
        array=a;
    }
}
