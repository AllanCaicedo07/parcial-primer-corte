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

      @Override
    public String toString() {
        int ejemplaresDisponibles = getNumeroEjemplares() - getNumeroEjemplaresPrestados();
        return "\n    ┌────────────────────────────────────────────┐" +
               "\n    │ 📖 " + String.format("%-40s", getTitulo()) + "│" +
               "\n    │ ✍️  Autor: " + String.format("%-36s", getAutor()) + "│" +
               "\n    │ 📚 Total: " + String.format("%-38d", getNumeroEjemplares()) + "│" +
               "\n    │ 📤 Prestados: " + String.format("%-34d", getNumeroEjemplaresPrestados()) + "│" +
               "\n    │ 📥 Disponibles: " + String.format("%-32d", ejemplaresDisponibles) + "│" +
               "\n    │ 🎓 Curso: " + String.format("%-39s", getCurso()) + "│" +
               "\n    │ 🏛️  Facultad: " + String.format("%-36s", facultad) + "│" +
               "\n    └────────────────────────────────────────────┘\n";
    }
}
