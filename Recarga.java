//talvez tenha que mudar o carro eletrico
import java.time.LocalDateTime;

public class Recarga {
    private LocalDateTime data;
    private String idEletroposto;
    private double energiaRecarregada; 
    public Recarga(LocalDateTime data, String idEletroposto, double energiaRecarregada) {
        this.data = data;
        this.idEletroposto = idEletroposto;
        this.energiaRecarregada = energiaRecarregada;
    }

    public LocalDateTime getData() {
        return data;
    }

    public String getIdEletroposto() {
        return idEletroposto;
    }

    public double getEnergiaRecarregada() {
        return energiaRecarregada;
    }

    @Override
    public String toString() {
        return "Recarga{" +
                "data=" + data +
                ", idEletroposto='" + idEletroposto + '\'' +
                ", energiaRecarregada=" + energiaRecarregada +
                '}';
    }
}
