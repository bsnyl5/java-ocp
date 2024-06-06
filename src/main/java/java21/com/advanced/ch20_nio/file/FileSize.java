/*
 * FileSize.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.advanced.ch20_nio.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class FileSize
{
    public static void main(String[] args) throws IOException
    {
        System.out.print(Files.size(Paths.get("/zoo/animals.txt")));
    }
}



/*
 * Changes:
 * $Log: $
 */