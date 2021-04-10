package pooflix.dominio;
import java.util.ArrayList;
import java.util.List;

public class Pooflix {
    private int capacidad = 15;
    private ArrayList<Material> Material;

    public ArrayList<Material> getMaterial() {
        return Material;
    }

    public boolean agregar(Material m, int codigo) {
        if (capacidad <= 0) {
            if (m.getCodigo() = codigo)
                return false;
            else {
                return false;
            }
        } else {
            Material.add(m);
            capacidad = (byte) (capacidad - 1);
            return true;
        }
    }

    public boolean retirar(String nombre) {
        int productoRetirado = 0;
        for (int i = 0; i <= 15; i++) {
            if (Material.get(i).getNombre().equals(nombre)) {
                productoRetirado = Material.get(i).getCantidad() - 1;
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
    public Material buscar(String nombre){
        for (int j = 1; j <= 15; j++){
            if (Material.get(j).getNombre().equals(nombre)){
                return getMaterial().get(j);
            }
            else{
                return null;
            }
        }
        return null;
    }
    public Material buscar(int codigo)
    {
        for (int k = 1; k <= 15; k++) {
            if (Material.get(k).getCodigo() == codigo) {
                return getMaterial().get(k);

            } else {
                return null;
            }
        }
        return null;
    }
    public List<Material> buscarPorTipo (String tipo){
        ArrayList<Material> material1 = new ArrayList<>();
        for (int l = 1; l <= 38; l++){
            if (Material.get(l).getTipo().equals(tipo)){
                return Material;
            }
            else{
                return Material1;
            }
        }
        return Material;
    }
    public int calcularDuracionTotal(){
        int sumaCantidad = 0, sumaTiempo = 0, multiplicacion;
        for (int i = 1; i <= 15; i++){
            sumaCantidad = Material.get(i).getcantidad() + sumaCantidad;
            sumaTiempo = Material.get(i).getTiempo() + sumaTiempo;
        }
        multiplicacion = sumaCantidad * sumaTiempo;
        return multiplicacion;
    }
}
}