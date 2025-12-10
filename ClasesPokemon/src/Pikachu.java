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
        System.err.println(getNombre() + " usa Impactrueno");
    }

    @Override
    public void gritar() {
        System.out.println("Pika Pika");
    }

    @Override
    public void mostrarInfo(int nivel, String entrenador) {
        super.mostrarInfo(nivel, entrenador);
        System.out.println("Tipo: Electrico | Voltios: " + electricidad);
    }
}