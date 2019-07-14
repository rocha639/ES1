import java.time.LocalDateTime;

public interface Repositorio {

    public void adicionaPropostaRequisicao(PropostaAquisicao proposta);

    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra);

    public void adicionaEncomenda(Encomenda encomenda);

    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro);

    public  void adicionaUtilizador(Utilizador utilizador);

    public  void adicionaTipoUtilizador(TipoUtilizador tipo);

    public  void adicionaRequisicao(Requisicao requisicao);

    public  void adicionaCopia(Copia copia);

    public  void adicionaLivro(Livro livro);

    public  void adicionaEmprestimo(Emprestimo emprestimo);

    public  void adicionaNotificacao(Notificacao notificacao);

    public  void adicionaDevolucao(Devolucao devolucao);

    public  void adicionaCoima(Coima coima);

    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r);

    public void adicionaApresentacao(Apresentacao a);

    public boolean vericarApresentacoes(Apresentacao a);

    public void adicionaRevendaCopia(RevendaCopia rc);

    public boolean verificarCopias(Livro l);

    public void adicionaInscricaoApresentacao(InscricaoApresentacao ia);

    public boolean verificarInscritos(Apresentacao a);

    public void adicionaSala(Sala s);

    public void adicionaOrador(Orador o);
}
