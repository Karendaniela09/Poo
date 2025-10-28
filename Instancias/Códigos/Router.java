public class Router {
// Atributos
String marca;
String modelo;
boolean encendido;
int dispositivosConectados;

// Constructor
public Router(String marca, String modelo, boolean encendido, int dispositivosConectados) {
    this.marca = marca;
    this.modelo = modelo;
    this.encendido = encendido;
    this.dispositivosConectados = dispositivosConectados;
}

// Método para encender el router
public void encender() {
    encendido = true;
    System.out.println("El router " + marca + " modelo " + modelo + " está encendido.");
}

// Método para conectar un nuevo dispositivo
public void conectarDispositivo() {
    if (encendido) {
        dispositivosConectados++;
        System.out.println("Se ha conectado un nuevo dispositivo. Total conectados: " + dispositivosConectados);
    } else {
        System.out.println("El router está apagado, no se puede conectar ningún dispositivo.");
    }
}

// Método para apagar el router
public void apagar() {
    encendido = false;
    System.out.println("El router se ha apagado.");
}

// Mostrar información
public void mostrarInfo() {
    System.out.println("Router " + marca + " modelo " + modelo + " | Encendido: " + encendido + " | Dispositivos: " + dispositivosConectados);
}

// Main para ejecutar
public static void main(String[] args) {
    Router router1 = new Router("TP-Link", "AX1800", false, 0);
    router1.mostrarInfo();
    router1.encender();
    router1.conectarDispositivo();
    router1.conectarDispositivo();
    router1.mostrarInfo();
    router1.apagar();
}


}

