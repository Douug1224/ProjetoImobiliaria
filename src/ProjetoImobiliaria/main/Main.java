package ProjetoImobiliaria.main;

import ProjetoImobiliaria.model.Casa;
import ProjetoImobiliaria.model.Apartamento;
import ProjetoImobiliaria.model.Cliente;
import ProjetoImobiliaria.model.Vendedor;

public class Main {
    public static void main(String[] args) {
        Casa casa1 = new Casa("Rua Leao coroado, 171", 750837.0, 7);
        Apartamento ap1 = new Apartamento("Avenida Mariana Amalia, 882", 502000.0, 2);
        Cliente cliente1 = new Cliente("Ricardo", "129.356.784-34");
        Vendedor vendedor1 = new Vendedor("Bob", "087.694.321-50", 4750.0);

        System.out.println(casa1.exibirDetalhes());
        System.out.println(ap1.exibirDetalhes());
        cliente1.exibirInformacoes();
        vendedor1.exibirInformacoes();
    }
}
