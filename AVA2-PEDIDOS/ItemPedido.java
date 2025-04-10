public class ItemPedido {
    private int codigoProduto;
    private String descricaoProduto;
    private int quantidadeProduto;
    private double precoUnitario;

    public ItemPedido (int codigoProduto, String descricaoProduto, int quantidadeProduto, double precoUnitario) {
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.precoUnitario = precoUnitario;
    }

    public double calcularSubtotal() {
        return quantidadeProduto * precoUnitario;
    }

}
