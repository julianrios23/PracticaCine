package julian.rios.zpracticacine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Julian Rios
 */
public class ZPracticaCine {//FALTA DESARROLLO

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pelicula> peliculas = new ArrayList<>();

        boolean crearPelicula = true;
        while (crearPelicula) {
            System.out.print("Ingrese el título de la película: ");
            String titulo = scanner.nextLine();

            System.out.print("Ingrese el director de la película: ");
            String director = scanner.nextLine();

            System.out.print("Ingrese la duración de la película en horas: ");
            double duracion = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer

            Pelicula pelicula = new Pelicula(titulo, director, duracion);
            peliculas.add(pelicula);

            System.out.print("¿Desea crear otra película? (s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                crearPelicula = false;
            }
        }

        System.out.println("\n----- Lista de películas -----");
        for (Pelicula pelicula : peliculas) {
            System.out.println("Título: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duración: " + pelicula.getDuracion() + " horas");
            System.out.println("-----------------------------");
        }

        System.out.println("\n----- Películas con duración mayor a 1 hora -----");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println("Título: " + pelicula.getTitulo());
                System.out.println("Director: " + pelicula.getDirector());
                System.out.println("Duración: " + pelicula.getDuracion() + " horas");
                System.out.println("-----------------------------");
            }
        }

        System.out.println("\n----- Películas ordenadas por duración (de mayor a menor) -----");
        Collections.sort(peliculas, Comparator.comparingDouble(Pelicula::getDuracion).reversed());
        for (Pelicula pelicula : peliculas) {
            System.out.println("Título: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duración: " + pelicula.getDuracion() + " horas");
            System.out.println("-----------------------------");
        }

        System.out.println("\n----- Películas ordenadas por duración (de menor a mayor) -----");
        Collections.sort(peliculas, Comparator.comparingDouble(Pelicula::getDuracion));
        for (Pelicula pelicula : peliculas) {
            System.out.println("Título: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duración: " + pelicula.getDuracion() + " horas");
            System.out.println("-----------------------------");
        }

        System.out.println("\n----- Películas ordenadas por título (alfabéticamente) -----");
        Collections.sort(peliculas, Comparator.comparing(Pelicula::getTitulo));
        for (Pelicula pelicula : peliculas) {
            System.out.println("Título: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duración: " + pelicula.getDuracion() + " horas");
            System.out.println("-----------------------------");
        }

        System.out.println("\n----- Películas ordenadas por director (alfabéticamente) -----");
        Collections.sort(peliculas, Comparator.comparing(Pelicula::getDirector));
        for (Pelicula pelicula : peliculas) {
            System.out.println("Título: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duración: " + pelicula.getDuracion() + " horas");
            System.out.println("-----------------------------");
        }

    }
}
/*
En este programa, se utiliza un bucle while para permitir que el usuario cree varios objetos Pelicula y los
agregue a una lista. Luego, se realizan las diferentes acciones solicitadas, como mostrar todas las películas,
mostrar las películas con una duración mayor a 1 hora y ordenar las películas según diferentes criterios 
utilizando el Comparator.
*/
/*
Lista de peliculas: 
a) Tiempos Violentos - Quentin Tarantino - 1,56
b) El padrino - Francis Ford Coppola - 3,00
c) Naranja mecanica - SDtanley Kubrick - 1,50
d) La lista de Schindler - Steven Spielberg - 1,45
e) Buenos muchachos - Martin Scorsece - 2,05

*/