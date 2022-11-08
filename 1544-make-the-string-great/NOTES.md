* similar to the parenthesis problem, we can use a stack if we detect two characters of different cases -> pop them out if they make a pair
* **REMEMBER**: the difference between an uppercase ascii and lowercase ascii is 32
* if the character doesn't have a pair, add it to the stack
* else pop if off
* T(C): O(n) - since we are using only one iteration
* S(C): we are only popping the characters we find a pair to