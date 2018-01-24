import java.util.ArrayList;

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
}
