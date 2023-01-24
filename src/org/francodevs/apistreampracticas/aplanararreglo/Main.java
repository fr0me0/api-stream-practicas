/*
El siguiente ejercicio es aplanar un arreglo bidimensional en un nivel y eliminar repetidos usando el api stream.
Aplanar un arreglo significa quitar los elementos del arreglo anidado y dejarlos en el arreglo de primer nivel.
String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};
 */

package org.francodevs.apistreampracticas.aplanararreglo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};

        Arrays.stream(lenguajes)
                .flatMap(arr -> Arrays.stream(arr))
                .distinct()
                .forEach(System.out::println);

        System.out.println("---- Mediante Lambda ----");

        Function<String[][], List<String>> flatten = arr -> Arrays.stream(arr)
                .flatMap(Arrays::stream) // a -> Arrays.stream(a)
                .distinct()
                .collect(Collectors.toList());

        flatten.apply(lenguajes).forEach(System.out::println);

    }

}
