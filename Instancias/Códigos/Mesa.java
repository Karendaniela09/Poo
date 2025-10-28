public class Mesa {
    String material;
    String estado;

    void usar() {
        System.out.println("La mesa se está usando.");
    }

    void mostrar() {
        System.out.println("Material: " + material + ", Estado: " + estado);
    }

    public static void main(String[] args) {
        Mesa mesa1 = new Mesa();
        mesa1.material = "Madera";
        mesa1.estado = "Excelente";
        mesa1.usar();
        mesa1.mostrar();
    }
}

