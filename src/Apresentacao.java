import java.time.LocalDateTime;

public class Apresentacao extends Object{

    int id;
    Livro livro;
    Sala sala;
    int capacidade;
    LocalDateTime horainicio;
    LocalDateTime horafim;
    Orador orador;
    Utilizador utilizador;

    public Apresentacao(int id, Livro livro, Sala sala, int capacidade, LocalDateTime horainicio, LocalDateTime horafim, Orador orador, Utilizador utilizador){
        this.id = id;
        this.livro = livro;
        this.sala = sala;
        this.capacidade = capacidade;
        this.horainicio = horainicio;
        this.horafim = horafim;
        this.orador = orador;
        this.utilizador = utilizador;

    }
    public int getId(){ return this.id; }
    public Livro getLivro(){return livro;}
    public Sala getSala() {return sala;}
    public int getCapacidade() {return capacidade;}
    public LocalDateTime getHoraInicio() {return horainicio;}
    public LocalDateTime getHoraFim() {return horafim;}
    public Orador getOrador() {return orador;}
    public Utilizador getUtilizador() {return utilizador;}
}
