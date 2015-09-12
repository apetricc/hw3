/**
 * Created by petriccione on 9/11/15.
 */
public class MaxHeap {


    //protected data field (member variable) of type int array
    private int[] heapValues= {};

    /**
     * A protected data field of type int called heapsize. Array indices 0 to heapsize - 1
     * are defined to be "in the heap," and any values after that are not. You may write your code
     * with one-indexing or zero-indexing. Bear in mind the pseudocode uses one indexing!
     */
    private int heapsize;
    /**
     * A public constructor method with an int array parameter.  This constructor will take an int array filled with
     * arbitrary values as a parameter, make a copy of it into its data field array made the same length, set heapsize
     * to the array length, and then invoke buildMaxHeap (see below). You may want to use the java.util.Array.copyOfRange
     * method in the constructor, or you can do it yourself.
     */
    public MaxHeap(int[] array) {
        return MaxHeap;
    }

    /**A protected method named parentOf, with an index parameter. Return the index where the parent is stored.
     Remember, the root and indexes beyond the end of the heap have no parent, so in that case return -1. You will first
     need to convert to a one-indexing by adding 1, then compute the parent's index, then finally subtract 1 to go back
     to zero-indexing.
     */
     private int parentOf(int index) {
         return -1;
     }

/**
 * A protected method named leftChildOf, which takes an index parameter. Return the index where the left child is stored.
 * Indices beyond the end of the heap have no children, so return -1. If the left child is beyond the end of the heap,
 * return -1. Don't forget the zero indexing!
 */
    private int leftChildOf(int index) {
        return -1;
    }

    /**
     * A protected method named rightChildOf, which takes an index parameter. Return the index where the right child is
     * stored.  Indices beyond the end of the heap have no children, so return -1.  If the right child is beyond the end
     * of the heap, return -1. Don't forget the zero indexing!
     */
    private int rightChildOf(int index) {
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
        return "";
    }

    /**
     * A protected recursive method named maxHeapify based on the MAX-HEAPIFY method, whose pseudocode is in the
     * textbook and the slides. The only parameter will be the index -- the array itself is a class member variable
     * and thus need not be a parameter. Remember the heap ends at index heapsize-1 inclusive.
     */
    private void maxHeapify(int index) {

    }

    /**
     * A protected method buildMaxHeap based on the BUILD-MAX-HEAP method, whose pseudocode is in the textbook and
     * the slides. This is a loop that invokes maxHeapify. It has no parameters since the array is a class member
     * variable. Remember the heap ends at index heapsize-1 inclusive.
     */
    private void buildMaxHeap() {

    }
    /**
     * A public method named heapsort, based on the HEAPSORT method, whose pseudocode is in the textbook and the slides.
     * This method has no parameters, since the array is a class member variable.  It will make use of buildMaxHeap and
     * maxHeapify. Remember the heap ends at index heapsize-1 inclusive. This method modifies heapsize continuously,
     * so remember to restore a backup copy of heapsize after the sorting is done.
     */
    public void heapsort() {

    }



    //buildMaxHeap
    //maxHeapify

    //public method
}
