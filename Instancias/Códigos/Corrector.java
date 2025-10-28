public class Corrector {
    String color;
    String marca;

    void borrar() {
        System.out.println("Corrigiendo errores en el texto...");
    }

    public static void main(String[] args) {
        Corrector corrector1 = new Corrector();
        corrector1.color = "Blanco";
        corrector1.marca = "Pelikan";
        corrector1.borrar();
    }
}

