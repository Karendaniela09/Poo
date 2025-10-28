public class Mouse {
// Atributos
String tipo;
String estado;
String marca;
String color;

// Constructor
public Mouse(String tipo, String estado, String marca, String color) {
    this.tipo = tipo;
    this.estado = estado;
    this.marca = marca;
    this.color = color;
}

// Método
public void mover() {
    System.out.println("El mouse está moviéndose sobre la superficie.");
}

// Método para mostrar información
public void mostrarInfo() {
    System.out.println("Mouse " + marca + " de tipo " + tipo + ", color " + color + ", estado: " + estado);
}

// Método main para ejecutar
public static void main(String[] args) {
    Mouse mouse1 = new Mouse("Inalámbrico", "Nuevo", "Logitech", "Negro");
    mouse1.mostrarInfo();
    mouse1.mover();
}

}

