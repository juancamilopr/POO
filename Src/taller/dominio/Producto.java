package taller.dominio;

public class Producto {
    private short codigo;
    public String nombre;
    private int precio;
    private int cantidad;

    public Producto(String nombre, short codigp, int precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = 0;
    }

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public Producto(int precio) {
        this.precio = precio;
    }



    public Producto(short codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public short getCodigo() {
        return codigo;
    }

    public void setCodigo(short codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
