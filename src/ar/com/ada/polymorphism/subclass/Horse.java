package ar.com.ada.polymorphism.subclass;

import ar.com.ada.polymorphism.interfeces.Runner;
import ar.com.ada.polymorphism.superclass.Animal;

import java.util.Objects;

public class Horse extends Animal implements Runner {

    private String name;

    public Horse() {
    }

    public Horse(String name) {
        this.name = name;
    }

    public Horse(String breed, String name) {
        super(breed);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Corriendo en el hipodromo");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse that = (Horse) o;
        return name.equals(that.name) &&
                super.equals(that);
    }

    @Override
    public int hashCode() {
        return -10 * Objects.hash(super.hashCode(), name);
    }

    @Override
    public String toString() {
        return "Horse { name = " + name + ", breed = " + breed + " }";
    }
}
