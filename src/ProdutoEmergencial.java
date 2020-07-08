/*
 * Classname             (ProdutoEmergencial)
 *
 * Date                  (07/07/2020 - 20:57)
 *
 * author                (Bruno Rodrigues Souza)
 * Copyright notice      (Programa de gerenciamento dos produtos de um mercadinho)
 */

public class ProdutoEmergencial extends Produto {
    private int taxa;

    public ProdutoEmergencial(String nome, Categoria categoria, double preco, int taxa) {
        this.setCodigo();
        this.setNome(nome);
        this.setCategoria(categoria);
        this.setPreco(preco);
        this.taxa = taxa;
    }

    public void setTaxa(int taxa) {
        this.taxa = taxa;
    }

    public int getTaxa() {
        return this.taxa;
    }

    public double calcularPreco() {
        preco = this.preco - (this.preco * (this.taxa / 100));
        return preco;
    }
}
