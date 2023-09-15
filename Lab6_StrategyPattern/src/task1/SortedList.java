package task1;

public class SortedList extends PythonList {

    public SortedList(int[] array) {
        super(array);
        super.sort();
        //TODO Auto-generated constructor stub
    }


    @Override
    public void append(int v) {
        // TODO Auto-generated method stub
        int[] array = super.getArray();
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
        super.setArray(a);
        super.sort();
    }

    public boolean contains(int v){
    int left = 0;
    int [] array = super.getArray();
    int right = array.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;

        // If the middle element is equal to v, return true
        if (array[mid] == v) {
            return true;
        }

        // If v is less than the middle element, search in the left half
        if (array[mid] > v) {
            right = mid - 1;
        }
        // If v is greater than the middle element, search in the right half
        else {
            left = mid + 1;
        }
    }

    // If the loop finishes without finding v, return false
    return false;
    }
    
}
