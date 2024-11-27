package ProjetoImobiliaria.model;

public class Apartamento extends Imovel {
    private int andar;

    public Apartamento(String endereco, double valor, int andar) {
        super(endereco, valor);
        this.andar = andar;
    }

    @Override
    public void calcularValor() {

    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + ", Andar: " + andar;
    }
}
