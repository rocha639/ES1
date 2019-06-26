public class Sala {
    int id;
    int numero;
    int capacidade;
    boolean estado;


    public Sala(int id, int numero, int capacidade, boolean estado) {
        setId(id);
        setNumero(numero);
        setCapacidade(capacidade);
        setEstado(estado);

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
