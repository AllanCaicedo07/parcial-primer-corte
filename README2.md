# Sistema de Gestión de Biblioteca

## Situaciones donde NO se podría realizar la herencia

### Situación 1 — Clase `final`

Si la clase `Libro` se declara como `final`, ninguna clase puede heredar de ella.

```java
// FALLA: modificador final impide la herencia
public final class Libro {
    private String titulo;
    // ...
}

// Error de compilación:
public class LibroTexto extends Libro { }
// ❌ Cannot inherit from final 'com.biblioteca.Libro'
```

**¿Por qué falla?** El modificador `final` le indica al compilador que `Libro` es el último eslabón de su jerarquía. Intentar extenderla genera un error en tiempo de compilación. Java usa este mecanismo intencionalmente en clases como `String` o `Integer`.

---

### Situación 2 — Constructor `private`

Si el único constructor de `Libro` es `private`, las subclases no pueden invocar `super(...)` y la cadena de inicialización se rompe.

```java
// FALLA: constructor privado bloquea la llamada a super()
public class Libro {
    private Libro(String titulo, String autor, int numEj, int numPrest) {
        // ...
    }
    // No existe constructor público ni protegido
}

public class LibroTexto extends Libro {
    public LibroTexto(String titulo, String autor, int numEj, int numPrest, String curso) {
        super(titulo, autor, numEj, numPrest);
        // Libro(String,String,int,int) has private access in Libro
    }
}
```

**¿Por qué falla?** Java exige que el constructor de la superclase sea `public` o `protected` para que las subclases puedan inicializarla correctamente. Un constructor `private` hace que la herencia sea técnicamente imposible.

---

## Dos nuevos atributos y un método adicional

### Atributo 1 — `annoPublicacion: int`

Registra el año en que fue publicado el libro.

```java
private int annoPublicacion;

public int getAnnoPublicacion() { return annoPublicacion; }
public void setAnnoPublicacion(int anno) { this.annoPublicacion = anno; }
```

**¿Por qué tiene sentido?** Permite filtrar material desactualizado, ordenar el catálogo cronológicamente y aplicar políticas de reposición cuando un libro supera cierta antigüedad.

---

### Atributo 2 — `isbn: String`

Almacena el código ISBN (International Standard Book Number) único del libro.

```java
private String isbn;

public String getIsbn() { return isbn; }
public void setIsbn(String isbn) { this.isbn = isbn; }
```

**¿Por qué tiene sentido?** El ISBN es el estándar internacional de identificación de libros. Facilita búsquedas exactas, evita registros duplicados en el catálogo y permite integración con sistemas externos de bibliotecas.

---

### Método adicional — `renovar(): boolean`

Permite extender un préstamo activo sin necesidad de devolver el libro y volver a prestarlo.

```java
/**
 * Renueva el préstamo activo del libro.
 * Solo es posible si hay al menos un ejemplar prestado.
 *
 * @return true si la renovación se realizó con éxito,
 *         false si no hay préstamos activos que renovar.
 */
public boolean renovar() {
    if (numeroEjemplaresPrestados > 0) {
        // En un sistema completo se registraría una nueva
        // fecha de devolución asociada al préstamo del usuario.
        return true;
    }
    return false;
}
```

**¿Por qué tiene sentido?** En una biblioteca real los lectores frecuentemente necesitan más tiempo con un libro. El método `renovar()` modela ese flujo sin alterar el conteo de ejemplares disponibles, complementando a `prestamo()` y `devolucion()` de forma coherente con el dominio.
