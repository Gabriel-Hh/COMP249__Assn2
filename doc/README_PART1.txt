README|Part1

Does my program work correctly?

In short yes. For part one we need to make an array containing objects of all classes we've created. 
To do this, we must unify our classes with a common ancestor. This is achieved with the abstract FlyingObject Class. 
In addition, i've given FlyingObject the attribute price : double, and a public getPrice() method. 
The class permits our findLeastAndMostExpensiveUAV() to take in an array of static types FlyingObject, and for only instances of UAV, compare their price.

I've added the abstract equals(obj) and toString() methods to enforce printability and equality comparision in all FLyingObjects sub-classes.