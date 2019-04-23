import java.time.LocalDate;

public class RequisicaoCompraLivro extends  RequisicaoCompra {

    private PropostaAquisicao propostaAquisicao;

    public RequisicaoCompraLivro(String estado, LocalDate data, String oficio, PropostaAquisicao propostaAquisicao, Livro livro, Utilizador utilizador) {
       super(estado,data, oficio, livro, utilizador);
        setPropostaAquisicao(propostaAquisicao);
    }

    public PropostaAquisicao getPropostaAquisicao() {
        return propostaAquisicao;
    }

    public void setPropostaAquisicao(PropostaAquisicao propostaAquisicao) {
        this.propostaAquisicao = propostaAquisicao;
    }
}
