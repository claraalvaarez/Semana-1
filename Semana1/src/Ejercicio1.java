import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Ejercicio1 {


    public List<LecturaSensor> filtrarPorTipo(List<LecturaSensor> lecturas, String tipo) {

        return lecturas.stream()
                .filter(l -> l.getTipo() == tipo)
                .collect(Collectors.toList());

    }


    public double promedioUltimas24Horas(List<LecturaSensor> lecturas) {

        return lecturas.stream()
                .filter(l -> l.getTimestamp().isAfter(LocalDateTime.now().minusHours(24)))
                .mapToDouble(l -> l.getValor())
                .average().orElse(0.0);
    }


    public Optional<LecturaSensor> encontrarMaximo(List<LecturaSensor> lecturas) {

        return lecturas.stream()
                .max(Comparator.comparing(LecturaSensor::getValor));

    }
}
