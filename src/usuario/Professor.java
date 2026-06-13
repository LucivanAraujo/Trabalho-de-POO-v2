package usuario;
import java.util.ArrayList;

import interfaces.Notificavel;
import notificacoes.Notificacao;
import projetoss.Projeto;
import projetoss.Relatorio;

public class Professor extends Usuario implements Notificavel {
    private String idProfessor;
    private ArrayList<Projeto> projetoCoordenados;

    public Professor(String nome, String email, String senha, String idProfessor){
        super(nome, email, senha);
        this.idProfessor = idProfessor;
        this.projetoCoordenados = new ArrayList<>();
    }
    
    public String getIdProfessor(){
        return idProfessor;
    }
    public void setIdProfessor(String idProfessor){
        this.idProfessor = idProfessor;
    }

    public void criarProjeto(Projeto projeto){
        projetoCoordenados.add(projeto);
        System.out.println("Projeto criado com sucesso");
    }
    public void editarProjetos(Projeto projeto, String novoTitulo){
        projeto.setTitulo(novoTitulo);
        System.out.println("Projeto Atualizado");
    }
    public void acompanharProgresso(Projeto projeto){
        System.out.println("Acompanhando projeto: " + projeto.getTitulo());
    } 
    public void validarRelatorio(Relatorio relatorio){
        relatorio.setValidado(true);
        System.out.println("Projeto Validado.");
    }
    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", idProfessor='" + idProfessor + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    @Override
public void receberNotificacao(Notificacao notificacao) {
    System.out.println(
        "Professor " + getNome() +
        " recebeu: " + notificacao.getMensagem()
    );
}
}
