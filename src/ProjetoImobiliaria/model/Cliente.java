package ProjetoImobiliaria.model;

public class Cliente extends Pessoa {
    public Cliente(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Cliente: " + getNome() + ", CPF: " + getCpf());
    }
}
