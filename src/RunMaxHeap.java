/**
 * Created by petriccione on 9/11/15.
 */
public class RunMaxHeap {


    public static void main(String[] args) {
        int[] myArr = {1, 22, 8, 4, 15, 6, 7, 99};
        MaxHeap myMaxHeap = new MaxHeap(myArr);
        myMaxHeap.heapsort();
        System.out.println(myMaxHeap.printMaxHeap());

        for (int i = 0; i < myArr.length - 1; i++) {
            System.out.println("The parent of " + i + " is:" + myMaxHeap.parentOf(i));
            System.out.println("The left child of index " +i +" is: " + myMaxHeap.leftChildOf(i));
            System.out.println("The right child of index " +i  +" is: " + myMaxHeap.rightChildOf(i));
        }

    }
}