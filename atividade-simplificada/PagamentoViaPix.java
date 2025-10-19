public class PagamentoViaPix implements Pagamento {
    private final String tipoPagamento = "Pix";
    @Override 
    public String getTipoPagamento() {
        return tipoPagamento;
    }
}