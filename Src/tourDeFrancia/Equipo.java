package tourDeFrancia;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Equipo {
    private String nombreDeEquipo;
    private byte cantidadDeCorredores;
    public ArrayList<Corredor> corredor;

    public void setCantidadDeCorredores(byte cantidadDeCorredores) {
        this.cantidadDeCorredores = cantidadDeCorredores;
    }

    public void setNombreDeEquipo(String nombreDeEquipo) {
        this.nombreDeEquipo = nombreDeEquipo;
    }

    public Equipo(String nombreDelEquipo, byte cantidadDeCorredores) {
        this.nombreDeEquipo = nombreDeEquipo;
        this.cantidadDeCorredores = cantidadDeCorredores;
        this.corredor = new ArrayList<Corredor>();
    }

    public String getNombreDeEquipo() {
        return nombreDeEquipo;
    }

    public byte getCantidadDeCorredores() {
        return cantidadDeCorredores;
    }
}
