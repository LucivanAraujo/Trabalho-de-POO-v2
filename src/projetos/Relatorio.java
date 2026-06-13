package projetos;

import usuario.Aluno;


public class Relatorio {
    private String titulo;
    private String conteudo;
    private Aluno autor;
    private String dataEnvio;
    private boolean validado;

    public Relatorio(String titulo, String conteudo, Aluno autor, String dataEnvio){
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.autor = autor;
        this.dataEnvio = dataEnvio;
        this.validado = false;
    }
     public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public Aluno getAutor() {
        return autor;
    }

    public String getDataEnvio() {
        return dataEnvio;
    }

    public boolean isValidado() {
        return validado;
    }


    public void setValidado(boolean validado){
        this.validado = validado;
    }


    public String getTexto(){
        return  "Relatorio{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor.getNome() + '\'' +
                ", dataEnvio='" + dataEnvio + '\'' +
                ", validado=" + validado +
                '}';
    }
}
