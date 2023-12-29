import java.time.LocalDate;

import classes.Entrenador;
import classes.Equipo;
import classes.Jugador;
import classes.Partido;
import enums.TipoEntrenador;

public class Main {
   public static void main(String[] args) throws Exception{
      //test1();
      test2();
      // Hola he cambiado algo
      System.out.println("Hola");
   }
   
   public static void test1() throws Exception {
      Equipo local = new Equipo("Betis", "Juan Marin");
      Equipo visitante = new Equipo("Wensilla", "Mamon Pichuan");
      Partido derbi = new Partido(local, visitante);
      Entrenador entreandor1 = new Entrenador("Juan Carmíon", LocalDate.of(2020, 1, 8), TipoEntrenador.ENTRENADOR_FISICO);
      
      System.out.println(entreandor1.getNombre());
      entreandor1.setNombre("$%$&$&/*");
      System.out.println(entreandor1.getNombre());
      System.out.println(local);
      

      System.out.println("Partidos: " + local.getPartidosDisputados());
      System.out.println("Derrotas: " + local.getNumDerrotas());
      System.out.println("Empates: " + local.getNumEmpates());
      System.out.println("Victorias: " + local.getNumVictorias());
      System.out.println("Goles en contra: " + local.getNumGolesContra());
      System.out.println("Goles a favor: " + local.getNumGolesFavor());
      System.out.println("Puntos: " + local.getPuntos());

      System.out.println(visitante);

      System.out.println("Partidos: " + visitante.getPartidosDisputados());
      System.out.println("Derrotas: " + visitante.getNumDerrotas());
      System.out.println("Empates: " + visitante.getNumEmpates());
      System.out.println("Victorias: " + visitante.getNumVictorias());
      System.out.println("Goles en contra: " + visitante.getNumGolesContra());
      System.out.println("Goles a favor: " + visitante.getNumGolesFavor());
      System.out.println("Puntos: " + visitante.getPuntos());
      


      derbi.setGolesLocal(1);
      derbi.terminarPartido();

      System.out.println(local);

      System.out.println("Partidos: " + local.getPartidosDisputados());
      System.out.println("Derrotas: " + local.getNumDerrotas());
      System.out.println("Empates: " + local.getNumEmpates());
      System.out.println("Victorias: " + local.getNumVictorias());
      System.out.println("Goles en contra: " + local.getNumGolesContra());
      System.out.println("Goles a favor: " + local.getNumGolesFavor());
      System.out.println("Puntos: " + local.getPuntos());

      System.out.println(visitante);

      System.out.println("Partidos: " + visitante.getPartidosDisputados());
      System.out.println("Derrotas: " + visitante.getNumDerrotas());
      System.out.println("Empates: " + visitante.getNumEmpates());
      System.out.println("Victorias: " + visitante.getNumVictorias());
      System.out.println("Goles en contra: " + visitante.getNumGolesContra());
      System.out.println("Goles a favor: " + visitante.getNumGolesFavor());
      System.out.println("Puntos: " + visitante.getPuntos());
      
      System.out.println(derbi);
      
   }

   public static void test2() throws Exception {
      Jugador jugador1 = new Jugador("Lolo", "22", LocalDate.parse("2021-01-04"));
      jugador1.setNumeroAmarillas(-2);
      System.out.println(jugador1);
   }
}
