public class ProcessadorDePagamentos {
    public static void processarPagamento(Pedido pedido, Pagamento pagamento) {
        pagamento.pagar(pedido);
    }
}
