package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testImplementation(){
        //Given
        Student studentOne = new Student(105, "Monali");

        //When

        //Then
        Assert.assertTrue(studentOne instanceof Learner);
    }

    @Test
    public void testInheritance(){
        //Given
        Student studentOne = new Student(105, "Monali");

        //When

        //Then
        Assert.assertTrue(studentOne instanceof Person);
    }

    @Test
    public void testLearn() {
        //Given
        Student studentOne = new Student(105, "Monali");
        Double numberOfHours = 10.00;
        //double totalStudyTime = 5.00;
        //When
        double expectedTotalTime = 15.00;
        double actualTotal = studentOne.learn(numberOfHours);

        //Then
        Assert.assertEquals(expectedTotalTime, actualTotal, 0.01);

    }

}