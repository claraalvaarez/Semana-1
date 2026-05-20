import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Ejercicio1 solucion = new Ejercicio1();


        List<LecturaSensor> lecturas = Arrays.asList(
                new LecturaSensor("S1", 25.5, "temperatura", LocalDateTime.now().minusHours(2)),
                new LecturaSensor("S2", 30.0, "temperatura", LocalDateTime.now().minusHours(25)), // Fuera de 24h
                new LecturaSensor("S3", 60.5, "humedad", LocalDateTime.now().minusHours(5)),
                new LecturaSensor("S4", 22.0, "temperatura", LocalDateTime.now().minusHours(10)),
                new LecturaSensor("S5", 80.0, "presion", LocalDateTime.now().minusDays(2)) // Fuera de 24h
        );

        System.out.println("--- Listado de Lecturas ---");
        lecturas.forEach(System.out::println);


        System.out.println("\n--- Filtrando por tipo 'temperatura' ---");
        List<LecturaSensor> temperaturas = solucion.filtrarPorTipo(lecturas, "temperatura");
        temperaturas.forEach(System.out::println);


        System.out.println("\n--- Promedio de valores (últimas 24h) ---");
        double promedio = solucion.promedioUltimas24Horas(lecturas);
        System.out.printf("El promedio es: %.2f\n", promedio);


        System.out.println("\n--- Lectura con valor máximo ---");
        Optional<LecturaSensor> maximo = solucion.encontrarMaximo(lecturas);
        maximo.ifPresent(l -> System.out.println("Máximo encontrado: " + l));
    }
}