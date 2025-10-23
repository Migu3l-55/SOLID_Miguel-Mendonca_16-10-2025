class Pedido {
    private java.util.List<Item> itens = new java.util.ArrayList<>();
    private Pagamento pagamento;

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public java.util.List<Item> getItens() {
        return itens;
    }
}