
package modelo;



public class Clientes {
    private Integer idCliente;
    private String nombreCliente;
    private String Cedula;
    private static Integer aux=0;

    public static Integer getAux() {
        return aux;
    }

    public static void setAux(Integer aux) {
        Clientes.aux = aux;
    }

    public Clientes(String nombreCliente, String Cedula) {
        this.nombreCliente = nombreCliente;
        this.Cedula = Cedula;
        this.idCliente=idCliente;
        
    }

    public Clientes(int i, String males_darwin, int i0) {
      
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }
    public String clientes(){
        String Resultado = ("");
        return Resultado +idCliente+ nombreCliente + Cedula ;  
    } 
}
