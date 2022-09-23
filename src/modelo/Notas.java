
package modelo;

import javax.swing.JOptionPane;



public class Notas {
        private Integer idNota;
    private String nombreEstudiante;
    private String nivel;
    private String paralelo;
    private String carrera;
    private Integer notaUno;
    private Integer notaDos;
    private Integer notaTres;
    private Integer examen;
    private String observacion;
    private static Integer contador;
    private static Integer aux=0;

    public Notas(Integer idNota, String nombreEstudiante, String nivel, String paralelo
            , String carrera, Integer notaUno, Integer notaDos, Integer notaTres, Integer examen, String observacion) {
        this.idNota = idNota;
        this.nombreEstudiante = nombreEstudiante;
        this.nivel = nivel;
        this.paralelo = paralelo;
        this.carrera = carrera;
        this.notaUno = notaUno;
        this.notaDos = notaDos;
        this.notaTres = notaTres;
        this.examen = examen;
        this.observacion = observacion;
        contador=0;
    }

    public Notas(Integer idNota, String nombreEstudiante, String nivel, String paralelo, String carrera) {
        this.idNota = idNota;
        this.nombreEstudiante = nombreEstudiante;
        this.nivel = nivel;
        this.paralelo = paralelo;
        this.carrera = carrera;
        contador=0;
    }
    
    public Notas(Integer idNota, String nombreEstudiante, String paralelo, String carrera) {
        this.idNota = idNota;
        this.nombreEstudiante = nombreEstudiante;

        this.paralelo = paralelo;
        this.carrera = carrera;
        contador=0;
    }
    
    

    public Notas(String nombreEstudiante, String nivel, String paralelo, String carrera, Integer notaUno, Integer notaDos, Integer notaTres, Integer examen, String observacion) {
        this.nombreEstudiante = nombreEstudiante;
        this.nivel = nivel;
        this.paralelo = paralelo;
        this.carrera = carrera;
        this.notaUno = notaUno;
        this.notaDos = notaDos;
        this.notaTres = notaTres;
        this.examen = examen;
        this.observacion = observacion;
        contador=0;
    }

    public Notas() {
        contador=0;
    }

    public static Integer getAux() {
        return aux;
    }

    public static void setAux(Integer aux) {
        Notas.aux = aux;
    }
    

    public Integer getIdNota() {
        return idNota;
    }

    public void setIdNota(Integer idNota) {
        this.idNota = idNota;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Integer getNotaUno() {
        return notaUno;
    }

    public void setNotaUno(Integer notaUno) {
        if (validarNota(notaUno)) {
            this.notaUno = notaUno;
        }   
    }
    
    public Boolean validarNota(Integer nota ){
        boolean v = false;
        if (nota <= 10 && nota >= 1) {
            v=true;
        } else{
            JOptionPane.showConfirmDialog(null,"Error la nota no valida");
           
        }
        return v;
    }

    public Integer getNotaDos() {
        return notaDos;
    }

    public void setNotaDos(Integer notaDos) {
        this.notaDos = notaDos;
    }

    public Integer getNotaTres() {
        return notaTres;
    }

    public void setNotaTres(Integer notaTres) {
        this.notaTres = notaTres;
    }

    public Integer getExamen() {
        return examen;
    }

    public void setExamen(Integer examen) {
        this.examen = examen;
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        Notas.contador = contador;
    }

    
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
    public String promedioParcial(){
        return String.valueOf((notaUno+notaDos+notaTres)/3);
         
    }
    
    public String promedioFinal(){
        return String.valueOf((Integer.parseInt(promedioParcial())+examen)/2);
    }
    
    public String observacion(){
        
        if (Integer.valueOf(promedioFinal())<=4){
            observacion = "Reprobado";
        }else if(Integer.parseInt(promedioFinal())<7){
            observacion ="Supletorio";
        }else{
            observacion ="Aprobado";
        }
        return observacion;
    }
    
    public static void contar(){
        contador++;
    }
    public static void acumular(Integer acum){
        Notas.aux += acum;
    }
}

    

