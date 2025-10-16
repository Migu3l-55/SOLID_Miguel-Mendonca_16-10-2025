// Implementação concreta de Repositório (Acoplamento)
class MySQLRepositorio implements BD {
    @Override
    public void salvar(Pedido pedido) {
        System.out.println("Salvando o pedido no banco de dados MySQL...");
        // Lógica de persistência com MySQL
    }
}