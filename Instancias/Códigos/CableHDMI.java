public class CableHDMI {
// Atributos
String marca;
double longitud; // en metros
String estado;
boolean conectado;

// Constructor
public CableHDMI(String marca, double longitud, String estado, boolean conectado) {
    this.marca = marca;
    this.longitud = longitud;
    this.estado = estado;
    this.conectado = conectado;
}

// Método para conectar el cable
public void conectar() {
    conectado = true;
    System.out.println("El cable HDMI " + marca + " está conectado.");
}

// Método para desconectar el cable
public void desconectar() {
    conectado = false;
    System.out.println("El cable HDMI " + marca + " ha sido desconectado.");
}

// Método para mostrar información
public void mostrarInfo() {
    System.out.println("Cable HDMI " + marca + " | Longitud: " + longitud + "m | Estado: " + estado + " | Conectado: " + conectado);
}

// Main para ejecutar
public static void main(String[] args) {
    CableHDMI cable1 = new CableHDMI("Belkin", 1.5, "Nuevo", false);
    cable1.mostrarInfo();
    cable1.conectar();
    cable1.mostrarInfo();
    cable1.desconectar();
}

}
