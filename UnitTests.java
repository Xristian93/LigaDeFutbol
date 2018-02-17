import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class UnitTests {
  public void test01() {
    LigaDeFutbol LigaDeFutbol1 = new LigaDeFutbol("datos2.txt");
    System.out.println("Añadiendo 6 equipos a la coleccion...");
    System.out.println(" ");
    //Cambiando numero de victorias y derrotas de los equipos
    LigaDeFutbol1.cambiarVictorias(0,10);   LigaDeFutbol1.cambiarDerrotas(0,1);
    LigaDeFutbol1.cambiarVictorias(1,4);    LigaDeFutbol1.cambiarDerrotas(1,10);
    LigaDeFutbol1.cambiarVictorias(2,9);    LigaDeFutbol1.cambiarDerrotas(2,3);
    LigaDeFutbol1.cambiarVictorias(3,4);    LigaDeFutbol1.cambiarDerrotas(3,8);
    LigaDeFutbol1.cambiarVictorias(4,8);    LigaDeFutbol1.cambiarDerrotas(4,5);
    LigaDeFutbol1.cambiarVictorias(5,12);   LigaDeFutbol1.cambiarDerrotas(5,2);
    System.out.println("Mostrando por pantalla los datos de los objetos añadidos...");
    System.out.println(" ");
    LigaDeFutbol1.listEquipos();
    System.out.println(" ");
    System.out.println("Mostrando ordenadamente por numero de victorias...");
    System.out.println(" ");
    LigaDeFutbol1.ordenarPorVictorias();
    System.out.println(" ");
    System.out.println("Mostrando ordenadamente por numero de derrotas...");
    System.out.println(" ");
    LigaDeFutbol1.ordenarPorDerrotas();
    System.out.println(" ");
    System.out.println("Modificando las caracteristicas de un par de objetos...");
    System.out.println(" ");
    LigaDeFutbol1.cambiarVictorias(4,11);
    LigaDeFutbol1.cambiarDerrotas(1,12);
    System.out.println("Eliminando los equipos con menos de 10 victorias...");
    System.out.println(" ");
    LigaDeFutbol1.eliminarPorVictorias(10);
    System.out.println("Mostrando de nuevo la lista de objetos...");
    System.out.println(" ");
    LigaDeFutbol1.listEquipos();
  }
}