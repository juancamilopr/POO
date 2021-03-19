package tourDeFrancia;

public class Corredor {
    private String nombre;
    private int edad;
    private long identificacion;

    public Corredor(String nombreDeCorredor, byte edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
    }
    public String getnombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getidentificacion() {
        return identificacion;
    }
}