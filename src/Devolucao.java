import java.time.LocalDate;

public class Devolucao {

    private LocalDate data;
    private Emprestimo emprestimo;

    public Devolucao(LocalDate data, Emprestimo emprestimo) {
        setData(data);
        setEmprestimo(emprestimo);

    }

    public LocalDate getData() {
        return data;
    }

    public Emprestimo getEmprestimo() { return emprestimo; }

    private void setData(LocalDate d) { this.data = d; }

    private void setEmprestimo(Emprestimo e) {
        this.emprestimo = e;
    }

}

