public class Lapicero {
    String tamaño;
    String color;

    void escribir() {
        System.out.println("Escribiendo con el lapicero...");
    }

    public static void main(String[] args) {
        Lapicero lapicero1 = new Lapicero();
        lapicero1.tamaño = "Mediano";
        lapicero1.color = "Azul";
        lapicero1.escribir();
    }
}

