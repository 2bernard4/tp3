package bernardochiletto;

import bernardochiletto.models.Auto;
import bernardochiletto.models.Mecanico;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Auto auto = new Auto(2,3,4);
        Mecanico mecanico = new Mecanico("bernardo", auto);
        auto.addObserver(mecanico);

        System.out.println("Datos viejos del auto: " + auto.toString());

        auto.setNivel_aceite(3);
        auto.setNivel_agua(4);
        auto.setPresion_neumaticos(5);

    }
}
