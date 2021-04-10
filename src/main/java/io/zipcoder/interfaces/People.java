package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable <E>{
    List<E> personList = new ArrayList();

//    public People(List<Person> personList) {
//        this.personList = personList;
//    }

    public void addPerson(E person){
        personList.add(person);
    }


    public E findById(long id){
        for (E person : personList){
            if(person.getId() == id){
                return person;
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
        for (E person : personList){
            if(person.getId() == id){
                personList.remove(person);
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
        return personList.toArray();
    };

    public Iterator<E> iterator(){
        return personList.iterator();
        }

}
