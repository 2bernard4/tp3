package bernardochiletto.models;

import java.util.Objects;
import java.util.Observable;

public class Auto extends Observable {
    private int nivel_aceite;
    private int nivel_agua;
    private int presion_neumaticos;

    public Auto(int nivel_aceite, int nivel_agua, int presion_neumaticos) {
        this.nivel_aceite = nivel_aceite;
        this.nivel_agua = nivel_agua;
        this.presion_neumaticos = presion_neumaticos;
    }

    public int getNivel_aceite() {
        return nivel_aceite;
    }

    public void setNivel_aceite(int nivel_aceite) {
        this.nivel_aceite = nivel_aceite;
        setChanged();
        notifyObservers();
    }

    public int getNivel_agua() {
        return nivel_agua;
    }

    public void setNivel_agua(int nivel_agua) {
        this.nivel_agua = nivel_agua;
        setChanged();
        notifyObservers();
    }

    public int getPresion_neumaticos() {
        return presion_neumaticos;
    }

    public void setPresion_neumaticos(int presion_neumaticos) {
        this.presion_neumaticos = presion_neumaticos;
        setChanged();
        notifyObservers();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return getNivel_aceite() == auto.getNivel_aceite() &&
                getNivel_agua() == auto.getNivel_agua() &&
                getPresion_neumaticos() == auto.getPresion_neumaticos();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNivel_aceite(), getNivel_agua(), getPresion_neumaticos());
    }

    @Override
    public String  toString() {
        return "Auto{" +
                "nivel_aceite=" + nivel_aceite +
                ", nivel_agua=" + nivel_agua +
                ", presion_neumaticos=" + presion_neumaticos +
                '}';
    }
}
