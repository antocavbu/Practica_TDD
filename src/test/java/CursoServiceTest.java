import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CursoServiceTest {
    @Test
    void testCalcularPromedio() {
        CursoService service = new CursoService();
        int[] notas = {8, 9, 7};
        double esperado = 8.0;
        double resultado = service.calcularPromedio(notas);
        assertEquals(esperado, resultado, 0.01, "El promedio debe ser 8.0");
    }
}
