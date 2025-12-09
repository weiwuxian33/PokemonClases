public class Charizard extends Pokemon {
    private boolean vuela;

    public Charizard(String nombre, int vida, boolean vuela) {
        super(nombre, vida);
        this.vuela = vuela;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " lanza Llamarada");
    }

    @Override
    public void gritar() {
        System.out.println("Grrrraaaawr");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Pokemon: " + getNombre() + " | Vida: " + getVida() + " | Vuela: " + vuela);
    }
}