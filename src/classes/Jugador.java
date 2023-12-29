package classes;

import java.time.LocalDate;

public class Jugador extends Personal {
    private String dorsal;
    private Integer goles;

    public Jugador (String nombre, String dorsal, LocalDate fechaNacimiento, Equipo equipo) throws Exception{
        super(nombre, fechaNacimiento, equipo);
        this.dorsal = dorsal;
        this.goles = 0;
    }
    public Jugador(String nombre, String dorsal, LocalDate fechaNacimiento) throws Exception{
        super(nombre, fechaNacimiento);
        this.dorsal = dorsal;
        this.goles = 0;
    }

    public String getDorsal(){
        return this.dorsal;
    }
    public void setDorsal(String dorsal){
        this.dorsal = dorsal;
    }
    public Integer getGoles() {
        return goles;
    }
    public void setGoles(Integer goles) {
        this.goles = goles;
    }
    
    public String toString(){
        return "Nombre: " + getNombre() + ", equipo: " + getEquipo() + ",  dorsal: " + dorsal;
    }
}