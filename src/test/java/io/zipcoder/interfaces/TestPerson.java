package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        //Given
        long expectedId = 107;
        String expectedName = "Monali";
        Person monali = new Person (expectedId, expectedName);

        //When
        long actualId = monali.getId();
        String actualName = monali.getName();

        //Then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName(){
        //Given
        long monaliId = 107;
        String monaliName = "Monali";
        Person person = new Person (monaliId, monaliName);

        //When
        String expectedName = "Nyra";
        person.setName("Nyra");
        String actualName = person.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);
    }



}
