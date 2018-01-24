
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

    /**
     * Constructor for objects of class EquipoFutbol
     */
    public EquipoFutbol(String nombre)
    {
        this.nombre = nombre;
        victorias = 0;
        empates = 0;
        derrotas = 0;
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
}