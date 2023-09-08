interface PythonListOfInt {
    int findMax();
    int findMin();
    int findSum();
    boolean contains(int element);
    void add(int element);
}

 class SimpleListOfInt implements PythonListOfInt {
    private int[] array;
    public SimpleListOfInt(int[] array) {
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

class BetterListOfInt implements PythonListOfInt {
    private int[] array;
    public BetterListOfInt(int[] a) {
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


public class App {
    public static void main(String[] args) throws Exception{
        int[] a = {1, 2, 6, 4, 3, 2, 1};
        PythonListOfInt x = new BetterListOfInt(a);
        x.add(4);
        int[] b = {};
        PythonListOfInt y = new SimpleListOfInt(b);
        try {
            y.findMax();
            System.out.println(("hi"));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("yes");
        }
    }
}
