/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaprogra1;
/**
 *
 * @author Andrés J. Jiménez Leandro
 * @date 2016-06-02 Jueves
 */
public class Figuras extends Object {
 //VARIABLES GENERALES DE LA CLASE:
    private int ladoA; //Variable de tipo entero llamada "ladoA"
    private int ladoB; //Variable de tipo entero llamada "ladoB"
    private String resultado; //Variable de tipo cadena de caracteres (String) llamada "resultado"
 //CONSTRUCTOR VACÍO:
    public Figuras(){}
 //CONSTRUCTOR LLENO:
    public Figuras(int ladoA, int ladoB, String resultado) { //Son las variables del constructor; NO SON LAS DE LA CLASE
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.resultado = resultado;
    } //Fin del Constructor
 //CONSTRUCTOR AJUSTADO PARA EL USUARIO:
        public Figuras(int ladoA, int ladoB) { 
        this.ladoA = ladoA;
        this.ladoB = ladoB;        
    }
 //SET's & GET's:
    /**
     * Método SET para variable "ladoA"
     * @param ladoA
     */
    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }
    /**
     * Método SET para variable "ladoB"
     * @param ladoB
     */
    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }
    /**
     * Método SET para variable "resultado"
     * @param resultado
     */
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    /**
     * Método GET para variable "ladoA"
     * @return int ladoA
     */
    public int getLadoA() {
        return ladoA;
    }
    /**
     * Método GET para variable "ladoB"
     * @return int ladoB
     */
    public int getLadoB() {
        return ladoB;
    }
    /**
     * Método GET para variable "resultado"
     * @return String resultado
     */
    public String getResultado() {
        return resultado;
    }   
    //Métodos ESPECÍFICOS:

    /**
     * Método que calcula el perímetro de un Cuadrado
     * @param ladoA
     * @return int perimetroCuadrado
     **/
        public int perimetroCuadrado(int ladoA){ //Indico variable a recibir
        int perimetroCuadrado = 0; //Defino la variable a usar
        perimetroCuadrado = ladoA*4; //Ejecuto el método
        return perimetroCuadrado; //Devuelvo la variable llena
    }
    /**
     * Método que calcula el perímetro de un Rectángulo
     * @param ladoA
     * @param ladoB
     * @return int perimetroRectangulo
     **/
    public int perimetroRectangulo(int ladoA, int ladoB){ //Indico variables a recibir
        int perimetroRectangulo = ((ladoA*2)+(ladoB*2)); //Defino la variable a usar y las ejecuto       
        return perimetroRectangulo; //Devuelvo la variable llena
    }
     /**
     * Método que calcula el perímetro de un Triángulo Equilátero
     * @param ladoA
     * @return int perimetroTriangulo
     **/
    public int perimetroTriangulo(int ladoA){ //Indico variable a recibir        
        return ladoA*3;
    }
    //toString:
    @Override
    public String toString() {
        return ("˂html˃˂font color=#FFFF00˃Perimetro del Cuadrado: " + this.perimetroCuadrado(ladoA)
                + "\n˂html˃˂font color=#FFFF00˃Perimetro del Rectángulo: " + this.perimetroRectangulo(ladoA, ladoB)
                + "\n˂html˃˂font color=#FFFF00˃Perímetro del Triángulo Equilátero: " + this.perimetroTriangulo(ladoA));
    }    
}