public class Puerta {
    // Atributos
String tamano;
double largo;
double ancho;
String color;
boolean abierta;

// Constructor
public Puerta(String tamano, double largo, double ancho, String color, boolean abierta) {
    this.tamano = tamano;
    this.largo = largo;
    this.ancho = ancho;
    this.color = color;
    this.abierta = abierta;
}

// Método para abrir la puerta
public void abrir() {
    if (!abierta) {
        abierta = true;
        System.out.println("La puerta se ha abierto.");
    } else {
        System.out.println("La puerta ya está abierta.");
    }
}

// Método para cerrar la puerta
public void cerrar() {
    if (abierta) {
        abierta = false;
        System.out.println("La puerta se ha cerrado.");
    } else {
        System.out.println("La puerta ya está cerrada.");
    }
}

// Método para mostrar información
public void mostrarInfo() {
    System.out.println("Tamaño: " + tamano + " | Largo: " + largo + "m | Ancho: " + ancho + "m | Color: " + color + " | Abierta: " + abierta);
}

// Método principal para ejecutar
public static void main(String[] args) {
    Puerta puerta1 = new Puerta("Grande", 2.1, 0.9, "Marrón", false);
    puerta1.mostrarInfo();
    puerta1.abrir();
    puerta1.cerrar();
}
}
