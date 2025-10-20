public class ProcessadorDePagamentos {
    public static void processarPagamento(Pedido pedido) {
        String text = String.format("Processando pagamento via %s.", pedido.getTipoPagamento()); 
        
        if (pedido.getTipoPagamento().equals("cartao")) {
            System.out.println(text);
            // Lógica específica para cartão
        } else if (pedido.getTipoPagamento().equals("boleto")) {
            System.out.println(text);
            // Lógica específica para boleto
        } else if (pedido.getTipoPagamento().equals("pix")) {
            System.out.println(text);
            // Lógica específica para boleto
        } 
        // ...
    }
}
