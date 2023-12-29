package classes;

import java.time.LocalDate;

public class Personal {
    private String nombre;
    private LocalDate fechaNacimiento;
    private Integer numeroAmarillas;
    private Integer numeroRojas;
    private Boolean estaSancionado;
    private Equipo equipo;
    
    // Constructores:
    public Personal(String nombre, LocalDate fechaNacimiento, Equipo equipo) throws Exception{
        checkSetNombre(nombre);
        checkSetFechaNacimiento(fechaNacimiento);
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroAmarillas = 0;
        this.numeroRojas = 0;
        this.estaSancionado = false;
        this.equipo = equipo;
    }
    public Personal(String nombre, LocalDate fechaNacimiento) throws Exception{
        checkSetNombre(nombre);
        checkSetFechaNacimiento(fechaNacimiento);
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroAmarillas = 0;
        this.numeroRojas = 0;
        this.estaSancionado = false;
        this.equipo = null;
    }

    // Checkers: 
    private void checkSetNombre(String nombre) throws Exception {
        if (!nombre.matches("[a-zA-Z 0-9\\u00f1\\u00d1À-ÿ]+")) {
            throw new Exception("El nombre: " + nombre + " es inválido, solo puede tener letras, números y espacios");
        } 
    }

    private void checkSetFechaNacimiento(LocalDate fechaNacimiento) throws Exception {
        LocalDate hoy = LocalDate.now();

        if (hoy.isBefore(fechaNacimiento)) {
            throw new Exception("La fecha " + fechaNacimiento + " es posterior a hoy");
        }
    }

    private void checkSetNumeroTarjetas(Integer numeroTarjetas) throws Exception {
        if (numeroTarjetas < 0) {
            throw new Exception("No puede tener un número negativo de tarjetas");
        }
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre) throws Exception{
        checkSetNombre(nombre); // Si se cumple la expeción salta las siguientes líneas y manda el mensaje de error
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) throws Exception {
        checkSetFechaNacimiento(fechaNacimiento);
        this.fechaNacimiento = fechaNacimiento;
    }

     public Integer getNumeroAmarillas() {
        return numeroAmarillas;
    }

    public void setNumeroAmarillas(Integer numeroAmarillas) throws Exception {
        checkSetNumeroTarjetas(numeroAmarillas);
        this.numeroAmarillas = numeroAmarillas;
    }

    public Integer getNumeroRojas() {
        return numeroRojas;
    }

    public void setNumeroRojas(Integer numeroRojas) throws Exception {
        checkSetNumeroTarjetas(numeroRojas);
        this.numeroRojas = numeroRojas;
    }

    public Boolean getEstaSancionado() {
        return estaSancionado;
    }

    public void setEstaSancionado(Boolean estaSancionado) {
        this.estaSancionado = estaSancionado;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    
}
