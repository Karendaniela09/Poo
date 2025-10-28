public class Extintor {
    // Atributos
String tipo;
String ubicacion;
boolean cargado;
String fechaRevision;

// Constructor
public Extintor(String tipo, String ubicacion, boolean cargado, String fechaRevision) {
    this.tipo = tipo;
    this.ubicacion = ubicacion;
    this.cargado = cargado;
    this.fechaRevision = fechaRevision;
}

// Método para usar el extintor
public void usar() {
    if (cargado) {
        System.out.println("Usando el extintor tipo " + tipo + " en la ubicación " + ubicacion + ".");
        cargado = false;
    } else {
        System.out.println("El extintor está descargado y necesita recarga.");
    }
}

// Método para recargar el extintor
public void recargar() {
    cargado = true;
    System.out.println("El extintor ha sido recargado.");
}

// Mostrar información
public void mostrarInfo() {
    System.out.println("Extintor tipo " + tipo + " | Ubicación: " + ubicacion + " | Cargado: " + cargado + " | Última revisión: " + fechaRevision);
}

// Main para ejecutar
public static void main(String[] args) {
    Extintor extintor1 = new Extintor("CO2", "Pasillo principal", true, "Marzo 2025");
    extintor1.mostrarInfo();
    extintor1.usar();
    extintor1.mostrarInfo();
    extintor1.recargar();
    extintor1.mostrarInfo();
}
}
