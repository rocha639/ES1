public class Copia {

    private int Id;
    private Livro Livro;

    public Copia(int id, Livro livro) {
        setId(id);
        setLivro(livro);
    }
    public int getId() {
        return Id;
    }

    public Livro getLivro() {
        return Livro;
    }

    private void setLivro(Livro l) {
        this.Livro = l;
    }

    private void setId(int id) {
        this.Id = id;
    }
}
