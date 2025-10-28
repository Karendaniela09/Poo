public class Borrador {
    String tamaño;
    String color;
    String tipo;

    void borrar() {
        System.out.println("Borrando el contenido del cuaderno...");
    }

    public static void main(String[] args) {
        Borrador borrador1 = new Borrador();
        borrador1.tamaño = "Pequeño";
        borrador1.color = "Blanco";
        borrador1.tipo = "Goma";
        borrador1.borrar();
    }
}

