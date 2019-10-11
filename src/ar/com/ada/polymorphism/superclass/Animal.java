package ar.com.ada.polymorphism.superclass;

import java.util.Objects;

public class Animal {
    protected String breed;

    public Animal() {
    }

    public Animal(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal that = (Animal) o;
        return breed.equals(that.breed);
    }

    @Override
    public int hashCode() {
        return -2 * Objects.hash(breed);
    }

    @Override
    public String toString() {
        return "Animal { breed = " + breed + " }";
    }
}
