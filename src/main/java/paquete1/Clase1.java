package paquete1;

/**
 * Clase que define atributos, constructores y metodos con cada modificador de
 * acceso
 *
 * @author jamsr
 */
public class Clase1 {

    // Definicion de atributos
    public String atributoPublico = "Valor atributo publico";
    protected String atributoProtegido = "Valor atributo protegido";
    String atributoDefault = "Valor atributo default";
    private String atributoPrivado = "Valor atributo privado";

    // Definicion de constructores
    public Clase1() {
        System.out.println("Constructor Publico Vacío");
    }

    protected Clase1(String texto1, String texto2) {
        System.out.println("Constructor Protected con 2 args = " + texto1 + " " + texto2);
    }

    Clase1(int numero) {
        System.out.println("Constructor Default o Package");
    }

    private Clase1(int numero, String nombre) {
        System.out.println("Constructor Privado");
    }

    // Definicion de metodos
    public String metodoPublico() {
        return "Metodo Publico";
    }

    protected String metodoProtegido() {
        return "Metodo Protected";
    }

    String metodoDefault() {
        return "Metodo Default";
    }

    private String metodoPrivado() {
        return "Metodo Privado";
    }
}
