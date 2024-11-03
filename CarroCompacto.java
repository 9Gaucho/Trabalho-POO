public class CarroCompacto extends CarroEletrico{
    public CarroCompacto(String id, String marca, String modelo, int anoFabrica, double Bateria){
        super(id, marca, modelo, anoFabrica, Bateria, 120);
    }

    public double tempoCarga(){
        return 7.0;
    }
    
}
