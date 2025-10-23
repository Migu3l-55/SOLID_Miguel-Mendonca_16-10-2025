

public class PagamentoViaBoleto implements Pagamento {
    @Override 
    public void pagar(Pedido pedido) {
        System.out.println("Pagamento via Boleto para "+pedido.getItens());
    }
}