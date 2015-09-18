/**
 * Homework 3: Heaps
 * csci 333 fall 2015 Professor Whitley
 * Created by petriccione on 9/11/15.
 */

/**
 * The RunMaxHeap class creates some MaxHeap objects and demonstrates
 * the public methods in the MaxHeap class.
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
        System.out.println("\nThis is the original array:      "+java.util.Arrays.toString(myArr2));
        System.out.println("The heap ended up like this:     " + myHeap2.printMaxHeap());
        myHeap2.heapsort();
        System.out.println("This is the heap after heapsort: " + myHeap2.printMaxHeap());

        int[] myArr3 = {8,6,7,5,3,0,9,10};
        MaxHeap myHeap3 = new MaxHeap(myArr3);
        System.out.println("\nThis is the original array:      "+java.util.Arrays.toString(myArr3));
        System.out.println("The heap ended up like this:     " + myHeap3.printMaxHeap());
        myHeap3.heapsort();
        System.out.println("This is the heap after heapsort: " + myHeap3.printMaxHeap());

        int[] myArr4 = {19,67,1,-12,4,9,125,14,7};
        MaxHeap myHeap4 = new MaxHeap(myArr4);
        System.out.println("\nThis is the original array:      " + java.util.Arrays.toString(myArr4));
        System.out.println("The heap ended up like this:     " + myHeap4.printMaxHeap());
        myHeap4.heapsort();
        System.out.println("This is the heap after heapsort: " + myHeap4.printMaxHeap());

        int[] myArr5 = {1,2,3,4,5,6,7,8};
        MaxHeap myHeap5 = new MaxHeap(myArr5);
        System.out.println("\nThis is the original array:      " + java.util.Arrays.toString(myArr5));
        System.out.println("The heap ended up like this:     " + myHeap5.printMaxHeap());
        myHeap5.heapsort();
        System.out.println("This is the heap after heapsort: " + myHeap5.printMaxHeap());





    }
}