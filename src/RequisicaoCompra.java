import java.time.LocalDate;

public class RequisicaoCompra {
    private String estado;
    private LocalDate data;
    private String oficio;
    private Livro livro;
    private Utilizador utilizador;

    public RequisicaoCompra(String estado, LocalDate data, String oficio, Livro livro, Utilizador utilizador) {
        setData(data);
        setEstado(estado);
        setOficio(oficio);
        setLivro(livro);
        setUtilizador(utilizador);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }
}
