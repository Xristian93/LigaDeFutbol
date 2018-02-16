import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
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
    public LigaDeFutbol(String archivoTxt)
    {
        listaEquipos = new ArrayList<EquipoFutbol>();
        id = 1;
        try {
            File archivo = new File(archivoTxt);
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()) {
                String[] arrayStrings = sc.nextLine().split(" # ");
                String nombre = arrayStrings[0];
                int victorias = Integer.parseInt(arrayStrings[1]);
                int empates = Integer.parseInt(arrayStrings[2]);
                int derrotas = Integer.parseInt(arrayStrings[3]);
                añadirEquipo(nombre, victorias, empates, derrotas);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Añade un equipo nuevo
     */
    public void añadirEquipo(String nombre, int victorias, int empates, int derrotas)
    {
        equipo = new EquipoFutbol(nombre, victorias, empates, derrotas, id);
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

    /**
     * Cambia el numero de derrotas de un equipo
     */
    public void cambiarDerrotas(int index, int derrotas){
        listaEquipos.get(index).setDerrotas(derrotas);
    }

    /**
     * Ordena el array por numero de derrotas, de mayor a menor.
     */
    public void ordenarPorDerrotas() {
        int derrotaTopeMasCercana = -1;
        int derrotaMasAlta = 0;
        for (EquipoFutbol listaActual : listaEquipos){
            if(listaActual.getDerrotas() >= 0) {
                if (listaActual.getDerrotas() > derrotaTopeMasCercana){
                    derrotaTopeMasCercana = listaActual.getDerrotas();
                    derrotaMasAlta = listaActual.getDerrotas();
                }                  
            }
        }
        while (derrotaMasAlta >= 0){
            for (EquipoFutbol listaActual : listaEquipos){
                if (listaActual.getDerrotas() == derrotaMasAlta){
                    System.out.println(listaActual.getDatos());
                }
            }
            derrotaMasAlta--;
        }
    }

    /**
     * Cambia el numero de derrotas de un equipo indicando el id del mismo
     */
    public void cambiarDerrotasPorId(int id, int derrotas){
        for (int i = 0; i < listaEquipos.size(); i++){
            if (listaEquipos.get(i).getId() == id){
                listaEquipos.get(i).setDerrotas(derrotas);
            }
        }
    }

    /**
     * Elimina todos los equipos con menos victorias de las indicadas
     */
    public void eliminarPorVictorias(int searchVictoria){
        Iterator<EquipoFutbol> it = listaEquipos.iterator();
        while (it.hasNext()){
            EquipoFutbol t = it.next();
            int numVictorias = t.getVictorias();
            if (numVictorias < searchVictoria){
                it.remove();
            }
        }
    }
}
