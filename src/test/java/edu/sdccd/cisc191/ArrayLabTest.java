package edu.sdccd.cisc191;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayLabTest {

    private double[][] testArray = new double[][]{ {1.5, 2.0, 3.0, 4.0}, {5.5, 6.0, 7.0, 8.0}, {9.5, 1.0, 3.0, 1.0} };

    @Test
    public void tstColumnSum(){
        assertEquals(16.5, ArrayLab.columnSum(testArray, 0));
        assertEquals(9.0,ArrayLab.columnSum(testArray, 1));
        assertEquals(13.0,ArrayLab.columnSum(testArray, 2));
        assertEquals(13.0, ArrayLab.columnSum(testArray, 3));
    }
}
