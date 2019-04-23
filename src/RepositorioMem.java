import java.util.ArrayList;

public class RepositorioMem implements Repositorio {

    private ArrayList<Object> RepositorioArray =  new ArrayList<>();

    public void adicionaEncomenda(Encomenda encomenda) {
        RepositorioArray.add(encomenda);
    }

    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro) {
        RepositorioArray.add(entradaNovoLivro);
    }

    public void adicionaPropostaRequisicao(PropostaAquisicao proposta) { RepositorioArray.add(proposta); }

    public void adicionaUtilizador(Utilizador utilizador) {
        RepositorioArray.add(utilizador);
    }

    public void adicionaTipoUtilizador(TipoUtilizador tipo) {
        RepositorioArray.add(tipo);
    }

    public void adicionaRequisicao(Requisicao requisicao) {
        RepositorioArray.add(requisicao);
    }

    public void adicionaCopia(Copia copia) {
        RepositorioArray.add(copia);
    }

    public void adicionaLivro(Livro livro) {
        RepositorioArray.add(livro);
    }

    public void adicionaEmprestimo(Emprestimo emprestimo) {
        RepositorioArray.add(emprestimo);
    }

    public void adicionaNotificacao(Notificacao notificacao) {
        RepositorioArray.add(notificacao);
    }

    public void adicionaDevolucao(Devolucao devolucao) {
        RepositorioArray.add(devolucao);
    }

    public void adicionaCoima(Coima coima) {
        RepositorioArray.add(coima);
    }

    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra) {
        RepositorioArray.add(requisicaoCompra);
    }

    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r) {

        Emprestimo emprestimo = null;
        //Percorrer emprestimos e ver a requisao se é igual a dada
        for(Object o : RepositorioArray)
        {
            if(o.getClass() == Emprestimo.class ) {
                emprestimo = (Emprestimo) o;
                if(emprestimo.getRequisicao() == r) {
                    return emprestimo;
                }
            }
        }
        return null;
    }



}
