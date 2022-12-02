* each pair represents part of a condition -> [frequency, value]
* skip every two places in order to get the next parameters for that condition
* **first get the size of the result array**
* declare a new variable that will hold the size of the new array
* use the frequency values of the odd indices and add it to our size variable
​
**declare the result array using the size computed earlier**
**get the values that will be inputted into our new array**
* declare another variable that serves as a tracker so we know when to move on to the next value that is going to be repeated
* use the same condition used for the previous calculation
* take advantage of an Arrays method called filled that required 4 parameters and will fill the result array with the correct values and frequency
* (result array, tracking variable, tracking variable + nums[i] -> how many times it will appear, nums[i + 1])
* sum the tracking variable with nums[i]
​
return the result