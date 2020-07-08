/*
 * Classname             (ProdutoContinuo)
 *
 * Date                  (07/07/2020 - 20:57)
 *
 * author                (Bruno Rodrigues Souza)
 * Copyright notice      (Programa de gerenciamento dos produtos de um mercadinho)
 */

public class ProdutoContinuo extends Produto {
    private int desconto;

    public ProdutoContinuo(String nome, Categoria categoria, double preco, int desconto) {
        this.setCodigo();
        this.setNome(nome);
        this.setCategoria(categoria);
        this.setPreco(preco);
        this.desconto = desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public int getDesconto() {
        return this.desconto;
    }

    public double calcularPreco() {
        preco = this.preco - (this.preco * (this.desconto / 100));
        return preco;
    }

}
