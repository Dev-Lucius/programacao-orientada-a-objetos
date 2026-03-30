package Atv_04;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {

    private String nome;
    private List<Livro> livros;

    int disponivel = 0;
    int emprestado = 0;

    // Construtor da Biblioteca
    public Biblioteca(String nome){
        setNomeBiblioteca(nome);
        this.livros = new ArrayList<>();
    }

    public void setNomeBiblioteca(String nome){
        if(nome == null || nome.trim().isEmpty()){
            System.out.println("Nome Inválido");
        } else {
            this.nome = nome;
        }
    }

    // Método para Adicionar um Livro
    public void AdicionarLivro(Livro livro){
        // Livro Nulo
        if(livro == null){
            System.out.println("Livro Inválido: Não Pode ser Adicionado");
        }

        // Livro já está no acervo
        if(livros.contains(livro)){
            System.out.println("O Livro " + livro.getTituloLivro() + " já se encontra em seu Acervo");
            return;
        }

        // Livro é válido e não está no acervo
        livros.add(livro);
        System.out.println("O livro " + livro.getTituloLivro() + " foi adicionado ao seu acervo");
    }

    // Método para emprestar um livro
    public void emprestarLivro(String titulo){
        for (Livro livro : livros) {
            if(livro.getTituloLivro().equalsIgnoreCase(titulo)){

                // Livro Encontrado
                if(livro.isDisponivel() == false){
                    System.out.println(titulo + " já está emprestado");
                    return;
                }

                livro.setDisponivel(false);
                System.out.println(titulo + " foi emprestado com sucesso");
                return;
            }
        }
        System.out.println(titulo + " não foi encontrado no Acervo");
    }

    // Método para Devolver um Livro
    public void devolverLivro(String titulo){
        for(Livro livro : livros){
            if(livro.getTituloLivro().equalsIgnoreCase(titulo)){
                if(livro.isDisponivel() == false){
                    System.out.println(titulo + " não estava emprestado");
                    return;
                }

                livro.setDisponivel(true);
                System.out.println(titulo + " foi devolvido com sucesso");
                return;
            }
        }
        System.out.println(titulo + " não foi encontrado no acervo");
    }

    public void listarLivros(){
        System.out.println("\n ACERVO: " + nome);

        if(livros.isEmpty()){
            System.out.println("Nenhum livro presente no Acervo");
            return;
        }

        for(Livro livro : livros){
            System.out.println(livro);
            if(livro.isDisponivel()){
                disponivel = disponivel + 1;
            } else {
                emprestado = emprestado + 1;
            }
        }

        System.out.println("Total: " + livros.size());
        System.out.println(" | Disponíveis: " + disponivel);
        System.out.println(" | Emprestado: " + emprestado);
    }

    public List<Livro> getLivros(){
        return Collections.unmodifiableList(livros);
    }

    @Override
    public String toString(){
        return  "Biblioteca: " + nome + 
                " | Acervo: " + livros.size() + " livro(s)" +
                " | Disponíveis: " + disponivel; 
    }
}
