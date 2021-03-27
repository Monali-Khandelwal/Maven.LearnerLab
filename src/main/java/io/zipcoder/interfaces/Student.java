package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

    double totalStudyTime = 5.00;
    
    public Student(long id, String name) {
        super(id, name);
    }

    public Student(long id) {
        super(id);
    }
    //Student totalStudyTime = new Student;

    public double learn(double numberOfHours) {
        double totalTime = totalStudyTime + numberOfHours;
        return totalTime;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }


}
