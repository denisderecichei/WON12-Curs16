package org.fasttrack.tema15;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    private List<Person> persons;

    private static int idForPerson = 1;

    public PersonService(List<Person> persons) {
        this.persons = persons;
    }

    public PersonService() {
        persons = new ArrayList<>();
    }

    public Person addPerson(Person person) {
        person.setId(idForPerson);
        idForPerson += 1;
        persons.add(person);
        return person;
    }

    public Person removePerson(int id) {
        for (Person currentPerson: persons) {
            if (id == currentPerson.getId()) {
                persons.remove(currentPerson);
                return currentPerson;
            }
        }

        throw new RuntimeException();
//        if (person == null) {
//            throw new RuntimeException();
//        } else {
//            persons.remove(person);
//            return person;
//        }
    }

    public List<Person> getAllPersons() {
        return persons;
    }

    public Person getPersonById(int id) {
        Person person = null;
        for (Person currPers: persons) {
            if (currPers.getId() == id) {
                person = currPers;
            }
        }
        return person;
    }
}
