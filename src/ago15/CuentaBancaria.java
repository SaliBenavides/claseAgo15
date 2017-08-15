/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ago15;

/**
 *
 * @author Estudiante
 */
public class CuentaBancaria {
    //Atributos
    public int numero,clave;
    public String nombreTitular;
    public double saldo = 0;
    
    public void setNumero(int num){
        this.numero = num;
    }
    public void setClave(int clave){
        this.clave = clave;
    }
    
    public void setNombre(int clave){
        this.clave = clave;
    }
    
    public void consignarDinero(double ingreso){
        this.saldo = this.saldo+ingreso;
    }
    public void retirarDinero(double retiro){
        this.saldo = this.saldo-retiro;
    }
    public void cambiarClave(int nuevaClave){
        this.clave = nuevaClave;
    }
    public void consultarSaldo(){
        System.out.println("El saldo en la cuenta No. "+this.numero+" es: ");
        System.out.println(this.saldo);
    }
    
}
