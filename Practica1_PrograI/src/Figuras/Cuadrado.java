/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Paquetes:
package Figuras;
/**
 **
 ** @author Andrés J. Jiménez Leandro
 ** @date 2016-07-21 Jueves  
 **/
public class Cuadrado extends FiguraPadre {
    //Constructor de Herencia:
    public Cuadrado(int lado1, int lado2) {
        super(lado1, lado2);
    }
    /**
     * Método para calcular el Perímetro de un Cuadrado
     * @return (lado1*4);
     */
    public int perimetroCuad(){
        return (this.lado1*4);
    }
    /**
     * Método para calcular el Área de un Cuadrado
     * @return (lado1*lado1);
     */
    public int areaCuad(){
        return ((this.lado1)*(this.lado1));
    }    
    /**
     * toString de la clase Cuadrado()
     * @return Resultados de los Métodos Perímetro y Área;
     */
    @Override
    public String toString() {
        return ("Perímetro del Cuadrado: " + this.perimetroCuad() 
                + "\n Área del Cuadrado: " + this.areaCuad());
    }
}//Fin de la Clase