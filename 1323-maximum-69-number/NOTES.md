* we don't have to check every digit to see what will make it the higher number -> if we find a 6, we just have to change it to a 9
* with that same idea, if all the digits are 9 then we can simply return them
* we cant traverse an integer in Java -> **use the StringBuilder to make it iterable and mutable**
* to set it to the StringBuilder, use append
* we can convert that StringBuilder to an Integer by parsing it
* time complexity and space complexity: O(L) with L representing the length of the string
* OR use this oneliner from @tzhenia
public int maximum69Number (int num) {
return Integer.parseInt(("" + num).replaceFirst("6", "9"));
}