public class Utilizador {

    private String Nome;
    private String Estado;

    private TipoUtilizador tipoUtilizador;

    public Utilizador(String nome, String estado, TipoUtilizador tipoUtilizador) {
        this.Nome = nome;
        this.Estado = estado;
        this.tipoUtilizador = tipoUtilizador;
    }

    public String getNome() {
        return Nome;
    }

    public String getEstado() {
        return Estado;
    }

    public TipoUtilizador getTipoUtilizador() {
        return this.tipoUtilizador;
    }

}
