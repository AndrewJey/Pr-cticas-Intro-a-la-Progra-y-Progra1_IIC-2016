/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Paquetes:
package practica_introprogra;
//Importes:
import javax.swing.JOptionPane;
/**
 *
 * @author Andrés J. Jiménez Leandro
 * @date 2016-07-06 Miércoles
 */
public class Practica_IntroProgra {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here:
        /*Variables:
         * [Tt]ipoDeVariable nombreDeVariable = "VALOR DE LA VARIABLE";
         */
        String variableMensaje = "Hola Mundo 2";
        String a = "Hola ";
        String b = "Mundo 3";
        //Imprime "Hola Mundo" en Consola de Sistema:
        System.out.println("Hola Mundo 1");
        System.out.println(variableMensaje);
        System.out.println(a + "MI " + b);
        //Despliega Ventana Emergente de tipo JOptionPane con "Hola Mundo","El Titulo que yo le puse", y el "Icóno de Sistema que escogí (advertencia)":
        JOptionPane.showMessageDialog(null, variableMensaje + " y " + a + b, "TiTuLo MeNsAjE", JOptionPane.WARNING_MESSAGE);
        //Despliego un JOptionPane con mensaje de color en código Hexadecimal, usando HTML y un ícono de Error:
        JOptionPane.showMessageDialog(null, "˂html˃˂font color=#FFFF00˃Hola Mundo", a + "Mi " + b, JOptionPane.ERROR_MESSAGE);
        //Lo mismo, pero con ícono de Pregunta:
        JOptionPane.showMessageDialog(null, "˂html˃˂font color=blue˃Hola Mundo", "TITULO", JOptionPane.QUESTION_MESSAGE);
        //Con ícono de Información:
        JOptionPane.showMessageDialog(null, "Hola Mundo", "TITULO", JOptionPane.INFORMATION_MESSAGE);
        //Sín Icono:
        JOptionPane.showMessageDialog(null, "Hola Mundo", "TITULO", JOptionPane.PLAIN_MESSAGE);
    }
}