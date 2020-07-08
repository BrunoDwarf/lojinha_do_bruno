/*
 * Classname             (Produto)
 *
 * Date                  (07/07/2020 - 20:57)
 *
 * author                (Bruno Rodrigues Souza)
 * Copyright notice      (Programa de gerenciamento dos produtos de um mercadinho)
 */

public abstract class Produto {
    public static int contador = 0;
    public double preco;

    private int codigo;
    private String nome;
    private Categoria categoria;

    public void setCodigo() {
        this.codigo = ++contador;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public abstract double calcularPreco();
}
