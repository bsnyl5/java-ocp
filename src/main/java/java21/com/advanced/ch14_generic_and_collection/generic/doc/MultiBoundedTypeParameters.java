/*
 * MultiBoundedTypeParameters.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic_and_collection.generic.doc;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class MultiBoundedTypeParameters
{
    class A { /* ... */ }
    interface B { /* ... */ }
    interface C { /* ... */ }

    class D <T extends A & B & C> { /* ... */ }
    
    //class E <T extends B & A & C> { /* ... */ }  // compile-time error because A is not the first one
}



/*
 * Changes:
 * $Log: $
 */