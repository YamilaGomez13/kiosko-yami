
package entidades;

public class Bebidas {
    private String nombre;
    private double litros;
    private double precio;
    private int stock;
    private int pedidoAlproveedor;

    public Bebidas(String nombre, double litros, double precio, int stock, int pedidoAlproveedor) {
        this.nombre = nombre;
        this.litros = litros;
        this.precio = precio;
        this.stock = stock;
        this.pedidoAlproveedor = pedidoAlproveedor;
    }
    
    void pedidoAlProveedor(int parametroPedidoAlproveedor) {
        System.out.println("Cantidad a pedir: " + parametroPedidoAlproveedor);
        this.pedidoAlproveedor = parametroPedidoAlproveedor;
    }

    public Bebidas(String nombre, double litros, int stock, int pedidoAlproveedor) {
        this.nombre = nombre;
        this.litros = litros;
        this.stock = stock;
        this.pedidoAlproveedor = pedidoAlproveedor;
    }

    @Override
    public String toString() {
        return "Bebidas{" + "nombre=" + nombre + ", litros=" + litros + ", precio=" + precio + ", stock=" + stock + ", pedidoAlproveedor=" + pedidoAlproveedor + '}';
    }


   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

  
    void pedidoAlProveedor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void consultarElPedido() {
        System.out.println("El pedido del producto " + nombre + " es: " + pedidoAlproveedor );
        
    }
    
    
    
        
}
