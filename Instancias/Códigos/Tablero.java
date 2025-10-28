public class Tablero {
    String material;
    String color;
    double alto;
    double ancho;

    void mostrar() {
        System.out.println("Mostrando contenido en el tablero...");
    }

    public static void main(String[] args) {
        Tablero tablero1 = new Tablero();
        tablero1.material = "Acrílico";
        tablero1.color = "Blanco";
        tablero1.alto = 1.5;
        tablero1.ancho = 2.0;
        tablero1.mostrar();
    }
}  
