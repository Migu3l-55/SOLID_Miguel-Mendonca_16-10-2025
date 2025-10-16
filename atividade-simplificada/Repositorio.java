public class Repositorio {
    private BD bd;
    
    public Repositorio(BD bd) {
        this.bd = bd;
    }

    public void salvar(Pedido pedido) {
        bd.salvar(pedido);
    }
}
