public class Cartuchera {
    String tamaño;
    String color;
    String tipo;
    int capacidad; // número de objetos que puede guardar

    void guardarObjetos() {
        System.out.println("Guardando útiles escolares en la cartuchera...");
    }

    public static void main(String[] args) {
        Cartuchera cartuchera1 = new Cartuchera();
        cartuchera1.tamaño = "Grande";
        cartuchera1.color = "Roja";
        cartuchera1.tipo = "Tela";
        cartuchera1.capacidad = 15;
        cartuchera1.guardarObjetos();
    }
}

