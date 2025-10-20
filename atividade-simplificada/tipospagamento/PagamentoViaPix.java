package tipospagamento;

public class PagamentoViaPix implements Pagamento {
    private final String tipoPagamento = "pix";
    @Override 
    public String getTipoPagamento() {
        return tipoPagamento;
    }
}