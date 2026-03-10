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
    @Override
    public String toString() {
        int ejemplaresDisponibles = getNumeroEjemplares() - getNumeroEjemplaresPrestados();
        return "\n    ┌────────────────────────────────────────────┐" +
               "\n    │ 📖 " + String.format("%-40s", getTitulo()) + "│" +
               "\n    │ ✍️  Autor: " + String.format("%-36s", getAutor()) + "│" +
               "\n    │ 📚 Total: " + String.format("%-38d", getNumeroEjemplares()) + "│" +
               "\n    │ 📤 Prestados: " + String.format("%-34d", getNumeroEjemplaresPrestados()) + "│" +
               "\n    │ 📥 Disponibles: " + String.format("%-32d", ejemplaresDisponibles) + "│" +
               "\n    │ 🎭 Tipo: " + String.format("%-40s", tipo.toString()) + "│" +
               "\n    └────────────────────────────────────────────┘\n";
    }
}
