
package modelo;

import javax.swing.JOptionPane;
    public class Calculadora {
        //Atributos de clase
        private Integer numeroUno;
        private Integer numeroDos;
        private String operador;
        private String msj;
    
    //Metodos Constructores
    //Crear objetos
    public Calculadora(Integer numeroUno, Integer numeroDos, String operador, String msj) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
        this.operador = operador;
        this.msj = msj;
    }

    
    public Calculadora(Integer numeroUno, Integer numeroDos, String operador) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
        this.operador = operador;
    }

    
    public Calculadora(Integer numeroUno, Integer numeroDos) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }

    
    public Calculadora(Integer numeroUno) {
        this.numeroUno = numeroUno;
    }

    public Calculadora() {
    }
    
    //Metodos Setters y Getters

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    
    public Integer getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(Integer numeroDos) {
        this.numeroDos = numeroDos;
    }
    
    

    public Integer getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(Integer numeroUno) {
        this.numeroUno = numeroUno;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }
    
    
    //Metodos de clase
    public String positivoNegativo(){

        if(numeroUno>0){
            msj="Positivo";
        }else if(numeroUno == 0){
            msj="Neutro";
        }else{
            msj="Negativo";
        }
        return msj;
    }
    
    
    public String mayorDosValores(){
        if(numeroUno>numeroDos){
            msj=numeroUno+" Es Mayor";
        }else{
            msj=numeroDos+" Es Mayor";
        }
        return msj;
    }
    
    public String tablaDeMultiplicar(){
        msj="";
        for(int i=1;i<=10;i++){
            msj += i+ " * " + numeroUno +" = "+ numeroUno* i+"\n";
        }
        return msj;
    }
    
    public String operaciones(){
        if(operador.equals("suma")){
            msj = "Suma: "+numeroUno+" + "+numeroDos+" = "+String.valueOf(numeroUno+numeroDos);
        }else if(operador.equals("resta")){
            msj = "resta: "+numeroUno+" - "+numeroDos+" = "+String.valueOf(numeroUno-numeroDos);
        }else if(operador.equals("multiplicacion")){
            msj = "Multiplicacion: "+numeroUno+" x "+numeroDos+" = "+String.valueOf(numeroUno*numeroDos);
        }else if(operador.equals("division")){
           msj = "Division: "+numeroUno+" / "+numeroDos+" = "+Double.toString(numeroUno/numeroDos);
        }
        return msj;
    }
}

    
