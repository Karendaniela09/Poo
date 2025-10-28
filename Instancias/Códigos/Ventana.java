public class Ventana {
    // Atributos
String tamano;
double altura;
double ancho;
String color;
boolean abierta;

// Constructor
public Ventana(String tamano, double altura, double ancho, String color, boolean abierta) {
    this.tamano = tamano;
    this.altura = altura;
    this.ancho = ancho;
    this.color = color;
    this.abierta = abierta;
}

// Método para abrir la ventana
public void abrir() {
    if (!abierta) {
        abierta = true;
        System.out.println("La ventana se ha abierto.");
    } else {
        System.out.println("La ventana ya está abierta.");
    }
}

// Método para cerrar la ventana
public void cerrar() {
    if (abierta) {
        abierta = false;
        System.out.println("La ventana se ha cerrado.");
    } else {
        System.out.println("La ventana ya está cerrada.");
    }
}

// Método para mostrar información
public void mostrarInfo() {
    System.out.println("Tamaño: " + tamano + " | Altura: " + altura + "m | Ancho: " + ancho + "m | Color: " + color + " | Abierta: " + abierta);
}

// Método principal para ejecutar
public static void main(String[] args) {
    Ventana ventana1 = new Ventana("Mediana", 1.2, 0.8, "Blanca", false);
    ventana1.mostrarInfo();
    ventana1.abrir();
    ventana1.cerrar();
}
}
