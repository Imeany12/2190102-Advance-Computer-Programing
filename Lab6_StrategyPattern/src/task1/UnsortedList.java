package task1;

public class UnsortedList extends PythonList{

    public UnsortedList(int[] array) {
        super(array);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void append(int v) {
        // TODO Auto-generated method stub
        int[] array = super.getArray();
        int[] a = new int[array.length+1];
        for(int i=0;i<array.length;i++) {
        a[i] = array[i];
        }
        a[array.length]=v;
        super.setArray(a);
    }
    
}
