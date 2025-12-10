public abstract class Pokemon implements InterAtaque, InterSonido {
    private String nombre;
    private int vida;

    public Pokemon(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void mostrarInfo(int nivel, String entrenador) {
        System.out.println("--- Ficha de " + nombre + " ---");
        System.out.println("Entrenador: " + entrenador + " | Nivel: " + nivel);
        System.out.println("Vida Base: " + vida);
    }
}