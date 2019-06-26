import java.time.LocalDateTime;
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

    @Override
    public void adicionaApresentacao(Apresentacao apresentacao) {
        RepositorioArray.add(apresentacao);
    }

    @Override
    public boolean vericarApresentacoes(Apresentacao a) {
            //verificar apresentacao a mesma hora
        Apresentacao apresentacao = null;
        for(Object o : RepositorioArray)
        {
            if(o.getClass() == Apresentacao.class ) {
                apresentacao = (Apresentacao) o;
                if(apresentacao.getSala() == a.getSala()) {
                    if(apresentacao.getHoraInicio() == a.getHoraInicio()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void adicionaRevendaCopia(RevendaCopia rc) {
        RepositorioArray.add(rc);
        RepositorioArray.remove(rc.getCopia());
        System.out.println(RepositorioArray);
    }

    @Override
    public boolean verificarCopias(Livro l) {
        //percorer lista copias dum livro
        Copia copia = null;

        for(Object o : RepositorioArray)
        {
            if(o.getClass() == Copia.class ) {
                copia = (Copia) o;
                if(copia.getLivro() == l) {
                        return true;
                    }
                }
            }

        return false;
    }

    @Override
    public void adicionaInscricaoApresentacao(InscricaoApresentacao ia) {
        RepositorioArray.add(ia);
    }

    @Override
    public boolean verificarInscritos(Apresentacao a) {

        //percorer lista copias dum livro
        int numeroinscritos = 0;
        InscricaoApresentacao ia = null;

        for(Object o : RepositorioArray)
        {
            if(o.getClass() == InscricaoApresentacao.class ) {
                ia = (InscricaoApresentacao) o;
                if(ia.getApresentacao() == a) {
                    numeroinscritos++;
                }
            }
        }
        if(numeroinscritos >= a.getCapacidade()) {
            return false;
        }
        else {
            return true;
        }
    }


}
