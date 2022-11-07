* uses the concept of vertical scanning, meaning that we will observe each string and compare with the letters of the first string
* if we find out that any of the strings are really short (1, 2, length) or if the character doens't match with the first string we are observing -> we return that character's substring from 0 to i
* if the first element is already the substring, we return it