package io.zipcoder.interfaces;

public class Students extends People <Student>{

    public static final Students INSTANCE = new Students();

    Students(){
        addPerson(new Student(101, "Monali"));
        addPerson(new Student(102, "Lena"));
        addPerson(new Student(103, "Justin"));
        addPerson(new Student(104, "Kelly"));
        addPerson(new Student(105, "Ashley"));
        addPerson(new Student(106, "Mike"));
    }
    public static Students getInstance(){
        return INSTANCE;
    }
}
