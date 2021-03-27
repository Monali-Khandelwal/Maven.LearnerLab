package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class StudentsTest{

    @Test
    public void testGetInstance() {
       //Given
        Students student = Students.getInstance();

        //When
        Integer expected = 6;
        Integer actual = student.count();

        //Then
        Assert.assertEquals(expected,actual);

    }
}