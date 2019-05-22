package bernardochiletto.models;

import java.util.Observable;
import java.util.Observer;

public class Mecanico implements Observer {
    private String nombre;
    private Auto auto;

    public Mecanico(String nombre, Auto auto) {
        this.nombre = nombre;
        this.auto = auto;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o == auto)
        {
            System.out.println(auto.toString());
        }
    }
}
