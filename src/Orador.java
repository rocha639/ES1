
public class Orador extends Object{
    int id;
    String nome;
    TipoUtilizador tipoutilizador;

    public Orador(int id, String nome, TipoUtilizador tipoutilizador){
        this.id = id;
        this.nome = nome;
        this.tipoutilizador = tipoutilizador;
    }
    public int getId(){ return this.id; }
    public String getNome() {return nome;}
    public TipoUtilizador getTipoUtilizador() {return tipoutilizador;}
}
