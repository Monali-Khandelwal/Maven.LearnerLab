package io.zipcoder.interfaces;

public class Instructors extends People <Instructor>{

        private static final Instructors INSTANCE = new Instructors();

        Instructors(){
            addPerson(new Instructor(101, "Kristofer"));
            addPerson(new Instructor(102, "Dolio"));
            addPerson(new Instructor(103, "Nobles"));

        }
        public static Instructors getInstance(){

            return INSTANCE;
        }

//    public Instructor toArray() {
//        return null;
//    }
}
