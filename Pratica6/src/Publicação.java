

import java.util.ArrayList;

class Publicacao {
    private String dataPublicacao;
    private String textoPublicacao;
    private String linkMidia;
    public static double contadorPublicacao;

    public Publicacao(String dataPublicacao, String textoPublicacao, String linkMidia) {
        this.dataPublicacao = dataPublicacao;
        this.textoPublicacao = textoPublicacao;
        this.linkMidia = linkMidia;
        contadorPublicacao++;
    }

    // Getters e setters para os atributos
    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public String getLinkMidia() {
        return linkMidia;
    }

    public static double getContadorPublicacao() {
        return contadorPublicacao;
    }
}

class RedeSocial {
    private String dataCriacao;
    private String nomeUsuario;
    private String dataNascimento;
    private String senha;
    private ArrayList<Publicacao> publicacoes = new ArrayList<>();

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    public void inserePublicacao(Publicacao publicacao) {
        publicacoes.add(publicacao);
    }

    public void imprimePublicacoes() {
        System.out.println("Total de publicações: " + Publicacao.getContadorPublicacao());
        for (Publicacao p : publicacoes) {
            System.out.println("Data de Publicação: " + p.getDataPublicacao());
            System.out.println("Texto da Publicação: " + p.getTextoPublicacao());
            System.out.println("Link da Mídia: " + p.getLinkMidia());
        }
    }
}

public class Principal {
    public static void main(String[] args) {
        // Crie a Rede Social
        RedeSocial redeSocial = new RedeSocial("01/01/2023", "meuUsuario", "10/01/1990", "minhaSenha");

        // Crie algumas publicações
        Publicacao publicacao1 = new Publicacao("02/01/2023", "Texto da Publicação 1", "link1.jpg");
        Publicacao publicacao2 = new Publicacao("03/01/2023", "Texto da Publicação 2", "link2.jpg");

        // Insira as publicações na rede social
        redeSocial.inserePublicacao(publicacao1);
        redeSocial.inserePublicacao(publicacao2);

        // Imprima as publicações
        redeSocial.imprimePublicacoes();
    }
}
