
public class InscricaoApresentacao extends Object{
    int id;
    Apresentacao apresentacao;
    Utilizador utilizador;

    public InscricaoApresentacao(int id, Apresentacao apresentacao, Utilizador utilizador){
        this.id = id;
        this.apresentacao = apresentacao;
        this.utilizador = utilizador;
    }
    public int getId(){ return this.id; }
    public Apresentacao getApresentacao() {return apresentacao;}
    public Utilizador getUtilizador() {return utilizador;}
}
