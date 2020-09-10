
package modularidade;

import java.util.Scanner;

/**
 *
 * @author iscbaruchreyes
 */
public class Modularidade {

      
    Scanner entrada = new Scanner (System.in);
    public static void main(String[] args) {
     
        
        
      operaciones op =new operaciones();
      op.mostrar();
      
      op.suma();
      op.resta();
      op.multipliacion();
      op.division();
      
      
      op.mostrarresultados();
  
    }
  
}   
