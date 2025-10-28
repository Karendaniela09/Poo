public class Instructor {
    // Atributos
String nombre;
String especialidad;
boolean disponible;

// Constructor
public Instructor(String nombre, String especialidad, boolean disponible) {
    this.nombre = nombre;
    this.especialidad = especialidad;
    this.disponible = disponible;
}

// Método para enseñar
public void ensenar() {
    if (disponible) {
        System.out.println("El instructor " + nombre + " está enseñando " + especialidad + ".");
    } else {
        System.out.println("El instructor " + nombre + " no está disponible en este momento.");
    }
}

// Método para cambiar disponibilidad
public void cambiarDisponibilidad(boolean estado) {
    this.disponible = estado;
    System.out.println("El instructor " + nombre + " ahora está " + (disponible ? "disponible" : "ocupado") + ".");
}

// Método para mostrar información
public void mostrarInfo() {
    System.out.println("Instructor: " + nombre + " | Especialidad: " + especialidad + " | Disponible: " + disponible);
}

// Main para ejecutar
public static void main(String[] args) {
    Instructor instructor1 = new Instructor("Carlos Pérez", "Programación", true);
    instructor1.mostrarInfo();
    instructor1.ensenar();
    instructor1.cambiarDisponibilidad(false);
    instructor1.ensenar();
}
}
