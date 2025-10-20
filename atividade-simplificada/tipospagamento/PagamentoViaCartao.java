package tipospagamento;

public class PagamentoViaCartao implements Pagamento {
    private final String tipoPagamento = "cartao";
    @Override 
    public String getTipoPagamento() {
        return tipoPagamento;
    }
}