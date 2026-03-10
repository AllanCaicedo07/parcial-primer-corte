package com.example;

public class Novela {
    // Atributos
    private String genero;
    
    // Constructor
    public Novela() {
        super(); // Llama al constructor de la clase padre
        this.genero = "";
    }

    // Constructor con parámetros
    public Novela(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados, String genero) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados); // Llama al constructor de la clase padre
        this.genero = genero;
    }

    // Getters y Setters
    public String getGenero() {return genero;}
    public void setGenero(String genero) {this.genero = genero;}
}
