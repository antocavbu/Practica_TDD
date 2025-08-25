public class CursoService {
    public boolean verificarCupos(int inscritos, int cupoMaximo) {
        // Sin implementación aún (TDD - Red)
        return false;
    }
    // Método a implementar
    public double calcularPromedio(int[] notas) {
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return (double) suma / notas.length;
    }
}
