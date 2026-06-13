package notificacoes;

import java.util.ArrayList;

public class GerenciadorNotificacoes {

    private static GerenciadorNotificacoes instancia;

    private ArrayList<Notificacao> notificacoes;
    

    public GerenciadorNotificacoes() {
        notificacoes = new ArrayList<>();
    }

    public static GerenciadorNotificacoes getInstancia() {
        if(instancia == null){
            instancia = new GerenciadorNotificacoes();
        }
        return instancia;
    }

    public void adicionarNotificacao(Notificacao notificacao) {
        notificacoes.add(notificacao);
    }

    public void listarNotificacoes() {

        System.out.println("\n===== NOTIFICAÇÕES =====");

        for (Notificacao notificacao : notificacoes) {
            System.out.println(notificacao);
        }
    }

    public void notificarPrazo(String prazo){
        adicionarNotificacao( new Notificacao("Lembrete: prazo de entrega em " + prazo));
    }

    public void notificarAtualizacaoProjeto(String projeto){
        adicionarNotificacao(new Notificacao("Atualização do projeto: " + projeto));
    }
}