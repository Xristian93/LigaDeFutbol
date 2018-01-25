import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class LigaDeFutbol here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LigaDeFutbol
{
    // instance variables - replace the example below with your own
    private ArrayList<EquipoFutbol> listaEquipos;
    private EquipoFutbol equipo;
    private int id;

    /**
     * Constructor for objects of class LigaDeFutbol
     */
    public LigaDeFutbol()
    {
        listaEquipos = new ArrayList<EquipoFutbol>();
        id = 1;
    }

    /**
     * Añade un equipo nuevo
     */
    public void añadirEquipo(String nombre)
    {
        equipo = new EquipoFutbol(nombre,id);
        listaEquipos.add(equipo);
        id++;
    }

    /**
     * Muestra una lista de los equipos
     */
    public void listEquipos()
    {
        for(EquipoFutbol lista : listaEquipos) {
            System.out.println(lista.getDatos());
        }
    }

    /**
     * Cambia el numero de victorias de un equipo
     */
    public void cambiarVictorias(int index, int victorias){
        listaEquipos.get(index).setVictorias(victorias);
    }

    /**
     * Ordena el array por numero de victorias, de mayor a menor.
     */
    public void ordenarPorVictorias() {
        int victoriaTopeMasCercana = -1;
        int victoriaMasAlta = 0;
        for (EquipoFutbol listaActual : listaEquipos){
            if(listaActual.getVictorias() >= 0) {
                if (listaActual.getVictorias() > victoriaTopeMasCercana){
                    victoriaTopeMasCercana = listaActual.getVictorias();
                    victoriaMasAlta = listaActual.getVictorias();
                }                  
            }
        }
        while (victoriaMasAlta >= 0){
            for (EquipoFutbol listaActual : listaEquipos){
                if (listaActual.getVictorias() == victoriaMasAlta){
                    System.out.println(listaActual.getDatos());
                }
            }
            victoriaMasAlta--;
        }
    }
}
