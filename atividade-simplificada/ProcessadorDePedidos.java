/**
 * ESTA É A CLASSE QUE VIOLA TODOS OS PRINCÍPIOS SOLID
 */
class ProcessadorDePedidos {
    // Violação do DIP: Depende diretamente da implementação concreta
    private BD repositorio;

    // Violação do SRP: Esta classe faz tudo
    public void processar(Pedido pedido) {
        // 1. Responsabilidade: Calcular o total
        double total = CalculadorDePreco.calcularPreco(pedido);
        System.out.println("Total do pedido: " + total);

        // 2. Responsabilidade: Processar o pagamento
        // Violação do OCP: Aberto para modificação quando um novo pagamento surgir
        pedido.setPagamento(new PagamentoViaPix());
        ProcessadorDePagamentos.processarPagamento(pedido);

        // 3. Responsabilidade: Salvar no banco
        repositorio.salvar(pedido);

        // 4. Responsabilidade: Enviar e-mail
        System.out.println("Enviando e-mail de confirmação...");
        // Lógica de envio de e-mail
    }
}