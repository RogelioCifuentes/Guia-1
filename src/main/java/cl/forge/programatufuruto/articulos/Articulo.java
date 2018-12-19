package cl.forge.programatufuruto.articulos;

public class Articulo {

    private int id;
    private String nombre;
    private int precio;
    private int stock;

    public Articulo() {
        this.id = 0;
        this.nombre = "";
        this.precio = 0;
        this.stock = 0;
    }

    public Articulo(int id, String nombre, int precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int idTipo) {
        this.id = idTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
