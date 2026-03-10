package com.example;

public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroEjemplaresPrestados;

    // Constructor con parametros vacios
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numeroEjemplares = 0;
        this.numeroEjemplaresPrestados = 0;
    }

    // Constructor con parametros
    public Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getNumeroEjemplaresPrestados() {
        return numeroEjemplaresPrestados;
    }

    public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) {
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    // Métodos

    public boolean prestamo() {
        if (numeroEjemplaresPrestados < numeroEjemplares) {
            numeroEjemplaresPrestados++;
            System.out.println("Libro prestado: " + titulo);
            return true;
        } else {
            System.out.println("No hay ejemplares disponibles para prestar.");
            return false;
        }
    }

    public boolean devolucion() {
        if (numeroEjemplaresPrestados > 0) {
            numeroEjemplaresPrestados--;
            System.out.println("Libro devuelto: " + titulo);
            return true;
        } else {
            System.out.println("No hay ejemplares prestados para devolver.");
            return false;
        }
    }

   @Override
    public String toString() {

        int ejemplaresDisponibles = numeroEjemplares - numeroEjemplaresPrestados;
        return "\n    ┌────────────────────────────────────────────┐" +
               "\n    │ 📖 " + String.format("%-40s", titulo) + "│" +
               "\n    │ ✍️  Autor: " + String.format("%-36s", autor) + "│" +
               "\n    │ 📚 Total: " + String.format("%-38d", numeroEjemplares) + "│" +
               "\n    │ 📤 Prestados: " + String.format("%-34d", numeroEjemplaresPrestados) + "│" +
               "\n    │ 📥 Disponibles: " + String.format("%-32d", ejemplaresDisponibles) + "│" +
               "\n    └────────────────────────────────────────────┘\n";
    }
      return super.toString();
    }
}
