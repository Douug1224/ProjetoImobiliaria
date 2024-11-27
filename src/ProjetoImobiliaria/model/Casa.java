package ProjetoImobiliaria.model;

public class Casa extends Imovel {
    private int numQuartos;

    public Casa(String endereco, double valor, int numQuartos) {
        super(endereco, valor);
        this.numQuartos = numQuartos;
    }

    @Override
    public void calcularValor() {

    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + ", Número de Quartos: " + numQuartos;
    }
}
