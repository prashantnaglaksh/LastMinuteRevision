package com.Java17Features.SealedClass;


/**
 * @author SGSLP041
 *{@summary
 *Sealed classes restrict which other classes may extend them. For a Class to be sealed you need to define which all classes are allowed
 *to extend that class. Permitted subclasses are defined using Permit clause and only this classes can extend the sealed class.
 *
 *The subclasses of a sealed class can be either final, sealed, or non-sealed:
 *Final: Cannot be subclassed further.
 *Sealed: Can be subclassed but must also specify its permitted subclasses.
 *Non-sealed: Can be subclassed by any class (essentially opting out of the sealing contract).}
 */
public sealed class Shape permits Circle, Rectangle, Square {
	public void draw() {}
}


final class Circle extends Shape {
   
}

sealed class Rectangle extends Shape permits TransparentRectangle, FilledRectangle {
    public void draw() {}
}

non-sealed class Square extends Shape {
    public void draw() {}
}

final class TransparentRectangle extends Rectangle {
}

final class FilledRectangle extends Rectangle {
}
