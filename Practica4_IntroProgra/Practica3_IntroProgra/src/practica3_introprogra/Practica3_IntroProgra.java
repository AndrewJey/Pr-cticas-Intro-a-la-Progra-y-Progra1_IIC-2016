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
 *
 * @author Andrés J. Jiménez Leandro
 * @date 2016-o8-o3 Miércoles
 **/
public class Practica3_IntroProgra {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variables:              
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite un número")); //Solicitud de Datos
        int y = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número")); //Solicitud de Datos
        //If...Else:
        if (x > y) {
            JOptionPane.showMessageDialog(null, "El número: " + x + ", es MAYOR que el número: " + y, "MAYOR QUÉ", JOptionPane.WARNING_MESSAGE);
        } else if (x < y) {
            JOptionPane.showMessageDialog(null, "El número: " + x + ", es MENOR que el número: " + y, "MENOR QUÉ", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El número: " + x + ", es IGUAL que el número: " + y, "IGUAL QUÉ", JOptionPane.QUESTION_MESSAGE);
        }
        //-------------------------------------------o0o-------------------------------------------------------//
        //Cálculo de Años Bisiestos:
        int anno = Integer.parseInt(JOptionPane.showInputDialog("Digite un año"));
        //Sabemos que el 2016 es año Bisiesto y que el año bisiesto sucede cada 4 años:
        int annoBase = 2016;
        //Condicional:
        if (annoBase > anno) {
            //Ciclo For:
            for (int i = 0; anno <= annoBase - 1; i++) {
                annoBase = annoBase - 4;
                if (annoBase < anno) {
                    JOptionPane.showMessageDialog(null, "El año: " + anno + ", NO es Bisiesto");
                } else if (annoBase == anno) {
                    JOptionPane.showMessageDialog(null, "El año: " + anno + ", es Bisiesto");
                }
            }
        } else if (annoBase < anno) {
            //Ciclo For:
            for (int i = 0; annoBase <= anno - 1; i++) {
                annoBase = annoBase + 4;
                if (annoBase > anno) {
                    JOptionPane.showMessageDialog(null, "El año: " + anno + ", NO es Bisiesto");
                } else if (annoBase == anno) {
                    JOptionPane.showMessageDialog(null, "El año: " + anno + ", es Bisiesto");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "El año: " + anno + ", es Bisiesto");
        }
    }
}