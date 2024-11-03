public class GestaoMotoristas {
    private List<Motorista> motoristas;

    public GestaoMotoristas() {
        motoristas = new ArrayList<>();
    }

    public void cadastrarMotorista(String nome, String id, String CNH, String nivelExperiencia) {
        Motorista motorista = new Motorista(nome, id, CNH, nivelExperiencia);
        motoristas.add(motorista);
        System.out.println("\u001B[32mMotorista cadastrado com sucesso!\u001B[0m");
    }

    public void listarMotoristas() {
        if (motoristas.isEmpty()) {
            System.out.println("\u001B[31mNenhum motorista cadastrado.\u001B[0m");
        } else {
            System.out.println("Lista de Motoristas:");
            for (Motorista motorista : motoristas) {
                System.out.println("----------------------------");
                System.out.println("Nome: " + motorista.getNome());
                System.out.println("ID: " + motorista.getId());
                System.out.println("CNH: " + motorista.getCNH());
                System.out.println("Nível de Experiência: " + motorista.getNivelExperiencia());
                System.out.println("----------------------------");
            }
        }
    }
}
// public static void main(String[] args) {
//     GestaoMotoristas gestao = new GestaoMotoristas();

//     gestao.cadastrarMotorista("João Silva", "12345", "AB123456", "Intermediário");
//     gestao.cadastrarMotorista("Maria Oliveira", "67890", "CD987654", "Avançado");

//     gestao.listarMotoristas();
// }
// }
