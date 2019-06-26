
public class RevendaCopia extends Object{
    int id;
    Copia copia;
    Utilizador utilizador;
    double preco;

    public RevendaCopia(int id, Copia copia, Utilizador utilizador, double preco){
        this.id = id;
        this.copia = copia;
        this.utilizador = utilizador;
        this.preco = preco;
    }
    public int getId(){ return this.id; }
    public Copia getCopia() {return copia;}
    public Utilizador getUtilizador() {return utilizador;}
    public double getPreco() {return preco;}
}
