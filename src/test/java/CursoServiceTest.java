import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
}
