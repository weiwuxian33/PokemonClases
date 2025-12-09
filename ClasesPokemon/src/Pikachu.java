public class Pikachu extends Pokemon {
    private int electricidad;

    public Pikachu(String nombre, int vida, int electricidad) {
        super(nombre, vida);
        this.electricidad = electricidad;
    }

    public int getElectricidad() {
        return electricidad;
    }

    public void setElectricidad(int electricidad) {
        this.electricidad = electricidad;
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " usa Impactrueno");
    }

    @Override
    public void gritar() {
        System.out.println("Pika Pika");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Pokemon: " + getNombre() + " | Vida: " + getVida() + " | Voltios: " + electricidad);
    }
}