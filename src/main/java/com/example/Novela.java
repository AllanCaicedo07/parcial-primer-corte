package com.example;

public class Novela extends Libro {
    // Atributos
    public enum TipoNovela {
        ROMANCE,
        SUSPENSO,
        TERROR,
        CIENCIA_FICCION,
        FANTASIA
    }

    private TipoNovela tipo;

    // Constructor
    public Novela() {
        super(); // Llama al constructor de la clase padre
        this.tipo = TipoNovela.ROMANCE;
    }

    // Constructor con parámetros
    public Novela(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados, TipoNovela tipo) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados); // Llama al constructor de la clase padre
        this.tipo = tipo;
    }

    // Getters y Setters
    public TipoNovela getTipo() {
        return tipo;
    }

    public void setTipo(TipoNovela tipo) {
        this.tipo = tipo;
    }
}
