package projetos;

import java.util.ArrayList;
import excecoes.ProjetoLotadoException;
import usuario.Aluno;
import usuario.Professor;

public class Projeto {

    public static final int MAX_VAGAS = 20;

    private static int totalProjetos = 0;

    private String titulo;
    private String areaEstudos;
    private Professor orientador;
    private String dataInicio;
    private String prazo;
    private int numeroVagas;
    private String status;
    

    private ArrayList<Aluno> participantes;


    public Projeto(String titulo, String areaEstudo, Professor orientador, String dataInicio, String prazo, int numeroVagas ) {
        this.titulo = titulo;
        this.areaEstudos = areaEstudo;
        this.orientador = orientador;
        this.dataInicio = dataInicio;
        this.prazo = prazo;
        this.numeroVagas = numeroVagas;
        this.status = "Em andamento";
        totalProjetos++;

        if (numeroVagas > MAX_VAGAS) {
        this.numeroVagas = MAX_VAGAS;
}
           else {
            this.numeroVagas = numeroVagas;
             }

        this.participantes= new ArrayList<>();
    }

   public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAreaEstudo() {
        return areaEstudos;
    }

    public void setAreaEstudo(String areaEstudos) {
        this.areaEstudos = areaEstudos;
    }

    public Professor getOrientador() {
        return orientador;
    }

    public void setOrientador(Professor orientador) {
        this.orientador = orientador;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public int getNumeroVagas() {
        return numeroVagas;
    }

    public void setNumeroVagas(int numeroVagas) {
        this.numeroVagas = numeroVagas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Aluno> getParticipantes() {
        return participantes;
    }

    public static int getTotalProjetos() {
    return totalProjetos;
}

      public void adicionarAluno(Aluno aluno) throws ProjetoLotadoException {

    if (participantes.size() < numeroVagas) {
        participantes.add(aluno);
        System.out.println("Aluno adicionado ao projeto.");
    } else {
        throw new ProjetoLotadoException(
            "O projeto não possui vagas disponíveis."
        );
    }

      if (!participantes.contains(aluno)) {
            participantes.add(aluno);
                 }
}
      public void removerAluno(Aluno aluno){
        participantes.remove(aluno);
        System.out.println("Aluno removido do projeto.");
      }
       public void alterarStatus(String novoStatus){
        this.status = novoStatus;
       }
       public void listarParticipantes(){
        System.out.println("Participantes do projeto: ");
        if(participantes.isEmpty()){
        System.out.println("Nenhum participante.");
          return;
}
          for(Aluno aluno : participantes){
            System.out.println(aluno.getNome());
          }
       }

    @Override
    public String toString() {
         return "\nTítulo: " + titulo +
               "\nÁrea: " + areaEstudos +
               "\nOrientador: " + orientador.getNome() +
               "\nData de Início: " + dataInicio +
               "\nPrazo: " + prazo +
               "\nVagas: " + numeroVagas +
               "\nStatus: " + status;
    }
}
