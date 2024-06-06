/*
 * ErasureAndTranslation.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic_and_collection.generic.extra;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ErasureAndTranslation
{
    public String loophole(Integer x) {
        java.util.List<String> ys = new LinkedList<String>();
        List xs = ys;
        xs.add(x); // Compile-time unchecked warning
        return(String) ys.iterator().next(); // run time error
    }
}



/*
 * Changes:
 * $Log: $
 */