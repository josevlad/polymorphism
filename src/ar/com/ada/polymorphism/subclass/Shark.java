package ar.com.ada.polymorphism.subclass;

import ar.com.ada.polymorphism.interfeces.Swimmer;
import ar.com.ada.polymorphism.superclass.Animal;

import java.util.Objects;

public class Shark extends Animal implements Swimmer {
    private String type;

    public Shark() {
    }

    public Shark(String type) {
        this.type = type;
    }

    public Shark(String breed, String type) {
        super(breed);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void swimming() {
        System.out.println("Nadando en rio de la plata");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shark that = (Shark) o;
        return type.equals(that.type) &&
                super.equals(that);
    }

    @Override
    public int hashCode() {
        return -8 * Objects.hash(super.hashCode(), type);
    }

    @Override
    public String toString() {
        return "Shark { type = " + type + ", breed = " + breed + " }";
    }
}
