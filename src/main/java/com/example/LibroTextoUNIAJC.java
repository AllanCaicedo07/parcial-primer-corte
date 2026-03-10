package com.example;

public class LibroTextoUNIAJC extends LibroTexto {
    // Atributos
    private String facultad;

    // Constructor
    public LibroTextoUNIAJC() {
        super(); // Llama al constructor de la clase padre
        this.facultad = "";
    }

    // Constructor con parámetros
    public LibroTextoUNIAJC(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados,
            String curso, String facultad) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados, curso); // Llama al constructor de la clase
                                                                                  // padre
        this.facultad = facultad;
    }

    // Getters y Setters
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
}
