# Proyecto CursoService - TDD con Java y JUnit

Este proyecto demuestra el ciclo TDD (Red-Green-Refactor) en Java usando Maven y JUnit 5.

## Funcionalidades principales
- `calcularPromedio(int[] notas)`: Calcula el promedio de notas de un curso. Lanza excepción si el arreglo es nulo o vacío.
- `verificarCupos(int inscritos, int cupoMaximo)`: Indica si hay cupos disponibles en el curso.

## Pruebas
- Pruebas unitarias para ambas funcionalidades.
- Casos límite: manejo de arreglos vacíos y nulos en `calcularPromedio()`.

## Ejecución
1. Instala Java 8+ y Maven.
2. Ejecuta los tests:
   ```
   mvn test
   ```

## Organización
- Código fuente: `src/main/java/CursoService.java`
- Pruebas: `src/test/java/CursoServiceTest.java`

---
Desarrollado siguiendo buenas prácticas de TDD.
