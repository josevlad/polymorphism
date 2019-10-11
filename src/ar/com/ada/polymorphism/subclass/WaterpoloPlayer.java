package ar.com.ada.polymorphism.subclass;

import ar.com.ada.polymorphism.interfeces.Swimmer;
import ar.com.ada.polymorphism.superclass.Person;

import java.util.Objects;

public class WaterpoloPlayer extends Person implements Swimmer {
    private String category;

    public WaterpoloPlayer() {
    }

    public WaterpoloPlayer(String category) {
        this.category = category;
    }

    public WaterpoloPlayer(String name, String category) {
        super(name);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public void swimming() {
        System.out.println("Nadando en la picina");
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        WaterpoloPlayer that = (WaterpoloPlayer) o;

        return category.equals(that.category) &&
                super.equals(that);
    }

    @Override
    public int hashCode() {
        return -1 * Objects.hash(super.hashCode(), category);
    }

    @Override
    public String toString() {
        return "WaterpoloPlayer { category = " + category + ", name = " + name + " }";
    }
}
