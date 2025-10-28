public class Impresora {
// Atributos
String marca;
String tipo;
boolean encendida;
int nivelTinta;

// Constructor
public Impresora(String marca, String tipo, boolean encendida, int nivelTinta) {
    this.marca = marca;
    this.tipo = tipo;
    this.encendida = encendida;
    this.nivelTinta = nivelTinta;
}

// Método para encender la impresora
public void encender() {
    encendida = true;
    System.out.println("La impresora " + marca + " está encendida.");
}

// Método para imprimir
public void imprimir(String documento) {
    if (encendida && nivelTinta > 0) {
        System.out.println("Imprimiendo documento: " + documento);
        nivelTinta -= 10;
    } else {
        System.out.println("No se puede imprimir. La impresora está apagada o sin tinta.");
    }
}

// Método para mostrar información
public void mostrarInfo() {
    System.out.println("Impresora " + marca + " tipo " + tipo + ", nivel de tinta: " + nivelTinta + "%, encendida: " + encendida);
}

// Main para ejecutar
public static void main(String[] args) {
    Impresora impresora1 = new Impresora("HP", "Láser", false, 100);
    impresora1.mostrarInfo();
    impresora1.encender();
    impresora1.imprimir("Documento de prueba");
    impresora1.mostrarInfo();
}

}

