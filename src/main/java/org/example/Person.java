package org.example;

import java.util.Objects;

public class Person {
    String prenume;
    String nume;

    public Person(String prenume) {
        this.prenume = prenume;
    }

    @Override
    public String toString() {
        return "Person{" +
                "prenume='" + prenume + '\'' +
                ", nume='" + nume + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(prenume, person.prenume) && Objects.equals(nume, person.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prenume, nume);
    }
}
