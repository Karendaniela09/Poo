public class Regla {
    // Atributos
double longitud;
String material;
String color;
boolean flexible;

// Constructor
public Regla(double longitud, String material, String color, boolean flexible) {
    this.longitud = longitud;
    this.material = material;
    this.color = color;
    this.flexible = flexible;
}

// Método para medir algo
public void medir(String objeto) {
    System.out.println("Midiendo " + objeto + " con una regla de " + longitud + " cm.");
}

// Método para mostrar información
public void mostrarInfo() {
    System.out.println("Longitud: " + longitud + "cm | Material: " + material + " | Color: " + color + " | Flexible: " + flexible);
}

// Método principal para ejecutar
public static void main(String[] args) {
    Regla regla1 = new Regla(30, "Plástico", "Transparente", true);
    regla1.mostrarInfo();
    regla1.medir("cuaderno");
}
}
