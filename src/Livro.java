public class Livro {

    private String Titulo;
    private String Editora;

    public Livro(String Titulo, String Editora) {
        setTitulo(Titulo);
        setEditora(Editora);
    }

    public String getTitulo() {
        return Titulo;
    }

    private void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getEditora() {
        return Editora;
    }

    private void setEditora(String editora) {
        this.Editora = editora;
    }

}
