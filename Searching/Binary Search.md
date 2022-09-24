Q) Write an algorithm for binary Search

Binaray search is used in the sorted array. Time complexity for this is O(log n).

Algorithm

1. Take three variables starting point, end point and mid point. 
2. mid point = l + (r - l)/2.
3. Check if the value of the mid point element is equal to the search key.
4. If yes, then print the index of the search key.
5. Else, check whether the mid point element is smaller than search key.
6. If it is smaller, then take end point = mid point -1.
7. Otherwise, take starting point = mid point +1.
8. And calculate the mid point again.
9. 
