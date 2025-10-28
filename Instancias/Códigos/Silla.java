public class Silla {
    String tipo;
    String estado;
    double altura;
    String tamaño;

    void aguantarPeso() {
        System.out.println("La silla puede aguantar peso.");
    }

    public static void main(String[] args) {
        Silla silla1 = new Silla();
        silla1.tipo = "Oficina";
        silla1.estado = "Nueva";
        silla1.altura = 1.2;
        silla1.tamaño = "Mediana";
        silla1.aguantarPeso();
    }
}

