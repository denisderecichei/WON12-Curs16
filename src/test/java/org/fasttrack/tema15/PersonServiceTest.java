package org.fasttrack.tema15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class PersonServiceTest {
    private PersonService personService;

    @BeforeEach
    public void setup() {
        personService = new PersonService();
    }

    @Test
    public void testAddPersons() {
        Person p1 = new Person("Mihai", 28);
        personService.addPerson(p1);
        Assertions.assertNotEquals(0, p1.getId());
        Assertions.assertEquals(1, p1.getId());
        Person p2 = new Person("Vlad", 14);
        personService.addPerson(p2);
        Assertions.assertEquals(2, p2.getId());
        Assertions.assertEquals(2, personService.getAllPersons().size());
        personService.removePerson(1);
        Assertions.assertNull(personService.getPersonById(1));
        System.out.println(personService.getPersonById(1).toString());
        Assertions.assertNotNull(personService.getPersonById(2));
        Assertions.assertEquals(1, personService.getAllPersons().size());
    }

    @Test
    public void testRemovePersons() {
        Assertions.assertThrows(RuntimeException.class, () -> personService.removePerson(1));
    }
}
