import tipospagamento.*;

public class ECommerce {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionarItem(new Item("Teclado", 250.0));
        pedido.adicionarItem(new Item("Mouse", 150.0));
        
        //pedido.setTipoPagamento("cartao");
        pedido.setPagamento(new PagamentoViaCartao());

        ProcessadorDePedidos processador = new ProcessadorDePedidos();
        processador.setRepositorio(new MySQLRepositorio());
        /* adicionei esses setRepositorio pq estava dando o seguinte erro na execução:
            Exception in thread "main" java.lang.NullPointerException: Cannot invoke "BD.salvar(Pedido)" because "this.repositorio" is null
            at ProcessadorDePedidos.processar(ProcessadorDePedidos.java:16)
            at ECommerce.main(ECommerce.java:13) 
        */

        processador.processar(pedido);
    }
}