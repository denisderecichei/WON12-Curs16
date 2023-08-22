package org.fasttrack.tema15;

public class Student extends Person {
    private int nota;

    public Student(String name, int age, int nota) {
        super(name, age);
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
