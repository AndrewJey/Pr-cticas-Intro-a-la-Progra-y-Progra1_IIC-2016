/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaprogra1;
//IMPORTES:
import javax.swing.JOptionPane; //Importe para uso de JOptionPane
import practicaprogra1.Figuras; //Importe clase Figuras
/**
 *
 * @author Andrés J. Jiménez Leandro
 * @date 2016-06-02 Jueves
 **/
public class PracticaProgra1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variables que me da el usuario:
        int ladoA = Integer.parseInt(JOptionPane.showInputDialog("Digite un lado: "));
        int ladoB = Integer.parseInt(JOptionPane.showInputDialog("Digite otro lado: "));; 
        //Intancia de la Clase Figura:
        //INSTANCIA --˃ NombreDeClase NombreQueQuiera = new NombreDeConstructor(VariablesDelConstructor);
        Figuras fg = new Figuras(ladoA, ladoB);        
        //Llamadas a los métodos de la clase, por medio de la instancia:
        fg.perimetroCuadrado(ladoA);
        fg.perimetroRectangulo(ladoA, ladoB);
        fg.perimetroTriangulo(ladoA);
        
        
        //Imprimir:
        JOptionPane.showMessageDialog(null, fg.toString());                
    }
}