package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest{

    @Test
    public void testGetInstance() {
        //Given
        Instructors instructor = Instructors.getInstance();

        //When
        Integer expected = 3;
        Integer actual = instructor.count();

        //Then
        Assert.assertEquals(expected,actual);
    }
}