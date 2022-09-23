Ques) We are given two sorted arrays. We have to find the median of two sorted arrays. Time complexity for this problem is given O(log(m+n)).


Algorithm

This is a problem of binary search.  

We can try to apply the logic of binary search whenever we will see the sorted array.

1. We wil take a resultant array of length of sum to two arrays.
2. Then we will compare both the arrays and store the smaller element in the resultant array.
3. This process will be repeated till we reach the end of one of the array 
4. Then we will check for the elements left in the other array and store them in the resultant array.
5. After that, we will apply the logic of binary search and take the middle element and print it.

