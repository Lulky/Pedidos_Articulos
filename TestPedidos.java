import java.util.ArrayList;
public class TestPedidos {
    public static void main(String[] args) {

        // Pedido pedido1 = new Pedido();
        
        // pedido1.nombre = "Luciano";
        // pedido1.total = 2;
        // pedido1.listo = true;
        
        

        // System.out.printf("Nombre: %s\n", pedido1.nombre);
        // System.out.printf("Total: %s\n", pedido1.total);
        // System.out.printf("Listo: %s\n", pedido1.listo);
        
        Articulo articulo1 = new Articulo();
        articulo1.nombre = "moka";
        articulo1.precio = 5;
        
        Articulo articulo2 = new Articulo();
        articulo2.nombre = "latte";
        articulo2.precio = 3;
        
        Articulo articulo3 = new Articulo();
        articulo3.nombre = "cafe de goteo";
        articulo3.precio = 4;
        
        Articulo articulo4 = new Articulo();
        articulo4.nombre = "capuchino";
        articulo4.precio = 6;

        Pedido pedido1 = new Pedido();
        
        pedido1.nombre = "Cindhuri";
        System.out.println(pedido1.total);
        
        Pedido pedido2 = new Pedido();
        pedido2.nombre = "Jimmy";
        
        Pedido pedido3 = new Pedido();
        pedido3.nombre = "Noah";
        
        Pedido pedido4 = new Pedido();
        pedido4.nombre = "Sam";
        
        
        pedido2.items.add(articulo1);
        pedido2.total += articulo1.precio;

        pedido3.items.add(articulo4);
        pedido3.total += articulo4.precio;

        pedido4.items.add(articulo2);
        pedido4.total += articulo2.precio;

        pedido1.listo = true;

        pedido4.items.add(articulo2);
        pedido4.items.add(articulo2);
        pedido4.total += articulo2.precio *2;

        pedido2.listo = true;

        //Imprimiendo todo

        System.out.printf("Nombre: %s\n", pedido1.nombre);
        System.out.printf("Total: %s\n", pedido1.total);
        System.out.printf("Listo: %s\n", pedido1.listo);
        
        System.out.printf("Nombre: %s\n", pedido2.nombre);
        System.out.printf("Total: %s\n", pedido2.total);
        System.out.printf("Listo: %s\n", pedido2.listo);
        
        System.out.printf("Nombre: %s\n", pedido3.nombre);
        System.out.printf("Total: %s\n", pedido3.total);
        System.out.printf("Listo: %s\n", pedido3.listo);
        
        System.out.printf("Nombre: %s\n", pedido4.nombre);
        System.out.printf("Total: %s\n", pedido4.total);
        System.out.printf("Listo: %s\n", pedido4.listo);

        
    }
}
