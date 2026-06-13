package usuario;

import java.util.ArrayList;

import interfaces.Notificavel;
import notificacoes.Notificacao;
import projetoss.Projeto;

public class Coordenador extends Usuario implements Notificavel{
     private String idCoordenador;

    public Coordenador(String nome, String email, String senha, String idCoordenador) {
        super(nome, email, senha);
        this.idCoordenador = idCoordenador;
    }

    public String getIdCoordenador() {
        return idCoordenador;
    }

    public void setIdCoordenador(String idCoordenador) {
        this.idCoordenador = idCoordenador;
    }

    public void cadastrarProjeto(Projeto projeto, ArrayList<Projeto> projetos) {
        projetos.add(projeto);
        System.out.println("Projeto cadastrado com sucesso.");
    }

    public void editarProjeto(Projeto projeto, String novoTitulo) {
        projeto.setTitulo(novoTitulo);
        System.out.println("Projeto editado com sucesso.");
    }

    public void removerProjeto(Projeto projeto, ArrayList<Projeto> projetos) {
        projetos.remove(projeto);
        System.out.println("Projeto removido com sucesso.");
    }

    public void ativarUsuario(Usuario usuario) {
        usuario.setAtivo(true);
        System.out.println("Usuário ativado!");
    }

    public void desativarUsuario(Usuario usuario) {
        System.out.println("Usuário desativido!");
        usuario.setAtivo(false);
    }

    public void removerUsuario(Usuario usuario, ArrayList<Usuario> usuarios) {
        usuarios.remove(usuario);
    }

    public void gerarRelatorioGeral() {
        System.out.println("Relatório geral gerado.");
    }

    public void visualizarEstatisticas() {
        System.out.println("Exibindo estatísticas do sistema.");
    }

    @Override
    public String toString() {
        return "Coordenador{" +
        "nome='" + getNome() + '\'' +
        ", idCoordenador='" + idCoordenador + '\'' +
        ", email='" + getEmail() + '\'' +
        '}';
    }
    @Override
public void receberNotificacao(Notificacao notificacao) {
    System.out.println(
        "Coordenador " + getNome() +
        " recebeu: " + notificacao.getMensagem()
    );
}
}
