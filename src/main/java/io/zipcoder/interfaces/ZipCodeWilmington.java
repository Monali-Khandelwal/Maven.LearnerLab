package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private final Students students = new Students();
    private final Instructors instructors = new Instructors();

    public void hostLecture (Teacher teacher, double numberOfHours){
        //Learner[] newArr = Arrays.(students.toArray(), students.count(), Learner[].class);
        teacher.lecture((Learner[]) students.toArray(), numberOfHours);

    }

    public void hostLecture (long id, double numberOfHours){
        ((Instructor)instructors.findById(id)).lecture((Learner[]) students.toArray(), numberOfHours);
    }

    public getStudyMap(){
        Map<Student, Double> map = new HashMap<Student, Double>();
        for (Student student : students.toArray()){
            Student s = student;
            map.put(s, s.getTotalStudyTime());
        }
        return map;

        }
    }

