# SortAlgorithms
Set of generally used sorting algorithms
1. Merge Sort:
Merge sort is a recursive algorithm. It is implemented by recursively splitting and sorting the array into two halves. These halves will be merged by comparing the elements. The implementation for merge part of the algorithm is O(n) complexity with an additional O(n) space. There are atmost log(n) recursive steps as we will be splitting the array into half in each step. So overall the algorithm is O(n*log(n))* time complexity and O(n) extra space is required.

The algorithm is tested on the file "dataset.txt". It has 10 million integers in the range 0 and 1 billion.

2. Quick Sort:
Quick sort is also a recursive algorithm. In this, we will first shuffle the array for better average performace. In each step, we find the correct index for an element in the sorted array. Then the array to the left and array to the right of this element will be sorted recursively. This algorithm has average run time complexity of O(n*log(n)*) but no extra space required.
