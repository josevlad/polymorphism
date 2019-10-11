package ar.com.ada.polymorphism.superclass;

import java.util.Objects;

public class Person {
    protected String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person that = (Person) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return -5 * Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person { name = " + name + " }";
    }
}
