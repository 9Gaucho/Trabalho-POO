public class Eletroposto {
  protected String id;
  protected String local;
  protected int vagasDisponiveis;
  protected double tempoMedioCarga;


  public Eletroposto(String id, String local, int vagasDisponiveis, double tempoMedioCarga) {
    this.id = id;
    this.local = local;
    this.vagasDisponiveis = vagasDisponiveis;
    this.tempoMedioCarga = tempoMedioCarga;
  }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public void setVagasDisponiveis(int vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public double getTempoMedioCarga() {
        return tempoMedioCarga;
    }

    public void setTempoMedioCarga(double tempoMedioCarga) {
        this.tempoMedioCarga = tempoMedioCarga;
    }

}