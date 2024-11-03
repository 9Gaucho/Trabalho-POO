import java.util.ArrayList;
import java.util.List;

public class GestaoEletropostos {
    private List<Eletroposto> eletropostos;

    public GestaoEletropostos() {
        eletropostos = new ArrayList<>();
    }

    public void cadastrarEletroposto(String id, String local, int vagasDisponiveis, double tempoMedioCarga) {
        Eletroposto eletroposto = new Eletroposto(id, local, vagasDisponiveis, tempoMedioCarga);
        eletropostos.add(eletroposto);
        System.out.println("\u001B[32mEletroposto cadastrado com sucesso!\u001B[0m");
    }

    public void listarEletropostos() {
        if (eletropostos.isEmpty()) {
            System.out.println("\u001B[31mNenhum eletroposto cadastrado.\u001B[0m");
        } else {
            System.out.println("Lista de Eletropostos:");
            for (Eletroposto eletroposto : eletropostos) {
                System.out.println("----------------------------");
                System.out.println("ID: " + eletroposto.getId());
                System.out.println("Local: " + eletroposto.getLocal());
                System.out.println("Vagas Disponíveis: " + eletroposto.getVagasDisponiveis());
                System.out.println("Tempo Médio de Carga: " + eletroposto.getTempoMedioCarga() + " horas");
                System.out.println("----------------------------");
            }
        }
    }

//     public static void main(String[] args) {
//         GestaoEletropostos gestao = new GestaoEletropostos();

//         gestao.cadastrarEletroposto("E1", "São Paulo - SP", 5, 1.5);
//         gestao.cadastrarEletroposto("E2", "Rio de Janeiro - RJ", 3, 2.0);
//         gestao.cadastrarEletroposto("E3", "Belo Horizonte - MG", 4, 1.8);

//         gestao.listarEletropostos();
//     }
// }
