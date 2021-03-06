# hw3
csci333 hw3 description-->

Homework 3: Heap

In Java using NetBeans, implement a class named MaxHeap using an array as a class member variable / data field.  Do not use any libraries of any kind, except the java.util.Arrays.toString and java.util.Arrays.copyOfRange methods. The Java Standard Library has multiple good implementations of a Heap, but the idea of this course is to learn how these things are made, by making them ourselves!

48 points: Define a MaxHeap class. It should have:

A protected data field (member variable) of type int array. This array will be used to store the heap at all times.
A protected data field of type int called heapsize. Array indices 0 to heapsize - 1 are defined to be "in the heap," and any values after that are not. You may write your code with one-indexing or zero-indexing. Bear in mind the pseudocode uses one indexing!
A public constructor method with an int array parameter.  This constructor will take an int array filled with arbitrary values as a parameter, make a copy of it into its data field array made the same length, set heapsize to the array length, and then invoke buildMaxHeap (see below). You may want to use the java.util.Array.copyOfRange method in the constructor, or you can do it yourself.
A protected method named parentOf, with an index parameter. Return the index where the parent is stored.  Remember, the root and indexes beyond the end of the heap have no parent, so in that case return -1. You will first need to convert to a one-indexing by adding 1, then compute the parent's index, then finally subtract 1 to go back to zero-indexing.
A protected method named leftChildOf, which takes an index parameter. Return the index where the left child is stored. Indices beyond the end of the heap have no children, so return -1. If the left child is beyond the end of the heap, return -1. Don't forget the zero indexing!
A protected method named rightChildOf, which takes an index parameter. Return the index where the right child is stored.  Indices beyond the end of the heap have no children, so return -1.  If the right child is beyond the end of the heap, return -1. Don't forget the zero indexing!
A public method named printMaxHeap to write out the contents of its array data field to standard output in a nicely formatted print statement. Print out the heapsize, and then only print the values of indices 0 through heapsize-1 inclusive. You can do this yourself, or use the java.util.Arrays.toString method. You must only print indices from 0 to heapSize-1 inclusive, so you may want to use java.util.Arrays.copyOfRange before invoking java.util.Arrays.toString.
A protected recursive method named maxHeapify based on the MAX-HEAPIFY method, whose pseudocode is in the textbook and the slides. The only parameter will be the index -- the array itself is a class member variable and thus need not be a parameter. Remember the heap ends at index heapsize-1 inclusive.
A protected method buildMaxHeap based on the BUILD-MAX-HEAP method, whose pseudocode is in the textbook and the slides. This is a loop that invokes maxHeapify. It has no parameters since the array is a class member variable. Remember the heap ends at index heapsize-1 inclusive.
A public method named heapsort, based on the HEAPSORT method, whose pseudocode is in the textbook and the slides. This method has no parameters, since the array is a class member variable.  It will make use of buildMaxHeap and maxHeapify. Remember the heap ends at index heapsize-1 inclusive. This method modifies heapsize continuously, so remember to restore a backup copy of heapsize after the sorting is done.
12 points: Create a second class in the same package which contains the main method.  Its purpose will be to create some MaxHeap objects and test them.  (Bear in mind that the only public methods are the constructor, printMaxHeap, and heapsort.) Use at least 5 different arrays filled with values to make at least 5 different MaxHeap objects. For each object:

Print out the original array that it was constructed from -- the one with values in arbitrary order. Use the java.util.Arrays.toString method.
Print out the heap with printMaxHeap. By looking at the console it should be obvious the values are rearranged, from the buildMaxHeap that was invoked in the constructor.
Invoke heapsort.
Print out the heap again with printMaxHeap. In the console you should notice all the values are sorted.
Remember to comment your code! You should have a header comment with your name, date, class, assignment, and a brief description of what your code does.

Upload a Java NetBeans project folder as a .zip archive before the due time. Late work will not be accepted.


