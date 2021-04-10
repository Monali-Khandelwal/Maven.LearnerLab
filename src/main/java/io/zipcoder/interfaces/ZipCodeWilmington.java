package io.zipcoder.interfaces;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Teacher;
import io.zipcoder.interfaces.Students;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private final Students students = Students.getInstance();
    private final Instructors instructors = Instructors.getInstance();
    private ZipCodeWilmington(){

    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

    public void hostLecture (Teacher teacher, double numberOfHours){
        //Learner[] newArr = Arrays.(students.toArray(), students.count(), Learner[].class);
        teacher.lecture(students.toArray(), numberOfHours);

    }

    public void hostLecture (long id, double numberOfHours){
        E instructor = instructors.findById(id);
        instructor.lecture(students.toArray(), numberOfHours);
    }

//    public Map getStudyMap(){
//        Map<Student, Double> map = new HashMap<Student, Double>();
//
//        for (Iterator it = students.iterator();
//              it.hasNext(); ){
//            Student s = (Student) it.next();
//            map.put(s, s.getTotalStudyTime());
//        }
//        return map;
//        }
    }

