package com.example;

public class LibroTexto extends Libro {
    // Atributos
    private String curso;

    // Constructor
    public LibroTexto() {
        super(); // Llama al constructor de la clase padre
        this.curso = "";
    }

    // Constructor con parámetros
    public LibroTexto(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados, String curso) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados); // Llama al constructor de la clase padre
        this.curso = curso;
    }

    // Getters y Setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
