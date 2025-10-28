public class GelDesinfectante {
    String color;
    String tamaño;
    int cantidad; // en mililitros

    void desinfectar() {
        System.out.println("Desinfectando manos...");
    }

    public static void main(String[] args) {
        GelDesinfectante gel = new GelDesinfectante();
        gel.color = "Transparente";
        gel.tamaño = "Pequeño";
        gel.cantidad = 100;
        gel.desinfectar();
    }
}

