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
public class FiguraPadre extends Object {
 //Variables Globales:
 public int lado1;
 public int lado2;
    //Constructor Lleno:
    public FiguraPadre(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    /**
     * Set de Lado1
     * @param lado1;
     */
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
    /**
     * Set de Lado2
     * @param lado2;
     */
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    /**
     * Get de Lado1
     * @return lado1;
     */
    public int getLado1() {
        return lado1;
    }
    /**
     * Get de Lado2
     * @return lado2;
     */
    public int getLado2() {
        return lado2;
    }
    /**
     * toString de la clase FiguraPadre
     * @return lado1 y lado2;
     */
    @Override
    public String toString() {
        return "FiguraPadre(" + "lado1 = " + lado1 + ", lado2 = " + lado2 + ')';
    }
}//Fin de la Clase