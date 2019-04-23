public class Coima {

    private String descricao;
    private float valor;
    private Devolucao devolucao;

    public Coima(String descricao, float valor, Devolucao devolucao) {
        setDescricao(descricao);
        setValor(valor);
        setDevolucao(devolucao);
    }

    public String getDescricao() { return descricao; }

    public float getValor() { return valor; }

    public Devolucao getDevolucao() { return devolucao; }

    private void setDescricao(String d) { this.descricao = d; }

    private void setValor(float v) { this.valor = v; }

    private void setDevolucao(Devolucao dev) { this.devolucao = dev; }

}
