public class CursoService {
    public boolean verificarCupos(int inscritos, int cupoMaximo) {
        return inscritos < cupoMaximo;
    }
    // Método a implementar
    public double calcularPromedio(int[] notas) {
        if (notas == null || notas.length == 0) {
            throw new IllegalArgumentException("El arreglo de notas no puede ser nulo ni vacío");
        }
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return (double) suma / notas.length;
    }
}
