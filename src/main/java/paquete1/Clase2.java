package paquete1;

/**
 *
 * @author jamsr
 */
public class Clase2 {

    /**
     * Constructor vacio que hace llamada a los constructores de la Clase 1 para
     * crear objetos
     */
    public Clase2() {

        new Clase1(); // Llama al constructor publico vacío de Clase1 para crear objetos
        new Clase1("uno", "dos"); // Llama al constructor Protected con 2 args de la Clase1 para crear objetos
        new Clase1(1); // Llama al constructor Default o Package para crear objetos
        // No podrá acceder al constructor privado de la Clase1 para crear objetos
    }

    /**
     * Metodo para crear objetos y acceder a metodos y atributos de la Clase1 en
     * Clase2
     */
    public void pruebaDesdeClase2() {
        Clase1 c1 = new Clase1();
        System.out.println(c1.atributoPublico);
        System.out.println(c1.atributoDefault);
        System.out.println(c1.atributoProtegido);
        // No podrá acceder al atributo privado

        System.out.println("");

        System.out.println(c1.metodoDefault());
        System.out.println(c1.metodoProtegido());
        System.out.println(c1.metodoPublico());
        // No podrá acceder al metodo privado
    }

    /**
     * Metodo main para crear objetos de la Clase2 y poner a prueba
     * modificadores de acceso de la Clase1 desde la Clase2
     *
     * @param args
     */
    public static void main(String[] args) {
        Clase2 c2 = new Clase2();
        c2.pruebaDesdeClase2();
    }

}
