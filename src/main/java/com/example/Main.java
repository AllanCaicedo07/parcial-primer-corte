package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║           SISTEMA DE GESTIÓN DE BIBLIOTECA DIGITAL              ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════╝\n");
        Scanner scanner = new Scanner(System.in);

        // ==================== LIBRO 1 ====================
        System.out.println("┌─────────────────────────────────────────────────────────────────┐");
        System.out.println("│ 1. CREACIÓN DE LIBRO 1 (Con parámetros)                         │");
        System.out.println("└─────────────────────────────────────────────────────────────────┘\n");
        
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 2, 2);
        System.out.println("  ► Título: " + libro1.getTitulo());
        System.out.println("  ► Autor: " + libro1.getAutor());
        System.out.println("  ► Ejemplares totales: " + libro1.getNumeroEjemplares());
        System.out.println("  ► Ejemplares prestados: " + libro1.getNumeroEjemplaresPrestados());
        System.out.println("  ► Ejemplares disponibles: " + (libro1.getNumeroEjemplares() - libro1.getNumeroEjemplaresPrestados()));

        // ==================== LIBRO 2 ====================
        System.out.println("\n┌─────────────────────────────────────────────────────────────────┐");
        System.out.println("│ 2. CREACIÓN DE LIBRO 2 (Entrada por consola)                   │");
        System.out.println("└─────────────────────────────────────────────────────────────────┘\n");
        
        Libro libro2 = new Libro();
        
        System.out.print("  ► Ingrese el título del libro: ");
        String titulo = scanner.nextLine();
        libro2.setTitulo(titulo);
        
        System.out.print("  ► Ingrese el autor del libro: ");
        String autor = scanner.nextLine();
        libro2.setAutor(autor);
        
        System.out.print("  ► Ingrese el número de ejemplares: ");
        int numeroEjemplares = scanner.nextInt();
        libro2.setNumeroEjemplares(numeroEjemplares);
        
        System.out.print("  ► Ingrese el número de ejemplares prestados: ");
        int numeroEjemplaresPrestados = scanner.nextInt();
        libro2.setNumeroEjemplaresPrestados(numeroEjemplaresPrestados);
        
        System.out.println("\n  ✓ Libro 2 registrado correctamente:");
        System.out.println("  ► Título: " + libro2.getTitulo());
        System.out.println("  ► Autor: " + libro2.getAutor());
        System.out.println("  ► Ejemplares totales: " + libro2.getNumeroEjemplares());
        System.out.println("  ► Ejemplares prestados: " + libro2.getNumeroEjemplaresPrestados());
        System.out.println("  ► Ejemplares disponibles: " + (libro2.getNumeroEjemplares() - libro2.getNumeroEjemplaresPrestados()));

        scanner.nextLine(); // Limpiar buffer

        // ==================== LIBRO DE TEXTO ====================
        System.out.println("\n┌─────────────────────────────────────────────────────────────────┐");
        System.out.println("│ 3. CREACIÓN DE LIBRO DE TEXTO UNIAJC                            │");
        System.out.println("└─────────────────────────────────────────────────────────────────┘\n");
        
        LibroTextoUNIAJC libroTexto1 = new LibroTextoUNIAJC(
                "Matemáticas Discretas",
                "Rosen",
                2,
            2,
                "Matemáticas Discretas",
                "Ingeniería de Sistemas");
        
        System.out.println("  ✓ Libro de texto creado:");
        System.out.println("  ► Título: " + libroTexto1.getTitulo());
        System.out.println("  ► Autor: " + libroTexto1.getAutor());
        System.out.println("  ► Ejemplares totales: " + libroTexto1.getNumeroEjemplares());
        System.out.println("  ► Ejemplares prestados: " + libroTexto1.getNumeroEjemplaresPrestados());
        System.out.println("  ► Ejemplares disponibles: " + (libroTexto1.getNumeroEjemplares() - libroTexto1.getNumeroEjemplaresPrestados()));
        System.out.println("  ► Curso: " + libroTexto1.getCurso());
        System.out.println("  ► Facultad: " + libroTexto1.getFacultad());

        // ==================== NOVELA ====================
        System.out.println("\n┌─────────────────────────────────────────────────────────────────┐");
        System.out.println("│ 4. CREACIÓN DE NOVELA                                          │");
        System.out.println("└─────────────────────────────────────────────────────────────────┘\n");
        
        Novela novela1 = new Novela(
                "Cien años de soledad",
                "Gabriel García Márquez",
                2,
                2,
                Novela.TipoNovela.ROMANCE);
        
        System.out.println("  ✓ Novela creada:");
        System.out.println("  ► Título: " + novela1.getTitulo());
        System.out.println("  ► Autor: " + novela1.getAutor());
        System.out.println("  ► Ejemplares totales: " + novela1.getNumeroEjemplares());
        System.out.println("  ► Ejemplares prestados: " + novela1.getNumeroEjemplaresPrestados());
        System.out.println("  ► Ejemplares disponibles: " + (novela1.getNumeroEjemplares() - novela1.getNumeroEjemplaresPrestados()));
        System.out.println("  ► Tipo de novela: " + novela1.getTipo());

        // ==================== PRUEBA DE PRÉSTAMO Y DEVOLUCIÓN ====================
        System.out.println("\n┌─────────────────────────────────────────────────────────────────┐");
        System.out.println("│ 5. PRUEBA DE MÉTODOS: PRÉSTAMO Y DEVOLUCIÓN                    │");
        System.out.println("└─────────────────────────────────────────────────────────────────┘\n");

        // Prueba con Libro 1
        System.out.println("  📚 LIBRO 1: El Quijote");
        System.out.println("  ─────────────────────────────────────");
        System.out.println("  Estado inicial: " + libro1);
        
        boolean resultado = libro1.prestamo();
        System.out.println("  Resultado préstamo: " + (resultado ? "✓ ÉXITO" : "✗ FALLO"));
        System.out.println("  Estado después de préstamo: " + libro1);
        
        resultado = libro1.devolucion();
        System.out.println("  Resultado devolución: " + (resultado ? "✓ ÉXITO" : "✗ FALLO"));
        System.out.println("  Estado final: " + libro1);

        // Prueba con Novela
        System.out.println("\n  📚 NOVELA 1: Cien años de soledad");
        System.out.println("  ─────────────────────────────────────");
        System.out.println("  Estado inicial: " + novela1);
        
        System.out.println("\n  Prestando todos los ejemplares disponibles...");
        for (int i = 0; i < 8; i++) {
            novela1.prestamo();
        }
        System.out.println("  Estado después de préstamos: " + novela1);
        
        resultado = novela1.prestamo();
        System.out.println("  Intento de préstamo adicional: " + (resultado ? "✓ ÉXITO" : "✗ FALLO"));
        
        resultado = novela1.devolucion();
        System.out.println("  Resultado devolución: " + (resultado ? "✓ ÉXITO" : "✗ FALLO"));
        System.out.println("  Estado final: " + novela1);

        // ==================== FIN DEL PROGRAMA ====================
        scanner.close();
        
        System.out.println("\n╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║                    FIN DEL PROGRAMA                            ║");
        System.out.println("╚════════════════════════════════════════════════════════════════╝\n");
    }
}
