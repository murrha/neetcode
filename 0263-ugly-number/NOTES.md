* the problem states that it's non negative so it can't be < 0
* create a helper function that will take in two arguments and divide until the remainder with the divisor is 0
* we create an array of factors that contain 2, 3, 5 and call the helper function
* we return the expression of n == 1 which will return a boolean value
* TC: O(log(n)) because when dividing the int x by y, there can be at most O(logy(x)) divisions
* SC: O(1)