/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;

/**
 *
 * @author GAMER
 */
public class Cuenta {
    //Atributos de la clase.
    private String id_cuenta="7452365488";
    private int pin=1111;
    private String titular="Pedro Alomía";
    private Double monto=0.0;
    //Constructor #1
    public Cuenta() {
        monto=1500000.00;
        
    }
    //Constructor #2
    public Cuenta(String titular){
    
        this.titular=titular;
    }
    //Metodos Seeter y Getter.
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
    //Metodo toString.
    @Override
    public String toString() {
        return "Tu saldo actual es: $"+getMonto()+" COP.";
    }
    //Metodo para pedir el PIN
    public void comprobarPIN(int clave){
    
        if (pin==clave) {
            System.out.println("¡Bienvenido "+getTitular()+"!");
            
        }else{
            System.out.println("Clave errada.");
            System.exit(0);
        }
    }
    //Metodo para depositar dinero a la cuenta.
    public void depositarDinero(Double cantidad){
    
        if (cantidad<0) {
            System.out.println("No se puede ingresar numeros negativos.");
            
        }else{
        
            monto+=cantidad;
            System.out.println("¡Deposito exitoso!");
            System.out.println(toString());
        }
    }
    //Metodo para retirar dinero de la cuenta.
    public void retirarDinero(Double cantidad){
        if(cantidad<0){
        
            System.out.println("No se puede ingresar un valor negativo.");
        }else if (cantidad>monto) {
            setMonto(0.0);
            System.out.println("Haz retirado todo tu dinero");
            System.out.println(toString());
            
        }else{
        monto-=cantidad;
            System.out.println("Retiro exitoso!");
            System.out.println(toString());
        }
        
    }
      
}
