package ProjetoImobiliaria.model;

public abstract class Contrato {
    protected Cliente cliente;
    protected Imovel imovel;
    protected double valor;

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract void gerarContrato();
}
