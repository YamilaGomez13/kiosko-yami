
package entidades;

public class programa{

public static void main(String[] args) {

Bebidas articulo1= new Bebidas("coca",0.6,50,36,0);
Bebidas articulo2= new Bebidas("fanta",1.5,70,30,0);
//articulo1.nombre = "coca";
//articulo1.litros = 0.6;
//articulo1.precio = 50;
//articulo1.stock = 36;
   
    System.out.println(articulo1);
    System.out.println(articulo2);
    articulo1.setStock(20);
       
//    PEDIDO A UN PROVEEDOR
    articulo1.pedidoAlProveedor(230);
    articulo1.consultarElPedido();
    articulo2.pedidoAlProveedor(100);
    articulo2.consultarElPedido();
    System.out.println("objeto luego del pedido al proveedor;");
    
    System.out.println(articulo1);
    System.out.println(articulo2);
    
    System.out.println("[ok]");

}
}
