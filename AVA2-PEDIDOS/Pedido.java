import java.time.LocalDateTime;

public class Pedido {
    private int idPedido;
    private LocalDateTime dataHora;
    private Vendedor vendedor;
    private Cliente cliente;
    private StatusPedido statusPedido;
    private ItemPedido itemPedido;

    public Pedido(int idPedido, Vendedor vendedor, Cliente cliente) {
        this.idPedido = idPedido;
        this.dataHora = LocalDateTime.now();
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.statusPedido = StatusPedido.EM_PRCESSAMENTO;
        this.itemPedido = itemPedido;
    }

    public double calcularValorTotal() {
        return itemPedido.calcularSubtotal();
    }

    public void atualizarStatus(StatusPedido novoStatus) {
        this.statusPedido = novoStatus;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public ItemPedido getItemPedido() {
        return itemPedido;
    }
  
}