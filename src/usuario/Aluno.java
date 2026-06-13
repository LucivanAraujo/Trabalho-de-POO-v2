package usuario;

import java.util.ArrayList;

import interfaces.Notificavel;
import notificacoes.Notificacao;
import projetoss.Projeto;
import projetoss.Relatorio;

public class Aluno extends Usuario implements Notificavel {

    private String matricula;
    private ArrayList<Projeto> projetosAtuais;
    private ArrayList<Projeto> historicoProjetos;
    private ArrayList<Relatorio> relatorios;

    public Aluno(String nome, String email, String senha, String matricula){
           super(nome, email, senha);
           this.matricula = matricula;
           this.projetosAtuais = new ArrayList<>();
           this.historicoProjetos = new ArrayList<>();
           this.relatorios = new ArrayList<>();

    }
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public ArrayList<Projeto> getProjetosAtuais(){
        return projetosAtuais;
    }
    public ArrayList<Projeto> getHistoricoProjetos(){
        return historicoProjetos;
    }
    public ArrayList<Relatorio> getRelatorios(){
        return relatorios;
    }


    public void visualizarProjetos(ArrayList<Projeto> projetos){
        for(Projeto p : projetos){
            System.out.println(p);
        }
    }
    public void enviarRelatorio(Relatorio relatorio){
        relatorios.add(relatorio);
    System.out.println("Relatório enviado com sucesso.");
    }
    public void solicitarParticipacao(Projeto projeto){
        projetosAtuais.add(projeto);
        System.out.println("Solicitação enviada para o projeto");
    }
     public void visualizarHistorico(){
        System.out.println("Histórico de projetos concluídos: ");
         for(Projeto p : historicoProjetos){
            System.out.println(p.getTitulo());
         }
     }
     public void adicionarProjetos(Projeto projeto){
        historicoProjetos.add(projeto);
     }
     @Override 
      public String toString() {
       return "Aluno{" +
        "nome='" + getNome() + '\'' +
        ", matricula='" + matricula + '\'' +
        ", email='" + getEmail() + '\'' +
        '}';
    }
    @Override
public void receberNotificacao(Notificacao notificacao) {
    System.out.println(
        "Aluno " + getNome() +
        " recebeu: " + notificacao.getMensagem()
    );
}
}
