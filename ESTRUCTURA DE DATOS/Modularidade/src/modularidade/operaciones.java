
package modularidade;

import java.util.Scanner;

/**
 *
 * @author iscbaruchreyes
 */ 


public class operaciones {
     Scanner entrada = new Scanner (System.in);
   Float primerdato ;
   Float segundodato;
  
   
   
      
    public void mostrar(){
    
    
     
 System.out.println("Numeros con punto decimal es necesario ponerlos con coma");       
 System.out.println("Ingrese el primer numero");  
  primerdato=entrada.nextFloat();
 System.out.println("Ingrese el segundo numero");
 segundodato=entrada.nextFloat();
       
 
 
 }
    
  public void  suma (){
        
   resultados = primerdato+segundodato;
          
    
   
}
  public void resta(){
     
      resultador = primerdato-segundodato;
      
      
      
  }
  
  public void multipliacion(){
      
      resultadom= primerdato * segundodato;
 
  }
  
  public void division(){
      
      resultadod= primerdato / segundodato;
     
      
  }
  
     Float resultados;
     Float resultador;
      Float resultadom;
    Float resultadod;

  public void mostrarresultados(){
      
    System.out.println("El resultado de la suma es:" + resultados);  
    System.out.println("El resultado de la resta es:"+resultador);  
    System.out.println("El resultado de la multiplicación es:"+ resultadom);  
    System.out.println("El resultado de la división es:"+resultadod );  
      
  }
  
  
}
    
    