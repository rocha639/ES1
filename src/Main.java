import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Utilizador u = new Utilizador("Manuel","Ativo", new TipoUtilizador("aluno",10));

        Utilizador f = new Utilizador("Artur","Ativo", new TipoUtilizador("Funcionário",0));

        PropostaAquisicao propostaAquisicao = new PropostaAquisicao(LocalDate.now(),u,"Alice no Pais das Maravilhas");
        Livro l = new Livro("Programar em Java", "FCA");
        Copia c = new Copia(1, l);
        RequisicaoCompraCopia requisicaoCompraCopia = new RequisicaoCompraCopia("pendente", LocalDate.now(), "Oficio",l,u);
        Encomenda encomenda = new Encomenda(LocalDate.now(),requisicaoCompraCopia);
        EntradaNovoLivro entradaNovoLivro = new EntradaNovoLivro(LocalDate.now(),encomenda,c);

        Repositorio repo = new RepositorioMem();
        repo.adicionaEntradaNovoLivro(entradaNovoLivro);
        repo.adicionaCopia(c);

        //---------------------------------------------------------------------
        //----------------------- APRESENTAÇÃO --------------------------------
        //---------------------------------------------------------------------

        TipoUtilizador t =  new TipoUtilizador("Orador", '0');
        Sala s = new Sala(1,1, 1, false);
        Orador o = new Orador(1, "José", t);

        LocalDateTime hi = LocalDateTime.of(2019, 6, 6, 12, 30, 40, 50000);
        LocalDateTime hf = LocalDateTime.of(2019, 6, 6, 13, 30, 40, 50000);
        Apresentacao a = new Apresentacao(1, l, s, s.getCapacidade(), hi, hf, o, f);

        boolean estado = repo.vericarApresentacoes(a);
        if (estado) {
            System.out.println("Sala ocupada");
        }
        else {
            repo.adicionaApresentacao(a);
            System.out.println("Apresentação Adicionada com Sucesso!");
        }

        //-----Apresentação b
        Sala s1 = new Sala(2,2, 30, false);
        Apresentacao b = new Apresentacao(2, l, s1, s1.getCapacidade(), hi, hf, o, f); //alternar s1 com s
        boolean estado2 = repo.vericarApresentacoes(b);
        if (estado2) {
            System.out.println("Sala encontra-se ocupada!");
        }
        else {
            repo.adicionaApresentacao(b);
            System.out.println("Apresentação Adicionada com Sucesso!");
        }

        //---------------------------------------------------------------------
        //------------------------------------- REVENDA COPIAS ----------------
        //---------------------------------------------------------------------

        RevendaCopia revenda = new RevendaCopia(1, c, f,15);
        boolean estado3 = repo.verificarCopias(c.getLivro());

        if(!estado3) { System.out.println("Livro não tem cópias"); }
        else {
            repo.adicionaRevendaCopia(revenda);
            System.out.println("Revenda com sucesso!");
        }


        //---- revenda2 #comentar copia c1 e repo.adicionacopia
        //Copia c1 = new Copia(2, l); // alternar entre c1 e c
        //repo.adicionaCopia(c1); //Nao editar
        RevendaCopia revenda2 = new RevendaCopia(1, c, f,17);

        boolean estado4 = repo.verificarCopias(c.getLivro());

        if(!estado4) { System.out.println("Livro não tem cópias"); }
        else {
            repo.adicionaRevendaCopia(revenda2);
            System.out.println("Revenda com sucesso!");
        }

        //---------------------------------------------------------------------
        //--------------------- Inscrição apresentacao ------------------------
        //---------------------------------------------------------------------

        InscricaoApresentacao ia = new InscricaoApresentacao(1, a, u);
        boolean estado5 = repo.verificarInscritos(a);

        if(estado5) { repo.adicionaInscricaoApresentacao(ia); System.out.println("Inscrito com sucesso!"); }
        else { System.out.println("Apresentação cheia!"); }

        //Inscricao 2 mudar capacidade sala entre 1 e 2
        InscricaoApresentacao ia2 = new InscricaoApresentacao(2, a, u);
        boolean estado6 = repo.verificarInscritos(a);

        if(estado6) { repo.adicionaInscricaoApresentacao(ia2); System.out.println("Inscrito com sucesso!"); }
        else { System.out.println("Apresentação cheia!"); }

    }
}
