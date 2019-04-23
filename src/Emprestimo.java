import java.time.LocalDate;

public class Emprestimo {

    private LocalDate data;
    private Requisicao requisicao;

    public  Emprestimo(LocalDate data, Requisicao requisicao) {
        setData(data);
        setRequisicao(requisicao);
    }

    public LocalDate getData() { return data; }

    public Requisicao getRequisicao() { return requisicao; }

    private void setData(LocalDate d) { this.data = d; }

    private void setRequisicao(Requisicao r)  { this.requisicao = r; }

}
