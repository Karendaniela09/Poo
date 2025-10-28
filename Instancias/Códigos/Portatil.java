public class Portatil {
// Atributos
String marca;
String procesador;
int memoriaRAM;
boolean encendido;

// Constructor
public Portatil(String marca, String procesador, int memoriaRAM, boolean encendido) {
    this.marca = marca;
    this.procesador = procesador;
    this.memoriaRAM = memoriaRAM;
    this.encendido = encendido;
}

// Método para encender
public void encender() {
    encendido = true;
    System.out.println("El portátil " + marca + " se ha encendido.");
}

// Método para apagar
public void apagar() {
    encendido = false;
    System.out.println("El portátil " + marca + " se ha apagado.");
}

// Mostrar información
public void mostrarInfo() {
    System.out.println("Portátil " + marca + " con procesador " + procesador + " y " + memoriaRAM + "GB de RAM. Encendido: " + encendido);
}

// Main para ejecutar
public static void main(String[] args) {
    Portatil portatil1 = new Portatil("Dell", "Intel Core i7", 16, false);
    portatil1.mostrarInfo();
    portatil1.encender();
    portatil1.apagar();
}

}

