package paquete2;

import paquete1.Clase1;

/**
 * Esta clase hereda de la Clase1, se pondrá a prueba el alcance y restricciones
 * de los modificadores de acceso de una clase padre a una clase hija (Uso de
 * super)
 *
 * @author jamsr
 */
public class Clase3 extends Clase1 {

    /**
     * Constructor vacio que hace llamada a los constructores de la Clase1 para
     * crear objetos y haciendo llamada desde super
     */
    public Clase3() {
        super("Jam", "Jam"); // Accede mediante SUPER al constructor PROTECTED (No crea objetos)
        new Clase1(); // Llamada al constructor vacio publico para crear objetos
        // No podemos acceder al constructor protected para crear objetos sólo desde SUPER
        // No podemos acceder al constructor default o package para crear objetos
        // No podemos acceder al constructor private para crear objetos
    }

    /**
     * Metodo para crear objetos y acceder a metodos y atributos de la Clase1 en
     * Clase2
     */
    public void pruebaDesdeClase3() {
        // Creación de pbjeto de Clase1 para acceder a los ATRIBUTOS
        Clase1 c1 = new Clase1();
        System.out.println(c1.atributoPublico);
        System.out.println(atributoProtegido); // Accede al atributo PROTECTED de la Clase1, pero sin hacer referencia por medio del objeto c1.atributoProtegido
        // No podrá acceder al atributo privado
        // No podrá acceder al atributo default o package 

        System.out.println("");

        // Acceso a los Métodos de la Clase1
        System.out.println(c1.metodoPublico());
        System.out.println(metodoProtegido());
        // No podrá acceder al metodo default o package 
        // No podrá acceder al metodo privado
    }

    /**
     * Metodo main para crear objetos de la Clase3 y poner a prueba los
     * modificadores de acceso de la Clase1(Padre) desde la Clase3 (Hija)
     *
     * @param args
     */
    public static void main(String[] args) {
        Clase3 c3 = new Clase3();
        c3.pruebaDesdeClase3();
    }

}
