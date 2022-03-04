README|Part2

Does my program work correctly?

Yes, the driver makes a copy of the FlyingObject array while following the assignment restrictions. 
Since we cannot instantiate an object of the abstract class FlyingObject then we cannot make a copy
of an object with static type FlyingObject without checking its dynamic type and calling the appropriate copy constructor.
Checking the dynamic type is prohibited in the assignment.
Therefore, to copy a complete array of varying FlyingObject types we need to make call a polymorphic method.
I created an abstract method in FlyingObject called copy().
This method is overriden in every sub-class.
It calls the implemented class's copy constructor on the calling object, (this)
and returns a copy with dynamic type of the implemented class.