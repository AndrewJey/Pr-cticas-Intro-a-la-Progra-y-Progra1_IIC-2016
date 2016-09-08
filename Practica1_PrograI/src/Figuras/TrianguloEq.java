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
public class TrianguloEq extends FiguraPadre {
    //Constructor de Herencia:
    public TrianguloEq(int lado1, int lado2) {
        super(lado1, lado2);
    }
     /**
     * Método para calcular el Perímetro de un Triángulo Equilátero
     * @return (lado1*3);
     */
    public int perimetroTri(){
        return (this.lado1*3);
    }
     /**
     * Método para calcular el Área de un Triángulo Equilátero
     * @return ((lado1*lado2)/2);
     */
    public int areaTri(){
        return (((this.lado1)*(this.lado2))/2);
    }
    /**
     * toString de la clase TrianguloEq()
     * @return Resultados de los Métodos Perímetro y Área;
     */
    @Override
    public String toString() {
        return ("Perímetro del Triángulo Equilátero: " + this.perimetroTri() 
                + "\n Área del Triángulo Equilátero: " + this.areaTri());
    }
}//Fin de Clase