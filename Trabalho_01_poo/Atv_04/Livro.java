package Atv_04;

public class Livro {

    private int id;
    private String titulo;
    private String autor;
    private boolean disponivel;

    public int getIdLivro() {
        return id;
    }

    public String getTituloLivro() {
        return titulo;
    }

    public String getAutorLivro() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setIdLivro(int id) {
        if(id <= 0){
            System.out.println("ID inválido");
        } 
        this.id = id;
    }

    public void setTituloLivro(String titulo) {
        if(titulo == null || titulo.trim().isEmpty()){
            System.out.println("Título Inválido");
        }
        this.titulo = titulo;
    }

    public void setAutorLivro(String autor) {
        if(autor == null || autor.trim().isEmpty()){
            System.out.println("Autor Inválido");
        }
        this.autor = autor;
    }

    public Livro(int id, String titulo, String autor, boolean disponivel){
        setIdLivro(id);
        setTituloLivro(titulo);
        setAutorLivro(autor);
        this.disponivel = true;
    }

    public void exibirDisponibilidade(){
        if(disponivel == true){
            System.out.println("Está Disponível");
        } else {
            System.out.println("Não Está disponível");
        }
    }

    @Override
    public String toString(){
        return 
        (
            "Autor: " + autor + 
            "Título: " + titulo + 
            "Disponibilidade: " + disponivel
        );
    }
}
