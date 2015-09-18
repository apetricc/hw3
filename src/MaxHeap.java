
//package maxheap;
/**
 * Created by petriccione on 9/11/15.
 * csci 333 fall 2015 Professor Whitley homework 3: Heap
 * Make a class called MaxHeap that takes an array and
 * makes a heap that you can call heapsort on to sort an array.
 */

/**
 * class MaxHeap takes an array in the constructor
 * and can use heapsort to sort an array
 */
public class MaxHeap {
    /**
     * An int array that we use to fill the heap, and perform functions on.
     */
    protected int[] array = {};
    /**
     * An int that keeps track of the number of elements in the heap.
     */
    protected int heapsize;
    /**
     * Public constructor method to construct new MaxHeap objects and fill it with
     * the values in the array.
     * @param array The array that will fill the heap.
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
    /**
     * Find the parent node of the node at index n and return it.
     * @param n The index of the node to find the parent of.
     * @return The index of the parent node, or else -1.
     */
    protected int parentOf(int n) {
        if (n == 0) return -1;
        if ((n-1)/2 > -1) return (n-1)/2;   //this is for 0 indexing, 1 index would just be n/2
        //if (n/2 > 0) return n/2;
        return -1;
    }
    /**
     * Find the index of the left child of node at index n and return it.
     * @param n The index of the node to find the left child of.
     * @return The index of the node that IS the left of the node at index n.
     */
    protected int leftChildOf(int n) {
        if ((2*n + 1) < array.length) return (2*n) + 1;
        return -1;
    }
    /**
     * Find the index of the the right child of of node at index n and return it.
     * @param n The index of the node to find the right child of.
     * @return The index of the node that IS the right child of the node at index n.
     */
    protected int rightChildOf(int n) {
        if (((2 * n + 1) + 1) < array.length) return (2*n+1) + 1;
        return -1;
    }
    /**
     * Print out the heapsize and go through the heap and make it printable.
     * @return a String that displays the contents of the heap.
     */
    public String printMaxHeap(){
        System.out.println("\nThe heapsize is: " +heapsize);
        String result = "";
        for (int i = 0; i < array.length; i++) {
            //System.out.print("[" + array[i] + "]");
            result += "[" + array[i] + "]";
        }
        return result;
    }
    /**
     * Go through the heap and correct the heap property.
     * @param i The index upon which to apply the maxHeapify method.
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
     * Iterate through the array calling maxHeapify to maintain heap property.
     */
    protected void buildMaxHeap() {
        for (int i = heapsize / 2;i > -1; i--) {
            maxHeapify(i);
        }
    }
    /**
     * Use the heap and heap property to sort the contents of an array.
     */
    public void heapsort() {
        buildMaxHeap();
        int backUpCopy = heapsize;
        for (int i = heapsize - 1;i >= 0; i-- ) {
            int swap = array[0];
            array[0] = array[i];
            array[i] = swap;
            heapsize--;
            maxHeapify(0);
        }
        heapsize = backUpCopy;
    }
}

