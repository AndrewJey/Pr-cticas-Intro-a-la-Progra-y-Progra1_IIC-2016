/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Paquetes:
package practica1_prograi;
//Importes:
import javax.swing.JOptionPane;
/**
 **
 ** @author Andrés J. Jiménez Leandro
 ** @date 2016-07-21 Jueves
 **/
public class Menu extends Object {
    //Variables Globales:
    int opc;
    //Constructor Lleno:
    public Menu(int opc) {
        this.opc = opc;
    }
    //Constructor Vacío:
    public Menu(){}
    /**
     * Método de Menú, que llama a las clases
     **/
    public void menuFiguras(){        
        JOptionPane.showMessageDialog(null, "1. Rectangulo" + "\n 2. Cuadrado" + "\n 3. Triángulo Equilátero", "FIGURAS", JOptionPane.INFORMATION_MESSAGE); //Información del Menú
        this.opc = Integer.parseInt(JOptionPane.showInputDialog("Escoja Su Opción:")); //Usuario digita su opción
        switch(opc){ //Menú de Selección
            //Case 1: "Rectangulo"
            case 1:{
                int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la Base: "));
                int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la Altura: "));
                Figuras.Rectangulo r = new Figuras.Rectangulo(lado1, lado2);
                JOptionPane.showMessageDialog(null,r.toString(),"Rectángulo",JOptionPane.ERROR_MESSAGE);
                break;
            }//Cierre de Case 1
           //Case 2: "Cuadrado"
            case 2:{
                int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el Valor de los Lados del Cuadrado: "));
                int lado2 = 0;
                Figuras.Cuadrado c = new Figuras.Cuadrado(lado1, lado2);
                JOptionPane.showMessageDialog(null,c.toString(),"Cuadrado",JOptionPane.WARNING_MESSAGE);
                break;
            }//Cierre de Case 2
            //Case 3: "Triangulo Equilátero"
            case 3:{
                int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el Valor de los Lados del Triángulo Equilátero: "));
                int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la Altura del Triángulo: "));
                Figuras.TrianguloEq tE = new Figuras.TrianguloEq(lado1, lado2);
                JOptionPane.showMessageDialog(null,tE.toString(),"Triángulo Equilátero",JOptionPane.QUESTION_MESSAGE);
                break;
            }//Cierre de Case 3
            default:{//Valor por Defecto:
                break;//Quiebre
            }//Cierre del Default
        }//Cierre del Switch
    }//Cierre del Método
}//Cierre de la Clase