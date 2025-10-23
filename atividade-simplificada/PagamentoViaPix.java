public class PagamentoViaPix implements Pagamento{
    @Override 
    public void pagar(Pedido pedido) {
        System.out.println("Pagamento via pix para "+pedido.getItens());
        
    }
}