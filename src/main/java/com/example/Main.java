package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, aqui se inicia el programa");
        // Objeto numero 1 con parametros
        System.out.println("Se crea el libro1");
        Libro libro1 = new Libro("El Quijote",
                "Miguel de Cervantes",
                5,
                2);
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares: " + libro1.getNumeroEjemplares());
        System.out.println("Ejemplares prestados: " + libro1.getNumeroEjemplaresPrestados());

        // Objeto numero 2 utilizando el contructor por defecto y obtener datos por
        // consola
        System.out.println("Se crea el libro2 utilizando el constructor por defecto");
        Libro libro2 = new Libro();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el titulo del libro:");
        String titulo = scanner.nextLine();
        libro2.setTitulo(titulo);
        System.out.println("Ingrese el autor del libro:");
        String autor = scanner.nextLine();
        libro2.setAutor(autor);
        System.out.println("Ingrese el numero de ejemplares:");
        int numeroEjemplares = scanner.nextInt();
        libro2.setNumeroEjemplares(numeroEjemplares);
        System.out.println("Ingrese el numero de ejemplares prestados:");
        int numeroEjemplaresPrestados = scanner.nextInt();
        libro2.setNumeroEjemplaresPrestados(numeroEjemplaresPrestados);
        System.out.println("Titulo: " + libro2.getTitulo());
        System.out.println("Autor: " + libro2.getAutor());
        System.out.println("Ejemplares: " + libro2.getNumeroEjemplares());
        System.out.println("Ejemplares prestados: " + libro2.getNumeroEjemplaresPrestados());

        // Crear un objeto libroTextoUNIAJC con todos sus atributos
        LibroTextoUNIAJC libroTexto1 = new LibroTextoUNIAJC(
                "Matematicas Discretas",
                "Rosen",
                10,
                3,
                "Matematicas Discretas",
                "Ingenieria de Sistemas");
        System.out.println("Se crea el libroTexto1 con todos sus atributos");
        System.out.println("Titulo: " + libroTexto1.getTitulo());
        System.out.println("Autor: " + libroTexto1.getAutor());
        System.out.println("Ejemplares: " + libroTexto1.getNumeroEjemplares());
        System.out.println("Ejemplares prestados: " + libroTexto1.getNumeroEjemplaresPrestados());
        System.out.println("Curso: " + libroTexto1.getCurso());
        System.out.println("Facultad: " + libroTexto1.getFacultad());

        // Crear un objeto indicando el tipo de novela
        Novela novela1 = new Novela(
                "Cien años de soledad",
                "Gabriel García Márquez",
                7,
                1,
                Novela.TipoNovela.ROMANCE);
        System.out.println("Se crea la novela1 indicando el tipo de novela");
        System.out.println("Tipo de novela: " + novela1.getTipo());

        scanner.close();
    }
}
