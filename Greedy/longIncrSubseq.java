



/*
use list sub to store smallest possible increasing subseq
    the list does not store the LIS, but helps determine its length
Iterate through the input array and process each element greedily
    if the current number is greater than the last element in sub, apppend it to sub (greedy choice)
    o/w, find the first element in sub that is >= current num and replace (using binary search)
    this keeps sub as small as possible ensuring efficient updates
the length of sub at end is length of lis
https://docs.google.com/document/d/1DI6uTzq4A-yUx9qzQaG-E4hG2s9puuTqlZnoN-zVANE/edit?tab=t.0

Longest Increasing Subsequence - Room 6
Given an array of integers, find the length of the longest increasing subsequence (LIS).
A subsequence is a sequence derived by deleting some elements (without reordering).
Example:
vector<int> nums = {10, 9, 2, 5, 3, 7, 101, 18};


Output: 
4 (The corresponding LIS is {2, 3, 7, 101}).

 */