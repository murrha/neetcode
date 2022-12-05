* create two nodes: one for the dummy node that will be the new head and another one that will represent the current/tracker
* the dummy node will point to the next head node and the current node will point to the current
* while the next of current isn't null
* if the value of the current value is equal to the val -> the next of current will jump two places
* else just go to the next value
* return the dummy next