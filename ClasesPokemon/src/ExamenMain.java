public class ExamenMain {

    public static void main(String[] args) {
        Entrenador ash = new Entrenador("Ash Ketchum", 8);
        
        Pikachu p1 = new Pikachu("Pikachu", 100, 500);
        Charizard p2 = new Charizard("Charizard", 150, true);

        System.out.println("Entrenador: " + ash.getNombre());
        System.out.println("--- Batalla ---");

        p1.mostrarInfo();
        p1.gritar();
        p1.atacar();

        System.out.println("---------------");

        p2.mostrarInfo();
        p2.gritar();
        p2.atacar();
    }
}