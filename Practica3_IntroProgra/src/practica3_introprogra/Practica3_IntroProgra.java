/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Paquetes:
package practica3_introprogra;
//Importes:
import javax.swing.JOptionPane;
/**
 **
 ** @author Andrés J. Jiménez Leandro
 ** @date 2016-07-20 Miércoles
 **/
public class Practica3_IntroProgra {
    /**
     * @param args the command line arguments
     **/
    public static void main(String[] args) {
        // TODO code application logic here
        //Programa para definir si son pares o impares: (básico y sin validaciones)
        //Pedir datos al usuario:
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un Número: ")); //Se crea variable de numero entero, se asigna a solicitar dato de usuario, y se parsea a integer, para poder volverla numerica
        if ((numero % 2) == 0) { //Si número MOD 2 es 0 -oh sea, si el cociente resultante de dividir el numero entre dos es de cero-, entonces:
            JOptionPane.showMessageDialog(null, "Su número: " + numero + ", es Par", "ES PAR", JOptionPane.WARNING_MESSAGE); //Imprima este mensaje...
        } else { //Si no, de lo contrario, entonces...
            JOptionPane.showMessageDialog(null, "Su número: " + numero + ", es ImPar", "ES IMPAR", JOptionPane.ERROR_MESSAGE); //Imprima este otro mensaje...
        }
        //Averiguemos si es primo: (básico, pero con validaciones)
        if (numero == 0) {
            System.out.println("Su número es CERO, no es ni primo, ni no primo");
        } else if (numero == 1) {
            System.out.println("Su número es UNO, y es primo");
        } else if (((numero / numero) == 1) && ((numero / 1) == numero)) {
            System.out.println("Su número es: " + numero);
        } else {
            System.out.println("NO ES UN NUMERO");
        }
        if((numero==2)||(numero==3)||(numero==5)||(numero==7)||(numero==9)||(numero==11)) {
           System.out.println("Su número " + numero + ", es PRIMO");
        }else
        if ((numero % 2) == 0) {
            System.out.println("Su número NO es PRIMO, es divisible entre 2");
        } else if ((numero % 3) == 0) {
            System.out.println("Su número NO es PRIMO, es divisible entre 3");
        } else if ((numero % 5) == 0) {
            System.out.println("Su número NO es PRIMO, es divisible entre 5");
        } else if ((numero % 7) == 0) {
            System.out.println("Su número NO es PRIMO, es divisible entre 7");
        } else if ((numero % 9) == 0) {
            System.out.println("Su número NO es PRIMO, es divisible entre 9");
        } else if ((numero % 11) == 0) {
            System.out.println("Su número NO es PRIMO, es divisible entre 11");        
        } else {
            System.out.println("Sú número: " + numero + ", si es primo");        
        }
    }
}