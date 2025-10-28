public class Cargador {
// Atributos
int voltaje;
String estado;
String marca;

// Constructor
public Cargador(int voltaje, String estado, String marca) {
    this.voltaje = voltaje;
    this.estado = estado;
    this.marca = marca;
}

// Método para conectar el cargador
public void conectar() {
    System.out.println("El cargador " + marca + " está conectado y listo para cargar.");
}

// Método para simular carga
public void cargar() {
    System.out.println("El dispositivo se está cargando...");
}

// Método para mostrar información
public void mostrarInfo() {
    System.out.println("Cargador " + marca + " de " + voltaje + "V, estado: " + estado);
}

// Método main para ejecutar
public static void main(String[] args) {
    Cargador cargador1 = new Cargador(65, "Operativo", "HP");
    cargador1.mostrarInfo();
    cargador1.conectar();
    cargador1.cargar();
}

}

