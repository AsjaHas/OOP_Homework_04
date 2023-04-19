Create the interfaces Flight and Swim.

The Flight interface has 1 method:
String ﬂy();

The Swim interface has also 1 method:
String swim();

Create following 5 classes:
Fish implementing Swim — the swim method should return “Swims under water” Plane implementing Flight — the ﬂy method should return “Flies with engine”
Duck implementing Swim and Flight — the swim method should return “Kinda ﬂoats”
— the ﬂy method returns “Flies with wings” Pegasus implementing Flight — the ﬂy method should return “Flies with wings” Submarine implementing Swim — the swim method should return “Swims under water”

Create a Main class which will test your code. 
Create an object for each of these 5 classes.
  -	The class is supposed to have 2 Lists:
             - An ArrayList containing things that can fly 
             - A LinkedList of things that can swim 
Loop through both lists and print the output of ﬂy and swim methods of all the objects in these lists.

NOTE: Implementing multiple interfaces is done by separating the Interface names that we want to implement with a comma. A implements B, C …

  ———————————————————————————————————————————

Create the abstract class Shape.
    The Shape has 1 attribute: colour (String)
    Every shape can return it’s area and circumference, both returning double.

Create 3 classes:
    Circle, Square and Rectangle. All of these are colourful shapes.
Circle:
    Has 1 attribute:
    radius (double)
    Area = radius2 x PI
    Circumference = 2 x radius x PI
Square
    Has 1 attribute:
    side (double)
    Area = side x side
    Circumference = 4 x side
Rectangle
    Has 2 Attributes: a (double); b (double)
    Area = a x b
    Circumference = 2 x a + 2 x b

It should be possible to call toString() for either Square, Circle or Rectangle and the output should always be:
“colour: {colour}, area: {the area}, circumference: {the circumference}”

Create a Main class to test your code:
Create an object of each shape, and put them into a Shape List.
Iterate through the list, and print the output of toString() for each of them.

NOTES:  
1.	Abstract classes can have constructors just like normal classes.
2.	For calculating PI use Math.PI
3.	Regarding the toString() part: BE SMART, THINK