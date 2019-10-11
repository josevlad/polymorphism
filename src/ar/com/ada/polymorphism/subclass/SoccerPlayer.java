package ar.com.ada.polymorphism.subclass;

import ar.com.ada.polymorphism.interfeces.Runner;
import ar.com.ada.polymorphism.superclass.Person;

import java.util.Objects;

public class SoccerPlayer extends Person implements Runner {
    private Integer numero;
    private String teamName;

    public SoccerPlayer() {
    }

    public SoccerPlayer(Integer numero, String teamName) {
        this.numero = numero;
        this.teamName = teamName;
    }

    public SoccerPlayer(String name, Integer numero, String teamName) {
        super(name);
        this.numero = numero;
        this.teamName = teamName;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public void run() {
        System.out.println("Corriendo en el partido de Racing");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoccerPlayer that = (SoccerPlayer) o;
        return numero.equals(that.numero) &&
                teamName.equals(that.teamName) &&
                super.equals(that);
    }

    @Override
    public int hashCode() {
        return -3 * Objects.hash(super.hashCode(), numero, teamName);
    }

    @Override
    public String toString() {
        return "SoccerPlayer { numero = " + numero + ", teamName='" + teamName +  ", name='" + name + " }";
    }
}
