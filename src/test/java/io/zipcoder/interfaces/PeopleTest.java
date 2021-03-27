package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PeopleTest{

    @Test
    public void testAdd() {
        //Given
        People test = new People();
        //List <Person> test = new ArrayList<Person>();
        Person p1 = new Person(101, "Monali");
        Person p2 = new Person(102, "Gaurav");
        //When
        test.addPerson(p1);
        test.addPerson(p2);
        int expected = 2;
        int actual = test.count();

        //Then
        Assert.assertTrue(test.count() == 2);
    }

    @Test
    public void testFindById() {
      //Given
    People test = new People();
    Person p1 = new Person(101, "Monali");
    Person p2 = new Person(102, "Gaurav");

    //When
    test.addPerson(p1);
    test.addPerson(p2);
    Person expected = p1;
    Person actual = test.findById(101);

    //Then
    Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemove() {
        //Given
        People test = new People();
        Person p1 = new Person(101, "Monali");
        Person p2 = new Person(102, "Gaurav");

        //When
        test.addPerson(p1);
        test.addPerson(p2);
        test.remove(p1);

        //Then
        Assert.assertTrue(test.count() ==1);

    }
}