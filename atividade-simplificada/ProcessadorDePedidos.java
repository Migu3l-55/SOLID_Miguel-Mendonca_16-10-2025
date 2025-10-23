class ProcessadorDePedidos {
    private MySQLRepositorio repositorio=new MySQLRepositorio();
    
    /* adicionei esses setters e getters pq estava dando o seguinte erro na classe ECommerce.java:
        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "BD.salvar(Pedido)" because "this.repositorio" is null
        at ProcessadorDePedidos.processar(ProcessadorDePedidos.java:16)
        at ECommerce.main(ECommerce.java:13) 
    */
    
    public void processar(Pedido pedido) {
        double total = CalculadorDePreco.calcularPreco(pedido);
        System.out.println("\nTotal do pedido: " + total);
        
        ProcessadorDePagamentos.processarPagamento(pedido, new PagamentoViaCartao());
        
        repositorio.salvar(pedido); //eu acho que essa respnsabilidade pode ficar aqui
        
        Mensageiro.enviarEmailConfirmacao(pedido);
    }
}

//oi Marcelo! 👋👋