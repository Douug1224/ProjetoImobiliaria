package ProjetoImobiliaria;

import br.com.imobiliaria.model.Casa;
import br.com.imobiliaria.model.Cliente;
import br.com.imobiliaria.model.Vendedor;

public class Main {
    public static void main(String[] args) {
        Casa casa1 = new Casa("Rua ABC, 123", 500000.0, 3);
        Cliente cliente1 = new Cliente("Alice", "123.456.789-00");
        Vendedor vendedor1 = new Vendedor("Bob", "987.654.321-00", 5000.0);

        casa1.exibirDetalhes();
        cliente1.exibirInformacoes();
        vendedor1.exibirInformacoes();
    }
}
