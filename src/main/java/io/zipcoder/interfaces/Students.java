package io.zipcoder.interfaces;

import java.util.List;

public class Students extends People <Student>{

    private static final Students INSTANCE = new Students();

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

    public Student [] getArray(){
        List<Student> studentsList = this.personList;
        Student [] studentsArray = new Student[studentsList.size()];
        for(int i = 0; i< studentsList.size(); i++){
            studentsArray[i] = studentsList.get(i);
         }
        return studentsArray;
    }

    public Object[] toArray() {
        return this.personList.toArray();
    }
}
