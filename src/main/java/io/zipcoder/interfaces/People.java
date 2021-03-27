package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class People {
    List<Person> personList = new ArrayList<Person>();

//    public People(List<Person> personList) {
//        this.personList = personList;
//    }

    public void addPerson(Person person){
        personList.add(person);
    }


    public Person findById(long id){
        for (Person p : personList){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public boolean contains (Person person){
        if(personList.contains(person)){
            return true;
        }
        return false;
    }

    public void remove (Person person){
        personList.remove(person);
    }

    public void remove(long id){
        for (Person p : personList){
            if(p.getId() == id){
                personList.remove(p);
            }
        }
    }

    public void removeAll(){
        personList.removeAll(personList);
    }

    public int count(){
       return personList.size();
    }

    public Object[] toArray(){
        Object[] newArray = personList.toArray();
        return newArray;
    }

}
