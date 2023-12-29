package classes;

import java.time.LocalDate;

import enums.TipoEntrenador;

public class Entrenador extends Personal {
    private TipoEntrenador tipoEntrenador; 
    
    public Entrenador (String nombre, LocalDate fechaNacimiento, Equipo equipo, TipoEntrenador tipoEntrenador) throws Exception{
        super(nombre, fechaNacimiento, equipo);
        this.tipoEntrenador = tipoEntrenador;
    }
    public Entrenador (String nombre, LocalDate fechaNacimiento, TipoEntrenador tipoEntrenador) throws Exception{
        super(nombre, fechaNacimiento);
        this.tipoEntrenador = tipoEntrenador;
    }

    public TipoEntrenador getTipoEntrenador() {
        return tipoEntrenador;
    }
    public void setTipoEntrenador(TipoEntrenador tipoEntrenador) {
        this.tipoEntrenador = tipoEntrenador;
    }

    public String toString(){
        return "Nombre: " + getNombre() + "equipo: " + getEquipo() + ", " + getTipoEntrenador();
    }
}
