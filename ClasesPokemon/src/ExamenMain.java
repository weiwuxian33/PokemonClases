
public class ExamenMain {

    public static void main(String[] args) {
        Entrenador ash = new Entrenador("Ash Ketchum", 8);

        Pikachu p1 = new Pikachu("Pikachu", 100, 500);
        Charizard p2 = new Charizard("Charizard", 150, "Muy Alto");

        p1.mostrarInfo(5, ash.getNombre());
        p1.gritar();
        p1.atacar();

        System.out.println("-     -      -      -");

        p2.mostrarInfo(36, "Red");
        p2.gritar();
        p2.atacar();
    }
}
