* return the **node** that equals the value
* if it doesn't exist -> return null
​
* could be either the root, parent, or leaf
* take into account the parents with only 1 child which may have the value we are looking for
* **binary search tree**
​
* if the root is null then we return null -> sanity checking just to make sure we have a root
* check if the root is equal to the value then we return the root
* else if the value we are looking for is less than the root we will go left else go right -> return since we have to return a null
​
​
​