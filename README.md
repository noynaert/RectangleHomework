# Rectangles
Write a class called rectangles.  The file has two private data members:

* length: double
* width: double

The length and the width are always positive doubles.  If a negative value is given in a constructor it is set to 1.

Rectangles always have the longer of the two dimensions as the length.  The width is always less than or equal to the length. 

## Constructors:

* Rectangle(length, width)
* Rectangle(side) -- Both the length and the width are set to the value of side
* Rectangle() -- Both the length and width are set to 1.0

If the user specifies Rectangle(side) it should call this(side, side)

If the user specifies Rectangle() it should call this(1.0, 1.0)

## Setters

The setters are busy.  

* If the length is less than 0, the length should be set to 1
* After setting the length or the width, the values should be swapped if necessary so that the length is always larger (or as large as) the width

## Getters

They should be standard getters.

## toString
The toString should be return the following value:

    String.format("%1.4f x %1.4f", length, width);
    
## Other methods

### getArea() 
  returns the area of the rectangle.  This is a pseudo-getter because the result is calculated on the fly.

### getPerimeter() 
  returns length + width + length + width.  It is another pseudo getter.
  
### isSquare()
   returns true if the length == the width.  Otherwise returns false. 