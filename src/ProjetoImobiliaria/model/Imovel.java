package ProjetoImobiliaria.model;

import ProjetoImobiliaria.interfac.ImovelInterface;

public class Imovel implements ImovelInterface {
    private String endereco;
    private double valor;

    public Imovel(String endereco, double valor) {
        this.endereco = endereco;
        this.valor = valor;
    }

    @Override
    public void calcularValor() {

    }

    @Override
    public String exibirDetalhes() {
        return "Endereço: " + endereco + ", Valor: " + valor;
    }
}
