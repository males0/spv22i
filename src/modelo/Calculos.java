
package modelo;
import modelo.Productos;


public class Calculos {

    public Calculos(Integer Iva, Integer tot) {
        this.Iva = Iva;
        this.tot = tot;
    }

    public Integer getIva() {
        return Iva;
    }

    public void setIva(Integer Iva) {
        this.Iva = Iva;
    }

    public Integer getTot() {
        return tot;
    }

    public void setTot(Integer tot) {
        this.tot = tot;
    }
      private Integer Iva;
      private Integer tot;
      
    
    public String total(){
        Integer a=Iva;
        Integer b=tot;
        int c = a+b;
        return String.valueOf(c);

}
}
