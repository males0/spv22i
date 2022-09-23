
package appspv22i;

import modelo.Calculadora;
import modelo.*;
import principal.mdiSPV22i;
import vista.jifrmSumaNumeros;
import vista.*;
import Evaluaciones.jifrmExamen;

/**
 *
 * @author males
 */
public class AppSPV22i {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      mdiSPV22i obj=new mdiSPV22i("MENU");
      obj.show();
      
        jifrmSumaNumeros nmj=new jifrmSumaNumeros("SUMA DE NUMEROS");
        nmj.show();
        
       
        
//       Notas.contar();
    }
    //instanciar la clase
    //crear un objeto
    Calculadora obj = new Calculadora();
 
}
    
  

 



