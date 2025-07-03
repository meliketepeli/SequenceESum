# 🔢 Subsequence Sum Finder in Java

This Java program allows users to input an array of integers and a target sum. It then searches for the starting index of a contiguous sub-array whose elements add up exactly to the given target sum (`k`).


## 📌 Problem Description

The program performs the following steps:

1. Takes input from the user for the number of elements in the array.
2. Reads the integer elements of the array.
3. Asks the user for a target sum `k`.
4. Searches for a sub-array (contiguous sequence) whose sum is equal to `k`.
5. Returns the **starting index** of that sub-array if found; otherwise, it prints `"No subsequence!"`.


## 💻 Sample Output

Step1: How many elements would you like to give as an array? Please enter:
6

Step2: Enter the elements of the array:
{1,4,2,6,3,9}

Step3: What is the sum of the elements of the array?
k=18
----------------------------------------------------
Result is: 3

(Explanation: 6 + 3 + 9 = 18 → This sub-array starts at index **3**.)


## ⚙️ Time Complexity

- The algorithm uses nested iteration: an outer `for` loop and an inner `while` loop.
- Therefore, the **time complexity is O(n²) in the worst case.


