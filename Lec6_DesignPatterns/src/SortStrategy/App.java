package SortStrategy;

public class App {
    public static void main(String[] args) {
        int[] d1 = { 2,3,8,4,5,10 };
        SortedList l1 = new SortedList(d1);
        l1.setFindMinMaxStrategy(new UnsortedFindMinMaxStrategy());
        System.out.println(l1.findMax());
        System.out.println(l1.findMin());
        l1.setFindMinMaxStrategy(new SortedFindMinMaxStrategy());
        System.out.println(l1.findMax());
        System.out.println(l1.findMin());

        
    }
    
}
