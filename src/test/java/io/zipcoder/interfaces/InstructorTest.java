package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {
    @Test
    public void testImplementation(){
        //Given
        Instructor instructorOne = new Instructor(101, "Kristofer");

        //When

        //Then
        Assert.assertTrue(instructorOne instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        //Given
        Instructor instructorOne = new Instructor(102,"Dolio");

        //When

        //Then
        Assert.assertTrue(instructorOne instanceof Person);

    }

        @Test
        public void testTeach () {
            //Given
            Instructor instructorOne = new Instructor(102,"Dolio");
            Learner learner1 =  new Student(101, "Monali");
            double numberOfHours = 40;
            double totalStudyTime = 5;

            //When
            double expected = 45;
            double actual = instructorOne.teach(learner1, numberOfHours);


            //Then
            Assert.assertEquals(expected,actual,0.001);
        }

        @Test
        public void testLecture () {
            //Given
            Instructor instructorOne = new Instructor(103, "Nobles");
            Learner learner1 =  new Student(101, "Monali");
            Learner learner2 =  new Student(102, "Sam");
            Learner learner3  =  new Student(103, "Whitney");
            Learner learner4  =  new Student(104, "Lena");

            Learner[] learners = new Learner []{learner1,learner2,learner3,learner4};
            double numberOfHours = 40;
            double totalStudyTime = 5;

            //When
            learners[0] = learner1;
            learners[1] = learner2;
            learners[2] = learner3;
            learners[3] = learner4;
            double expected = 15; // numberOfHours = 40/4 = 10 and totalStudyTime = 5
            double actual = instructorOne.lecture(learners,numberOfHours);

            //Then
            Assert.assertEquals(expected,actual,0.001);
    }

}

