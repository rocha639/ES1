import java.time.LocalDate;

public class Notificacao {

    private LocalDate data;
    private Emprestimo emprestimo;

    public Notificacao(LocalDate data, Emprestimo emprestimo) {
        setData(data);
        setEmprestimo(emprestimo);
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }
}
