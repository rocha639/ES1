import java.time.LocalDate;

public class PropostaAquisicao {

    private LocalDate data;
    private Utilizador utilizador;
    private String infolivro;

    public PropostaAquisicao(LocalDate data, Utilizador utilizador, String infolivro) {
        setData(data);
        setUtilizador(utilizador);
        setInfolivro(infolivro);
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public String getInfolivro() {
        return infolivro;
    }

    public void setInfolivro(String infolivro) {
        this.infolivro = infolivro;
    }
}
