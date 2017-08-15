/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ago15;
import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Ago15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese un numero: ");
        Scanner flujoEntrada = new Scanner (System.in);
        int resultado = 0;
        int numero;
        
        numero = flujoEntrada.nextInt();
        if (numero > 0){
            for (int i=0; i <= numero; i++){
                System.out.println(i);
            }
        }else{
            resultado = funcion(numero);
            System.out.println(resultado);
        }
        
    }
    
    /**
     * Función que multiplica por -1 el valor de entrada
     * @param entrada 
     */
    public static int funcion (int entrada){
        /**int proceso=0,salida=0;
        proceso = entrada*(-1);
        salida = proceso;
        return salida;*/
        return entrada*(-1);
    }    
    
}
