import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CursoServiceTest {
    @Test
    void testVerificarCupos() {
        CursoService service = new CursoService();
        int cupoMaximo = 30;
        int inscritos = 28;
        assertTrue(service.verificarCupos(inscritos, cupoMaximo), "Debe haber cupos disponibles");
        inscritos = 30;
        assertFalse(service.verificarCupos(inscritos, cupoMaximo), "No debe haber cupos disponibles");
    }
    @Test
    void testCalcularPromedio() {
        CursoService service = new CursoService();
        int[] notas = {8, 9, 7};
        double esperado = 8.0;
        double resultado = service.calcularPromedio(notas);
        assertEquals(esperado, resultado, 0.01, "El promedio debe ser 8.0");
    }

    @Test
    void testCalcularPromedioSinEstudiantes() {
        CursoService service = new CursoService();
        int[] notas = {};
        assertThrows(IllegalArgumentException.class, () -> service.calcularPromedio(notas),
                "Debe lanzar IllegalArgumentException si no hay estudiantes");
    }

    @Test
    void testCalcularPromedioConNulo() {
        CursoService service = new CursoService();
        assertThrows(IllegalArgumentException.class, () -> service.calcularPromedio(null),
                "Debe lanzar IllegalArgumentException si el arreglo es nulo");
    }
}
