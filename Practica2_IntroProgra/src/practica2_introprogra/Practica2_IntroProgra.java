/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Paquetes:
package practica2_introprogra;
//Importes:
import javax.swing.JOptionPane;
/**
 *
 * @author Andrés J. Jiménez Leandro
 * @date 2016-07-13 Miércoles
 **/
public class Practica2_IntroProgra {
    /**
     * @param args the command line arguments
     **/
    public static void main(String[] args) {
        // TODO code application logic here
     //VARIABLES:
        //tipoDeVariable nombreDeVariable = datosEnVariable;
        boolean b = true; //Una variable booleana recibe por valor "verdadero" o "falso"
        int i = 1; //Una variable integer es de tipo número entero, y no recibe decimales
        float f = (float) 1.1; //Una variable float de tipo "punto flotante" recibe decimales
        double d = 22.22; //Una variable double de tipo doble numerica es dos veces más grande que toda variable numérica y recibe decimales
        String s = "Hola"; //Una variable String es de tipo "cadena de datos" y recibe una cadena de caracteres que se alinean entre comillas (")
        char c = 'a'; //Una variable char es de tipo caracter y recibe un único caracter, especificado entre comillas simples (')
        //Operaciones en Variables:
        int a = 1+1;
        int e = a+i;
        String g = " + 1 = ";
        System.out.println("1 + 1 = " + 2);
        System.out.println("1 + 1 = " + a);
        System.out.println(i + " + 1 = " + 2);
        System.out.println(i + " + 1 = " + a);
        System.out.println(i + g + a);
        //Segunda Sección: Datos Directos en Código
        double lado = 2;
        double perimetroCuadrado = lado*4; //Pc = lado*4
        double areaCuadrado = lado*lado;     //Ac = lado*lado
        JOptionPane.showMessageDialog(null, "Perimetro: " + perimetroCuadrado + "\nÁrea: " + areaCuadrado, "Resultados", JOptionPane.WARNING_MESSAGE);
        //TERCER SECCIÓN: Pedir Datos al Usuario
        String dato = JOptionPane.showInputDialog("Inserte un número: "); //Pedir datos al usuario
        int lado2 = Integer.parseInt(dato); //Parsear a integer el dato del usuario
        int perimetroCuadrado2 = lado2*4; //Pc = lado*4
        int areaCuadrado2 = lado2*lado2;     //Ac = lado*lado
        JOptionPane.showMessageDialog(null, "Perimetro: " + perimetroCuadrado2 + "\nÁrea: " + areaCuadrado2, "Resultados", JOptionPane.WARNING_MESSAGE);
        //Cuarta Sección: Mejorar Código
        int lado3 = Integer.parseInt(JOptionPane.showInputDialog("Inserte un número: ")); //Pedir datos al usuario             
        JOptionPane.showMessageDialog(null, "Perimetro: " + (lado3*4) + "\nÁrea: " + (lado3*lado3), "Resultados", JOptionPane.WARNING_MESSAGE); //Imprimir Datos
    }   
}