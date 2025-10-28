public class Televisor {
    // Atributos
String marca;
int pulgadas;
boolean encendido;
int volumen;

// Constructor
public Televisor(String marca, int pulgadas, boolean encendido, int volumen) {
    this.marca = marca;
    this.pulgadas = pulgadas;
    this.encendido = encendido;
    this.volumen = volumen;
}

// Método para encender el televisor
public void encender() {
    encendido = true;
    System.out.println("El televisor " + marca + " está encendido.");
}

// Método para apagar el televisor
public void apagar() {
    encendido = false;
    System.out.println("El televisor " + marca + " se ha apagado.");
}

// Método para subir el volumen
public void subirVolumen() {
    if (encendido) {
        volumen += 5;
        System.out.println("Volumen aumentado a " + volumen);
    } else {
        System.out.println("No se puede subir el volumen. El televisor está apagado.");
    }
}

// Mostrar información
public void mostrarInfo() {
    System.out.println("Televisor " + marca + " de " + pulgadas + " pulgadas | Encendido: " + encendido + " | Volumen: " + volumen);
}

// Main para ejecutar
public static void main(String[] args) {
    Televisor tv1 = new Televisor("LG", 55, false, 10);
    tv1.mostrarInfo();
    tv1.encender();
    tv1.subirVolumen();
    tv1.mostrarInfo();
    tv1.apagar();
}
    
}
