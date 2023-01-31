/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class ServicioProducto {

    Scanner leer = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);

    public void añadirProducto(HashMap<String, Double> p) {
        String opcion;
        do {
            System.out.println("Ingrese el nombre del producto");
            String nombre = leer.next();
            System.out.println("Ingrese el precio del producto");
            Double precio = leer2.nextDouble();

            p.put(nombre, precio);

            System.out.println("Desea añadir otro producto?S/N");
            opcion = leer.next();

        } while (opcion.equalsIgnoreCase("S"));
    }

    public void modificarPrecio(HashMap<String, Double> productos) {
        System.out.println("Ingrese el nombre del producto a modificar el precio");
        String nombre = leer.next();
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Ingrese el nuevo precio del producto");
            productos.put(nombre, leer.nextDouble());
        } else {
            System.out.println("El producto ingresado no se encuentra en el registro.");
        }

    }

    public void eliminarProducto(HashMap<String, Double> productos) {
        System.out.println("Ingrese el nombre del producto que desea eliminar del registro");
        String nombre = leer.next();
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
        } else {
            System.out.println("El producto ingresado no se encuentra en el registro.");
        }
    }

    public void mostrarProductos(HashMap<String, Double> productos) {
        productos.entrySet().forEach((entry) -> {
            System.out.println("Producto: " + entry.getKey() + ". Precio: " + entry.getValue() + ". ");
        });
    }
}
