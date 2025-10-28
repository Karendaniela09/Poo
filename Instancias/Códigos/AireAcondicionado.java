public class AireAcondicionado {
// Atributos
String marca;
int temperatura;
boolean encendido;
String modo;

// Constructor
public AireAcondicionado(String marca, int temperatura, boolean encendido, String modo) {
    this.marca = marca;
    this.temperatura = temperatura;
    this.encendido = encendido;
    this.modo = modo;
}

// Método para encender el aire
public void encender() {
    encendido = true;
    System.out.println("El aire acondicionado " + marca + " se ha encendido.");
}

// Método para apagar el aire
public void apagar() {
    encendido = false;
    System.out.println("El aire acondicionado " + marca + " se ha apagado.");
}

// Método para ajustar la temperatura
public void ajustarTemperatura(int nuevaTemp) {
    temperatura = nuevaTemp;
    System.out.println("Temperatura ajustada a " + temperatura + "°C.");
}

// Método para mostrar información
public void mostrarInfo() {
    System.out.println("Aire Acondicionado " + marca + " | Temp: " + temperatura + "°C | Modo: " + modo + " | Encendido: " + encendido);
}

// Main para ejecutar
public static void main(String[] args) {
    AireAcondicionado aire1 = new AireAcondicionado("Samsung", 22, false, "Frío");
    aire1.mostrarInfo();
    aire1.encender();
    aire1.ajustarTemperatura(18);
    aire1.mostrarInfo();
    aire1.apagar();
}

}

