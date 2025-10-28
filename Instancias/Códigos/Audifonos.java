public class Audifonos {
    // Atributos
String tipo;
String estado;
String color;
String tamano;

// Constructor
public Audifonos(String tipo, String estado, String color, String tamano) {
    this.tipo = tipo;
    this.estado = estado;
    this.color = color;
    this.tamano = tamano;
}

// Método para escuchar música
public void escuchar() {
    if (estado.equalsIgnoreCase("activo")) {
        System.out.println("Los audífonos están reproduciendo música.");
    } else {
        System.out.println("Los audífonos están apagados o dañados.");
    }
}

// Método para mostrar información
public void mostrarInfo() {
    System.out.println("Audífonos tipo " + tipo + " | Estado: " + estado + " | Color: " + color + " | Tamaño: " + tamano);
}

// Main para ejecutar
public static void main(String[] args) {
    Audifonos audifonos1 = new Audifonos("Bluetooth", "Activo", "Negro", "Mediano");
    audifonos1.mostrarInfo();
    audifonos1.escuchar();
}
}
