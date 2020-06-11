package paquete2;

import paquete1.Clase1;

/**
 *
 * @author jamsr
 */
public class Clase4 {

    public Clase4() {
        new Clase1(); // Llamada al constructor vacio publico para crear objetos
        // No podemos acceder al constructor protected para crear objetos
        // No podemos acceder al constructor default o package para crear objetos
        // No podemos acceder al constructor private para crear objetos
    }

    public void pruebaDesdeClase4() {
        // Creación de pbjeto de Clase1 para acceder a los ATRIBUTOS
        Clase1 c1 = new Clase1();
        System.out.println(c1.atributoPublico); // Accede al atributo publico de la Clase1
        // No podrá acceder al atributo protected
        // No podrá acceder al atributo privado
        // No podrá acceder al atributo default o package 

        System.out.println("");

        // Acceso a los Métodos de la Clase1
        System.out.println(c1.metodoPublico());
        // No podrá acceder al metodo protected
        // No podrá acceder al metodo default o package 
        // No podrá acceder al metodo privado
    }

    public static void main(String[] args) {
        Clase4 c4 = new Clase4();
        c4.pruebaDesdeClase4();
    }

}
