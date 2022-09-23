
package modelo;

public class Docente { 
     private  Integer idDocente;
     private  String  Nombre;
     private  Integer horaIngreso;
     private  static String  Observacion;
 public Docente(Integer idDocente, String Nombre, Integer horaIngreso, String Observacion) {
        this.idDocente = idDocente;
        this.Nombre = Nombre;
        this.horaIngreso = horaIngreso;
        this.Observacion = Observacion;
    }
 public Docente(){
     
 }

    public Integer getIdDocente() {
        return idDocente;
       
    }

    public void setIdDocente(Integer idDocente) {
        this.idDocente = idDocente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(Integer horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }
    
}
                  
    
