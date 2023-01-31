/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package collectionsej6;

import Servicio.ServicioProducto;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class CollectionsEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioProducto sp = new ServicioProducto();

        HashMap<String, Double> productos = new HashMap();
        int opcion = 0;
        do {
            System.out.println("MENU");
            System.out.println("1 - Añadir producto al registro");
            System.out.println("2 - Modificar precio de un producto");
            System.out.println("3 - Eliminar producto");
            System.out.println("4 - Mostrar productos");
            System.out.println("5 - Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    sp.añadirProducto(productos);
                    break;
                case 2:
                    sp.modificarPrecio(productos);
                    break;
                case 3:
                    sp.eliminarProducto(productos);
                    break;
                case 4:
                    sp.mostrarProductos(productos);
                    break;
                case 5:
                    System.out.println("Hasta pronto.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 5);

    }

}
