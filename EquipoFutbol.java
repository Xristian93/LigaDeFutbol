import java.util.HashSet;

/**
 * Write a description of class EquipoFutbol here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EquipoFutbol
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int victorias;
    private int empates;
    private int derrotas;
    private int id;
    private String calidad;

    /**
     * Constructor for objects of class EquipoFutbol
     */
    public EquipoFutbol(String nombre, int victorias, int empates, int derrotas, int id, String calidad)
    {
        this.nombre = nombre;
        this.id = id;
        this.victorias = victorias;
        this.empates = empates;
        this.derrotas = derrotas;
        if (calidad.toLowerCase().equals("bueno") || calidad.toLowerCase().equals("malo") || calidad.toLowerCase().equals("regular")){
            this.calidad = calidad;
        }
        else{
            this.calidad = null;
        }
    }

    /**
     * Cambia el nombre de un equipo
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    /**
     * Muestra el nombre de un equipo
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * Cambia las victorias de un equipo
     */
    public void setVictorias(int victorias)
    {
        this.victorias = victorias;
    }
    
    /**
     * Muestra las victorias de un equipo
     */
    public int getVictorias()
    {
        return victorias;
    }
    
    /**
     * Cambia los empates de un equipo
     */
    public void setEmpates(int empates)
    {
        this.empates = empates;
    }
    
    /**
     * Muestra los empates de un equipo
     */
    public int getEmpates()
    {
        return empates;
    }
    
    /**
     * Cambia las derrotas de un equipo
     */
    public void setDerrotas(int derrotas)
    {
        this.derrotas = derrotas;
    }
    
    /**
     * Muestra las derrotas de un equipo
     */
    public int getDerrotas()
    {
        return derrotas;
    }
    
    /**
     * Muestra los datos de un equipo
     */
    public String getDatos()
    {
        return "ID: " + id + " Nombre del equipo: " + nombre + " Victorias: "
        + victorias + " Empates: " + empates + " Derrotas: " + derrotas + " Calidad: " + calidad;
    }
    
    /**
     * Muestra el ID de un equipo
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Muestra la calidad del equipo
     */
    public String getCalidad(){
        return calidad;
    }
}
