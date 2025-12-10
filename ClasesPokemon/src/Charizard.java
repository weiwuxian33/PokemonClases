public class Charizard extends Pokemon {
    private String vuela;

    public Charizard(String nombre, int vida, String vuela) {
        super(nombre, vida);
        this.vuela = vuela;
    }

    public String getVuela() {
        return vuela;
    }

    public void setVuela(String vuela) {
        this.vuela = vuela;
    }

    @Override
    public void atacar() {
        System.err.println(getNombre() + " lanza Llamarada");
    }

    @Override
    public void gritar() {
        System.out.println(" Raaaaaawwwrr ");
    }

    @Override
    public void mostrarInfo(int nivel, String entrenador) {
        super.mostrarInfo(nivel, entrenador);
        System.out.println("Tipo: Fuego ; Altura de vuelo: " + vuela);
    }
}