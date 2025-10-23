public class PagamentoViaCartao implements Pagamento {
    @Override 
    public void pagar(Pedido pedido) {
        System.out.println("Pagamento via Cartão para "+pedido.getItens());
    }
}