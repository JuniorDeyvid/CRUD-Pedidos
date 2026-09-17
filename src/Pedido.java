public class Pedido {
    private int codigo;
    private String nomeCliente;
    private String descriçãoProduto;
    private double valor;
    private String status;

    Pedido (int codReceb, String nomeReceb, String descReceb,
             double valorReceb) {
        codigo = codReceb;
        nomeCliente = nomeReceb;
        descriçãoProduto = descReceb;
        valor = valorReceb;
        status = "Pendente";
    }

    int getCodigo(){
        return codigo;}

    String getNomeCliente() {
        return nomeCliente;
    }

    String getDescriçãoProduto() {
        return descriçãoProduto;
    }

    double getValor() {
        return valor;
    }

    String getStatus() {
        return status;
    }

    void setDescriçãoProduto(String novaDescrição) {
        descriçãoProduto = novaDescrição;
    }

    void setValor(double novoValor) {
        valor = novoValor;
    }

    void setStatus(String novoStatus) {
        status = novoStatus;
    }

    void mostrar() {
        System.out.println("Código: " + codigo);
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Produto: " + descriçãoProduto);
        System.out.println("Valor: R$" + valor);
        System.out.println("Status: " + status);
        System.out.println("--------------------------");
    }

}
