import java.time.LocalDate;

public class Requisicao {

    private Copia Copia;
    private Utilizador Utilizador;
    private LocalDate localdate;

    public Requisicao(LocalDate localdate, Utilizador Utilizador, Copia Copia) {
        setLocalDate(localdate);
        setUtilizador(Utilizador);
        setCopia(Copia);
    }

    public LocalDate getData() {
        return localdate;
    }

    private void setLocalDate(LocalDate d) {
        this.localdate = d;
    }

    public Utilizador getUtilizador() {
        return Utilizador;
    }

    private void setUtilizador(Utilizador u) {
        this.Utilizador = u;
    }

    public Copia getCopia() {
        return Copia;
    }

    private void setCopia(Copia c) {
        this.Copia = c;
    }

}
