
//package maxheap;
/**
 * Created by petriccione on 9/11/15.
 * csci 333 fall 2015 Professor Whitley
 */
public class MaxHeap {


    //protected data field (member variable) of type int array
    protected int[] array = {};

    /**
     * A protected data field of type int called heapsize. Array indices 0 to heapsize - 1
     * are defined to be "in the heap," and any values after that are not. You may write your code
     * with one-indexing or zero-indexing. Bear in mind the pseudocode uses one indexing!Ï
     */
    protected int heapsize;


    /**
     * A public constructor method with an int array parameter.  This constructor will take an int array filled with
     * arbitrary values as a parameter, make a copy of it into its data field array made the same length, set heapsize
     * to the array length, and then invoke buildMaxHeap (see below). You may want to use the java.util.Array.copyOfRange
     * method in the constructor, or you can do it yourself.
     */
    public MaxHeap(int[] array) {
        // this.heapValues = Arrays.copyOf(array, array.length);
        this.array = new int[array.length];
        this.heapsize = array.length;
        for (int i = 0; i < array.length; i++) {
            this.array[i] = array[i];
        }

        buildMaxHeap();
    }

    /**A protected method named parentOf, with an index parameter. Return the index where the parent is stored.
     Remember, the root and indexes beyond the end of the heap have no parent, so in that case return -1. You will first
     need to convert to a one-indexing by adding 1, then compute the parent's index, then finally subtract 1 to go back
     to zero-indexing.
     */
    protected int parentOf(int n) {
        if (n == 0) return -1;
        if ((n-1)/2 > -1) return (n-1)/2;   //this is for 0 indexing, 1 index would just be n/2
        //if (n/2 > 0) return n/2;
        return -1;
    }

    /**
     * A protected method named leftChildOf, which takes an index parameter. Return the index where the left child is stored.
     * Indices beyond the end of the heap have no children, so return -1. If the left child is beyond the end of the heap,
     * return -1. Don't forget the zero indexing!
     */
    protected int leftChildOf(int n) {
        if ((2*n + 1) < array.length) return (2*n) + 1;
        return -1;
    }

    /**
     * A protected method named rightChildOf, which takes an index parameter. Return the index where the right child is
     * stored.  Indices beyond the end of the heap have no children, so return -1.  If the right child is beyond the end
     * of the heap, return -1. Don't forget the zero indexing!
     */
    protected int rightChildOf(int n) {
        if (((2 * n + 1) + 1) < array.length) return (2*n+1) + 1;
        return -1;
    }
    /**
     * A public method named printMaxHeap to write out the contents of its array data field to standard output in a
     * nicely formatted print statement. Print out the heapsize, and then only print the values of indices 0 through
     * heapsize-1 inclusive. You can do this yourself, or use the java.util.Arrays.toString method. You must only print
     * indices from 0 to heapSize-1 inclusive, so you may want to use java.util.Arrays.copyOfRange before invoking
     * java.util.Arrays.toString.
     */
    public String printMaxHeap(){
        System.out.println("The length of the array is: " +array.length);
        String result = "";
        for (int i = 0; i < array.length; i++) {
            //System.out.print("[" + array[i] + "]");
            result += "[" + array[i] + "]";
        }
        return result;
    }

    /**
     * A protected recursive method named maxHeapify based on the MAX-HEAPIFY method, whose pseudocode is in the
     * textbook and the slides. The only parameter will be the index -- the array itself is a class member variable
     * and thus need not be a parameter. Remember the heap ends at index heapsize-1 inclusive.
     left = 2*i // index of the left child
     right = 2*i+1 // index of the right child
     if left <= A.heapSize and A[left] > A[i]
     largest = left
     else largest = i
     if right <= A.heapSize and A[right] > A[largest]
     largest = right
     if largest != i
     swap A[i] with A[largest]
     MAX-HEAPIFY(A, largest)

     */
    protected void maxHeapify(int i) {
        int largest = i;
        int left = leftChildOf(i);
        int right = rightChildOf(i);
        if (left > -1) {
            if (left < heapsize && array[left] > array[i]) largest = left;
            else largest = i;
        }
        if (right > -1) {
            if (right < heapsize && array[right] > array[largest]) largest = right;
        }
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
            maxHeapify(largest);
        }

    }

    /**
     * A protected method buildMaxHeap based on the BUILD-MAX-HEAP method, whose pseudocode is in the textbook and
     * the slides. This is a loop that invokes maxHeapify. It has no parameters since the array is a class member
     * variable. Remember the heap ends at index heapsize-1 inclusive.
     */
    protected void buildMaxHeap() {
        /**
         * for i = A.heapsize/2 downto 1 // integer division truncates
         MAX-HEAPIFY(A, i)

         */
        for (int i = heapsize / 2;i > -1; i--) {
            maxHeapify(i);
        }
    }
    /**
     * A public method named heapsort, based on the HEAPSORT method, whose pseudocode is in the textbook and the slides.
     * This method has no parameters, since the array is a class member variable.  It will make use of buildMaxHeap and
     * maxHeapify. Remember the heap ends at index heapsize-1 inclusive. This method modifies heapsize continuously,
     * so remember to restore a backup copy of heapsize after the sorting is done.
     BUILD-MAX-HEAP(A)
     backupCopy = A.heapsize // save a copy of the heapsize for later
     for i = A.heapsize downto 2
     swap A[1] with A[i]
     decrease A.heapSize by 1 // the old last element is the new root
     MAX-HEAPIFY(A, 1) // restore broken max heap property at root
     A.heapsize = backupCopy // restore the original heapsize value

     */
    public void heapsort() {
        buildMaxHeap();
        int backUpCopy = heapsize;
        for (int i = heapsize - 1;i >= 0; i-- ) {
            int swap = array[0];
            array[0] = array[i];
            array[i] = swap;
            // not sure if this is done by decrementing i or if I need to explicitly decrement heapsize...?
            heapsize--;
  //          printMaxHeap();
            maxHeapify(0);
//            printMaxHeap();
        }

        heapsize = backUpCopy;
    }

}

