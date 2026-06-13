import java.util.ArrayList;

import excecoes.ProjetoLotadoException;
import notificacoes.GerenciadorNotificacoes;
import notificacoes.Notificacao;
import projetos.Projeto;
import projetos.Relatorio;
import sistema.GerenciadorProjetos;
import usuario.Aluno;
import usuario.Professor;
import usuario.Usuario;
import usuario.Coordenador;
import estrategias.*;

public class App {

    public static void main(String[] args){
        Professor professor = new Professor("Alan", "Alan123@gmail.com", "Ufc123", "P001");

        Coordenador coordenador = new Coordenador("Laise", "Laise22@gmail.com", "calculo", "C001");

        //ALUNOS:
        Aluno aluno1 = new Aluno("Jose", "Zezin12@gmail.com", "Kimjose", "A001");
        Aluno aluno2 = new Aluno("Livia", "Liviareri@gamail.com", "Lucas123", "A002");

        Projeto projeto = new Projeto("Sisitema de Gerenciamenteo de Pesquisa", "Computação", professor, "01/11/2026", "01/04/2027", 5);
        Relatorio relatorio = new Relatorio(
        "Relatório Parcial 1",
        "Conteúdo do relatório",
        aluno1,
        "05/06/2026");
                System.out.println(relatorio.getTexto());

       
        ArrayList<Usuario> usuarios = new ArrayList<>();

         usuarios.add(aluno1);
         usuarios.add(aluno2);
         usuarios.add(professor);
         usuarios.add(coordenador);
           
         for (Usuario usuario : usuarios) {
         System.out.println(usuario.getNome());
            }

     //ADICIONAR ALUNOS:
    try {
    projeto.adicionarAluno(aluno1);
    projeto.adicionarAluno(aluno2);
} catch (ProjetoLotadoException e) {
    System.out.println(e.getMessage());
}

try {
    projeto.adicionarAluno(aluno2);
} catch (ProjetoLotadoException e) {
    System.out.println(e.getMessage());
}

System.out.println("\n=== PROFESSOR ====");
professor.acompanharProgresso(projeto);