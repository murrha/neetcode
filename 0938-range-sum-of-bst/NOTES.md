​
* * given a range **[low, high] inclusive**
* find the sum of the values that are in the tree that are equal to or inbetween the values given in the range
​
* traverse the tree -> get the values
* evaluate the values of the root and its branches
* if the root value is already within the range we add it to the sum
* traverse through the right and left branches if they are not null -> recursively call the function to evaluate the value to see if it's within range and add it to our sum
* return sum
​