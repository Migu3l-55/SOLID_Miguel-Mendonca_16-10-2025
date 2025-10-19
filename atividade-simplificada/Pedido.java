// Classe que representa o Pedido
class Pedido {
    private java.util.List<Item> itens = new java.util.ArrayList<>();
    private Pagamento pagamento;
    private String tipoPagamento; // "cartao", "boleto"

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public java.util.List<Item> getItens() {
        return itens;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
        setTipoPagamento(pagamento.getTipoPagamento());
    }

    public String getTipoPagamento() {
        return this.pagamento.getTipoPagamento();
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}