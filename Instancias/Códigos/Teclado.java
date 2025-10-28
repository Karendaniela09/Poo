public class Teclado {
// Atributos
String tipo;
String idioma;
String estado;

// Constructor
public Teclado(String tipo, String idioma, String estado) {
    this.tipo = tipo;
    this.idioma = idioma;
    this.estado = estado;
}

// Método
public void escribir() {
    System.out.println("El teclado está escribiendo texto...");
}

// Método para mostrar información
public void mostrarInfo() {
    System.out.println("Teclado tipo " + tipo + ", idioma: " + idioma + ", estado: " + estado);
}

// Método main para ejecutar
public static void main(String[] args) {
    Teclado teclado1 = new Teclado("Mecánico", "Español", "Funcional");
    teclado1.mostrarInfo();
    teclado1.escribir();
}

}
