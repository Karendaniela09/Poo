public class Loker {
    // Atributos
String color;
String tamano;
int capacidad;
boolean abierto;
boolean lleno;

// Constructor
public Loker(String color, String tamano, int capacidad, boolean abierto, boolean lleno) {
    this.color = color;
    this.tamano = tamano;
    this.capacidad = capacidad;
    this.abierto = abierto;
    this.lleno = lleno;
}

// Método para guardar objetos
public void guardar() {
    if (!lleno) {
        lleno = true;
        System.out.println("Has guardado objetos en el loker.");
    } else {
        System.out.println("El loker ya está lleno.");
    }
}

// Método para abrir/cerrar
public void abrirCerrar() {
    abierto = !abierto;
    System.out.println("El loker ahora está " + (abierto ? "abierto." : "cerrado."));
}

// Método para mostrar información
public void mostrarInfo() {
    System.out.println("Color: " + color + " | Tamaño: " + tamano + " | Capacidad: " + capacidad + " | Abierto: " + abierto + " | Lleno: " + lleno);
}

// Método principal para ejecutar
public static void main(String[] args) {
    Loker loker1 = new Loker("Gris", "Grande", 10, false, false);
    loker1.mostrarInfo();
    loker1.abrirCerrar();
    loker1.guardar();
    loker1.guardar();
}
}
