/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import cuenta.Cuenta;
import java.util.Scanner;
/**
 *
 * @author GAMER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instancia de Scanner y de Cuenta
        Scanner sc=new Scanner(System.in);
        Cuenta c= new Cuenta();
        //Ingreso de PIN para poder entrar al menu ppal.
        System.out.println("Digite el PIN de su cuenta: ");
        int clave=sc.nextInt();
        c.comprobarPIN(clave);
        //Menu ppal.
        System.out.println("Elija una opcion del menú:");
        System.out.println("1.Ver Saldo.");
        System.out.println("2.Retirar Dinero.");
        System.out.println("3.Depositar Dinero");
        System.out.println("4.Salir");
        int opcion=sc.nextInt();
       
        switch (opcion) {
            case 1:
                System.out.println(c.toString());
                
                break;
            case 2:
                System.out.println("Ingrese la cantidad a retirar: ");
                Double retirar=sc.nextDouble();
                c.retirarDinero(retirar);
                break;
            case 3:
                System.out.println("Ingrese la cantidad a depositar: ");
                Double depositar=sc.nextDouble();
                c.depositarDinero(depositar);
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Opción incorrecta.");;
        }
        
        
    }
    
}
