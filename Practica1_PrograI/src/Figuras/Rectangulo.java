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
public class Rectangulo extends FiguraPadre {
    //Constructor de Herencia:
    public Rectangulo(int lado1, int lado2) {
        super(lado1, lado2);
    }
    /**
     * Método para calcular el Perímetro de un Rectángulo
     * @return (lado1*2)+(lado2*2);
     */
    public int perimetroRect(){
        return ((this.lado1*2)+(this.lado2*2));
    }
    /**
     * Método para calcular el Área de un Rectángulo
     * @return lado1*lado2;
     */
    public int areaRect(){
        return ((this.lado1)*(this.lado2));
    }
    /**
     * toString de la clase Rectángulo()
     * @return Resultados de los Métodos Perímetro y Área;
     */
    @Override
    public String toString() {
        return ("Perímetro del Rectángulo: " + this.perimetroRect() 
                + "\n Área del Rectángulo: " + this.areaRect());
    }   
}//Fin de la Clase