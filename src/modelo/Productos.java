
package modelo;


public class Productos {
    private Integer idProductos;
    private String seleccionProducto;
    private Integer precio;
    private Integer descuento;
    private static Integer acumulador=0;
    private static Integer aux=0;
    
public Productos(Integer idProductos, String seleccionProducto, Integer precio, Integer descuento) {
        this.idProductos = idProductos;
        this.seleccionProducto = seleccionProducto;
        this.precio = precio;
        this.descuento = descuento;
        
    }
public static Integer getAux() {
        return aux;
    }

    public static void setAux(Integer aux) {
        Productos.aux = aux;
    }

    public Integer getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(Integer idProductos) {
        this.idProductos = idProductos;
    }

    public String getSeleccionProducto() {
        return seleccionProducto;
    }

    public void setSeleccionProducto(String seleccionProducto) {
        this.seleccionProducto = seleccionProducto;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getDescuento() {
        return descuento;
    }

    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }

    public static Integer getAcumulador() {
       
        return acumulador;
    }

    public static void setAcumulador(Integer acumulador) {
        Productos.acumulador = acumulador;
    }
    public String productos(){
        String Resultado = ("nombres");
        return Resultado +idProductos;  
    }
    public Integer precio(){
        Integer rest=0;
         return rest + descuento+precio+idProductos;
         
   }     
        
//     public  void Acumulador(Integer acum){
//        this.acumulador += acum;
        
        public static void acumular(Integer acum){
        

    
}     
     public String Descuento(){
        return String.valueOf((descuento*precio)/100);
         
    }
    public String SubTotal(){
       return String.valueOf(precio-(Integer.parseInt(Descuento())));
    }
    public String Iva(){
        
        return String.valueOf((Double.valueOf(SubTotal())*12/100)); 
    }
   public String Total(){
       
        return String.valueOf((Double.valueOf(SubTotal()))+(Double.valueOf(Iva())));
    } 
         
 }     
     
     
