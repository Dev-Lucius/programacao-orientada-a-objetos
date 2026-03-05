package poo_ex5;

public class ItemPedido {

    // Construtor
    // Trata-se de uma forma de iniciar o objeto
    // passando parâmetros indicando COMO EU GOSTARIA QUE ELE FOSSE INICIADO
    
    private String nome;
    private double valor;
    private int quantidade;

    public ItemPedido(String nome, double valor, int quantidade) {
        // Pense nisso como um método que estrutura um novo objeto !
        // this remete a própria Instância
        // this.nome -> Atributo
        // nome -> apenas o parâmetro
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }
}
