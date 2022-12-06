* traverse to reach the leaves of both trees and see whether or not it has the same sequence
* the parents don't have to be the same as long as the values and the order are the exact same
​
​
* create two lists that will hold the values of each tree -> List of arrays
* create a helper function that will be depth first search
* leaf -> had no children so the left and right pointers will be null
* depth first search -> add in the value of that leaf to our list
* if it's not a leaf we continue traversing deeper into the tree
​
* **depth first search** -> leaves are at the end and we need to see what their values are in order to check
* parameters: linked list, root
* if the left and right nodes are null
* we add the value of the node into the list
* recursively call the left and right values of that list
​
* return if the array lists are equal to each other