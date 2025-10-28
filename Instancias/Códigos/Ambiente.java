public class Ambiente {
    // Atributos
    String nombre;
    String ubicacion;
    int capacidad;
    boolean ocupado;

    // Constructor
    public Ambiente(String nombre, String ubicacion, int capacidad, boolean ocupado) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.ocupado = ocupado;
    }

    // Método
    public void mostrarInfo() {
        System.out.println("Ambiente: " + nombre + ", ubicado en " + ubicacion + ", capacidad: " + capacidad + ", ocupado: " + ocupado);
    }

    // Main para crear la instancia
    public static void main(String[] args) {
        Ambiente ambiente1 = new Ambiente("Sala de informática", "Bloque A", 30, true);
        ambiente1.mostrarInfo();
    }
}
