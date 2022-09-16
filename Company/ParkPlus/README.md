1. [Stack and Queue](https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/staque-1-e790a29f/)

* Initialize left as $$arr(0)$$
* Initialize right as $$\sum_{i = n - k + 1}^{n} arr(i)$$
* Initialize a left_add pointer to 1 and right_remove pointer to n - k + 1
* The number of steps to complete all scenarios is k - 1. Initialize count to k - 1
* Run a loop till count != 0
* Initialize ans = left + right
* In each iteration

Step 1: Add arr(left_add) to left and increment left_add

Step 2: Remove arr(right_remove) to right and increment right_remove

Step 3: If ans is less than left + right, update ans as left + right

Step 3: Decrement count

* Print the answer after the loop ends
