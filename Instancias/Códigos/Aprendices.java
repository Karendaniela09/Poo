public class Aprendices
{
    String color;
    String tipo;
    String marca;
    String tamaño;

    void usar() {
        System.out.println("Llamando con el teléfono...");
    }

    public static void main(String[] args) {
        Telefono telefono1 = new Telefono();
        telefono1.color = "Negro";
        telefono1.tipo = "Celular";
        telefono1.marca = "Samsung";
        telefono1.tamaño = "Mediano";
        telefono1.usar();
    }
}

