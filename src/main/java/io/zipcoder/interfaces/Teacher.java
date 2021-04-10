package io.zipcoder.interfaces;

public interface Teacher {

    //public double teach(Learner learner, double numberOfHours );
    public void teach(Learner learner, double numberOfHours );
    //public double lecture (Learner[] learners, double numberOfHours);
    public void lecture (Learner[] learners, double numberOfHours);

}
