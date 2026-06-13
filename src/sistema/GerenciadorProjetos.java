package sistema;

import java.util.ArrayList;

import projetos.Projeto;

public class GerenciadorProjetos {
    private ArrayList<Projeto>projetos;

    public GerenciadorProjetos(){
        projetos = new ArrayList<>();
    }

    public void adicionarProjeto(Projeto projeto){
        projetos.add(projeto);
    }
    public void removerProjeto(Projeto projeto){
        projetos.remove(projeto);
    }
    public ArrayList<Projeto> getProjetos(){
        return projetos;
    }

    public void buscarPorArea(String area){
        for (Projeto projeto : projetos){
            if(projeto.getAreaEstudo().equalsIgnoreCase(area)){
                System.out.println(projeto);
            }
        }
    }

    public void buscarPorStatus(String status){
        for (Projeto projeto : projetos){
            if(projeto.getStatus().equalsIgnoreCase(status)){
                System.out.println(projeto);
            }
        }
    }

    public void buscarPorOrientador(String nomeOrientador){
        for(Projeto projeto : projetos){
            if(projeto.getOrientador().getNome().equalsIgnoreCase(nomeOrientador)){
                System.out.println(projeto);
            }
        }
    }

    //Estatisticas:
    public int totalProjetos(){
        return projetos.size();
    }

    public int totalParticipantes(){
        int total = 0;
        for(Projeto projeto : projetos){
            total+= projeto.getParticipantes().size();
        }
        return total;
    }

    public Projeto projetoMaisAtivo(){
        if(projetos.isEmpty()){
            return null;
        }
        Projeto maisAtivo = projetos.get(0);
        for(Projeto projeto : projetos){
            if(projeto.getParticipantes().size() > maisAtivo.getParticipantes().size()){
                maisAtivo =projeto;
            }
        }
        return maisAtivo;
    }

    public int quantidadeProjetosArea(String area) {

    int quantidade = 0;

    for (Projeto projeto : projetos) {

        if (projeto.getAreaEstudo().equalsIgnoreCase(area)) {
            quantidade++;
        }
    }

    return quantidade;
}

    public void exibirEstatisticas() {

        System.out.println("\n===== ESTATÍSTICAS =====");
        System.out.println("Total de Projetos: " + totalProjetos());
        System.out.println("Total de Participantes: " + totalParticipantes());

        Projeto maisAtivo = projetoMaisAtivo();

        if (maisAtivo != null) {
            System.out.println("Projeto mais ativo: "
                    + maisAtivo.getTitulo());
        }
    }

    public void listarProjetos() {

        if(projetos.isEmpty()){
       System.out.println("Nenhum projeto cadastrado.");
           return;
} 
        for (Projeto projeto : projetos) {
            System.out.println(projeto);
            System.out.println("-------------------");
        }
    }
}
