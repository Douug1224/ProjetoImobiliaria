package ProjetoImobiliaria.model;

public class ContratoVenda extends Contrato {
    private int parcelas;

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    @Override
    public void gerarContrato() {
        System.out.println("Contrato de Venda Gerado:");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Imóvel: " + imovel.exibirDetalhes());
        System.out.println("Valor: " + valor);
        System.out.println("Parcelas: " + parcelas);
    }
}
