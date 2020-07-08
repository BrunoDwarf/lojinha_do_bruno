/*
 * Classname             (Main)
 *
 * Date                  (07/07/2020 - 21:15)
 *
 * author                (Bruno Rodrigues Souza)
 * Copyright notice      (Programa de gerenciamento dos produtos de um mercadinho)
 */

import corejava.Console1;
import java.io.PrintStream;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        int qnt_prod, qnt_cat, opcao_menu, opcao, desconto_continuo, taxa_emergencial;
        String produto_nome, categoria_nome;
        boolean continua = true, controle = false, achou = false;

        Produto umProduto = null;
        Categoria umCategoria = null;

        System.out.println("Bem vindo a Lojinha do Bruno");
        qnt_cat = Console1.readInt("\n Digite a quantidade de categorias que pretende cadastrar: ");
        qnt_prod = Console1.readInt("Digite a quantidade de produtos que pretende cadastrar: ");

        ArrayList<Categoria> lista_de_categorias = new ArrayList(qnt_cat);
        ArrayList<Produto> lista_de_produtos = new ArrayList(qnt_prod);

        while(continua == true)
        {
            System.out.println("\nMenu de Ações");
            System.out.println("1 - Cadastrar.");
            System.out.println("2 - Alterar.");
            System.out.println("3 - Excluir.");
            System.out.println("4 - Listagem completa.");
            System.out.println("5 - Sair.");
            opcao_menu = Console1.readInt("Digite o número (1 à 5) correspondente a ação escolhida: ");

            switch (opcao_menu) {
                case 1:
                    System.out.println("\nMenu de Cadastramento");
                    System.out.println("1 - Cadastrar nova categoria.");
                    System.out.println("2 - Cadastrar novo produto.");
                    opcao = Console1.readInt("Digite o número (1 à 2) correspondente a ação escolhida: ");

                    if(opcao == 1) {
                        System.out.println("\nCadastramento de Categoria");
                        categoria_nome = Console1.readLine("Descrição da Categoria: ");

                        umCategoria = new Categoria(categoria_nome);
                        lista_de_categorias.add(umCategoria);
                        System.out.println("Categoria cadastrada com sucesso!");
                    }

            }
        }

    }
}
