package classes;

public class Equipo implements EquipoInteface {
    private String nombre;
    private Integer numGolesFavor;
    private Integer numGolesContra;
    private Integer numVictorias;
    private Integer numDerrotas;
    private Integer numEmpates;
    private Integer puntos;
    private String estadio;
    private Integer partidosDisputados;

    public Equipo (String nombre, String estadio){
        this.nombre = nombre;
        this.estadio = estadio;
        this.numGolesFavor = 0;
        this.numGolesContra = 0;
        this.numVictorias = 0;
        this.numDerrotas = 0;
        this.numEmpates = 0;
        this.puntos = 0;
        this.partidosDisputados = 0;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getNumGolesFavor() {
        return numGolesFavor;
    }
    public void marcarGoles(Integer goles){
        this.numGolesFavor += goles;
    }
    public Integer getNumGolesContra() {
        return numGolesContra;
    }
    public void encajarGoles(Integer golesEncajados){
        this.numGolesContra += golesEncajados;
    }
    public Integer getNumVictorias() {
        return numVictorias;
    }
    public void ganar(){
        this.numVictorias ++;
        this.puntos = this.puntos + 3;
    }
    public Integer getNumDerrotas() {
        return numDerrotas;
    }
    public void perder(){
        this.numDerrotas ++;
    }
    public Integer getNumEmpates() {
        return numEmpates;
    }
    public void empatar(){
        this.numDerrotas ++;
        this.puntos ++;
    }
    public Integer getPuntos() {
        return puntos;
    }
    
    public String getEstadio() {
        return estadio;
    }
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }
    public Integer getPartidosDisputados() {
        return partidosDisputados;
    }
    public void jugar(){
        this.partidosDisputados ++;
    }
    public String toString(){
        return "Nombre del equipo: " + this.nombre;
    }
}
