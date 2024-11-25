
package ArrayProductos;


public class Productos {
    private String nombre;
    private double precio;
    private Integer cantidad;
    private Integer numero;

    public Productos(String nombre, double precio, Integer cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    public void mostrarProductos(){
        System.out.println(" Nombre: " + nombre + " Precio "+ precio);
    }
    
   
}
