import java.time.LocalDateTime;

public class LecturaSensor {
    private String tipo;
    double valor;
    String id;
    LocalDateTime timestamp;
    public LecturaSensor(String id, double valor, String tipo, LocalDateTime timestamp) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "LecturaSensor{" +
                "tipo='" + tipo + '\'' +
                ", valor=" + valor +
                ", id='" + id + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getId() {
        return id;
    }
}
