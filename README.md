# parcial-primer-corte
Parcial de programación del primer corte

## Estructura del Proyecto

```
parcial-primer-corte/
├── .gitignore
├── pom.xml
├── README.md
└── src/
    ├── main/
    │   └── java/
    │       └── com/
    │           └── example/
    │               ├── Libro.java
    │               ├── LibroTexto.java
    │               ├── LibroTextoUNIAJC.java
    │               ├── Main.java
    │               └── Novela.java
    └── test/
        └── java/
```

## Diagrama UML

### Diagrama de Paquetes
```mermaid
graph TD
    A[parcial-primer-corte] --> B[src]
    B --> C[main]
    B --> D[test]
    C --> E[java]
    D --> F[java]
    E --> G[com]
    G --> H[example]
```

### Diagrama de Clases
```mermaid
classDiagram
    class Libro {
        -titulo: String
        -autor: String
        -numeroEjemplares: int
        -numeroEjemplaresPrestados: int
        +Libro()
        +Libro(titulo: String, autor: String, numeroEjemplares: int, numeroEjemplaresPrestados: int)
        +getTitulo(): String
        +setTitulo(titulo: String): void
        +getAutor(): String
        +setAutor(autor: String): void
        +getNumeroEjemplares(): int
        +setNumeroEjemplares(numeroEjemplares: int): void
        +getNumeroEjemplaresPrestados(): int
        +setNumeroEjemplaresPrestados(numeroEjemplaresPrestados: int): void
        +prestamo(): void
        +devolucion(): void
        +toString(): String
    }

    class Novela {
        -genero: String
        +Novela()
        +Novela(titulo: String, autor: String, numeroEjemplares: int, numeroEjemplaresPrestados: int, genero: String)
        +getGenero(): String
        +setGenero(genero: String): void
    }

    class LibroTexto {
        -curso: String
        +LibroTexto()
        +LibroTexto(titulo: String, autor: String, numeroEjemplares: int, numeroEjemplaresPrestados: int, curso: String)
        +getCurso(): String
        +setCurso(curso: String): void
    }

    class LibroTextoUNIAJC {
        -facultad: String
        +LibroTextoUNIAJC()
        +LibroTextoUNIAJC(titulo: String, autor: String, numeroEjemplares: int, numeroEjemplaresPrestados: int, curso: String, facultad: String)
        +getFacultad(): String
        +setFacultad(facultad: String): void
    }

    class Main {
        +main(args: String[]): void
    }

    Libro <|-- Novela
    Libro <|-- LibroTexto
    LibroTexto <|-- LibroTextoUNIAJC
```
