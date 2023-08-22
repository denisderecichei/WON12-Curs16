package org.fasttrack.curs16.generics;

import org.fasttrack.tema15.Calculator;
import org.fasttrack.tema15.Person;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class ObjectDetails<T extends Person, X extends Calculator, Y extends Object> {
    T myObject;


    public ObjectDetails(T myObject) {
        this.myObject = myObject;
    }

    public String myToString() {
        return myObject.getName() + ", " + myObject.getAge() + " din generic";
    }

    public T returnObject() {
        return myObject;
    }

    public <A> A processSomething(A whatever) {
        System.out.println("PRINT DIN ALT GENERIC " + whatever.toString());
        return whatever;
    }

    public Map<X, List<String>> returnMyExes() {
        return null;
    }

    public List<Y> returnY() {return null;}
}
