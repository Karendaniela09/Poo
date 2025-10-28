public class Escoba {
    // Atributos
String tipo;
String material;
boolean limpia;
String color;

// Constructor
public Escoba(String tipo, String material, boolean limpia, String color) {
    this.tipo = tipo;
    this.material = material;
    this.limpia = limpia;
    this.color = color;
}

// Método para barrer
public void barrer() {
    if (limpia) {
        System.out.println("La escoba de tipo " + tipo + " está barriendo el piso.");
        limpia = false;
    } else {
        System.out.println("La escoba está sucia, debe limpiarse antes de usarla nuevamente.");
    }
}

// Método para limpiar la escoba
public void limpiar() {
    limpia = true;
    System.out.println("La escoba ha sido limpiada y está lista para usar.");
}

// Método para mostrar información
public void mostrarInfo() {
    System.out.println("Escoba tipo " + tipo + " | Material: " + material + " | Color: " + color + " | Limpia: " + limpia);
}

// Main para ejecutar
public static void main(String[] args) {
    Escoba escoba1 = new Escoba("De cerdas suaves", "Plástico", true, "Azul");
    escoba1.mostrarInfo();
    escoba1.barrer();
    escoba1.mostrarInfo();
    escoba1.limpiar();
    escoba1.mostrarInfo();
}
}
