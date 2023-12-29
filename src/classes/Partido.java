package classes;

public class Partido {
   private Equipo local;
   private Equipo visitante;
   private Integer golesLocal;
   private Integer golesVisitante;

   public Partido (Equipo local, Equipo visitante){
    this.local = local;
    this.visitante = visitante;
    this.golesLocal = 0;
    this.golesVisitante = 0;
   }
   public Equipo getLocal() {
       return local;
   }
   public void setLocal(Equipo local) {
       this.local = local;
   }
   public Equipo getVisitante() {
       return visitante;
   }
   public void setVisitante(Equipo visitante) {
       this.visitante = visitante;
   }
   public Integer getGolesLocal() {
       return golesLocal;
   }
   public void setGolesLocal(Integer golesLocal) {
       this.golesLocal = golesLocal;
   }
   public Integer getGolesVisitante() {
       return golesVisitante;
   }
   public void setGolesVisitante(Integer golesVisitante) {
       this.golesVisitante = golesVisitante;
   }
   public void terminarPartido(){
      //goles favor y contra, v/d/e, partidos
      this.local.marcarGoles(this.golesLocal);
      this.local.encajarGoles(this.golesVisitante);
      this.visitante.marcarGoles(this.golesVisitante);
      this.visitante.encajarGoles(this.golesLocal);

      if(this.golesLocal > this.golesVisitante){
        this.local.ganar();
        this.visitante.perder();
      }
      else if(this.golesLocal == this.golesVisitante){
        this.local.empatar();
        this.visitante.empatar();
      }
      else{
        this.local.perder();
        this.visitante.ganar();
      }
      this.local.jugar();
      this.visitante.jugar();
   }
   public String toString(){
    return this.local.getNombre() + " " + this.golesLocal + " - " + this.golesVisitante + " " + this.visitante.getNombre() + ", en: " + this.local.getEstadio()  ;
   }

}
