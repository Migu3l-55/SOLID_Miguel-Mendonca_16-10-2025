package tipospagamento;

public class PagamentoViaBoleto implements Pagamento {
    private final String tipoPagamento = "boleto";
    @Override 
    public String getTipoPagamento() {
        return tipoPagamento;
    }
}