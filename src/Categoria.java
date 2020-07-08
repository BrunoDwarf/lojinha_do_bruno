/*
 * Classname             (Categoria)
 *
 * Date                  (07/07/2020 - 20:42)
 *
 * author                (Bruno Rodrigues Souza)
 * Copyright notice      (Programa de gerenciamento dos produtos de um mercadinho)
 */

public class Categoria {
    public static int contador = 0;
    public int numero;
    private String nome;

    public Categoria(String nome) {
        this.numero = ++contador;
        this.nome = nome;
    }

    public void setNumero() {
        this.numero = ++contador;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
