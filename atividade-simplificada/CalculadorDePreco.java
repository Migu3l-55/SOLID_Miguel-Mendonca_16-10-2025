public class CalculadorDePreco {
    public static double calcularPreco(Pedido pedido) {
        double total = 0;
        for (Item item : pedido.getItens()) {
            total += item.getPreco();
        }
        return total;
    }
}
