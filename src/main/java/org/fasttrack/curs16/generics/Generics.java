package org.fasttrack.curs16.generics;

import org.fasttrack.tema15.Person;
import org.fasttrack.tema15.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Generics {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        strings.add("unu");
        integers.add(1);

        Person vlad = new Person("Vlad", 100);
//        ObjectDetails<Person> myObjectDetails = new ObjectDetails<>(vlad);
//        ObjectDetails<Student> myStudentDetaisl = new ObjectDetails<>(new Student("George", 19, 10));
//        System.out.println(myObjectDetails.myToString());
//        System.out.println(myStudentDetaisl.myToString());

//        String myVirtualString = myObjectDetails.processSomething("dasdas");
//        Person myVirtualPerson = myObjectDetails.processSomething(vlad);

        Optional<String> optionalString = Optional.of("myString");
        Optional<String> empty1 = Optional.ofNullable(null);
        Optional<String> empty2 = Optional.empty();

        if (optionalString.isPresent()) {
            System.out.println("prezent + " + optionalString.get());
        }

//        empty1.get();
        empty2.get();
//        sorter.sort(list.get(list.size() + obj3.getSize()))
    }


    public static void dasdasda(String thisOptional) {

    }

}
