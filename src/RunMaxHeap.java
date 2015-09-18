/**
 * Created by petriccione on 9/11/15.
 */
public class RunMaxHeap {


    public static void main(String[] args) {
        int[] myArr1 = {1, 22, 8, 4, 15, 9, 7, 99};
        MaxHeap myHeap = new MaxHeap(myArr1);
        System.out.println("This is the original array:      "+java.util.Arrays.toString(myArr1));
        System.out.println("The heap ended up like this:     " + myHeap.printMaxHeap());
        myHeap.heapsort();
        System.out.println("This is the heap after heapsort: " + myHeap.printMaxHeap());

        int[] myArr2 = {8,6,7};
        MaxHeap myHeap2 = new MaxHeap(myArr2);
        System.out.println("This is the original array:      "+java.util.Arrays.toString(myArr2));
        System.out.println("The heap ended up like this:     " + myHeap2.printMaxHeap());
        myHeap2.heapsort();
        System.out.println("This is the heap after heapsort: " + myHeap2.printMaxHeap());








    }
}