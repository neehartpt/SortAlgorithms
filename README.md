# SortAlgorithms
Set of generally used sorting algorithms
1. Merge Sort:
Merge sort is a recursive algorithm. It is implemented by recursively splitting and sorting the array into two halves. The these halves will be merged by comparing the elements from each half. The implementation for merge part of the algorithm is O(n) complexity with an additional O(n) space. There are atmost log(n) recursive steps as we will be splitting the array into half in each step. So overall the algorithm is O(n*log(n))* time complexity and O(n) extra space is required.

The algorithm is tested on the file "dataset.txt". It has 10 million integers in the range 0 and 1 billion.
