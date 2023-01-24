/*
El siguiente requerimiento es para una lista de productos List<Producto>, de 3 a 5 elementos, se pide calcular el importe (precio por cantidad) y sumarlos.
La clase Producto debe tener el atributo precio del tipo double y cantidad int, entonces utilizando stream convertir la lista de productos en el gran total del tipo double.
 */

package org.francodevs.apistreampracticas.listaproductos;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Producto> facturas = Arrays.asList(new Producto(10, 1), new Producto(25, 1), new Producto(12, 2));

        double sum = facturas.stream()
                .mapToDouble(x -> x.getCantidad() * x.getPrecio())
                .sum();

        System.out.println(sum);

    }

}
