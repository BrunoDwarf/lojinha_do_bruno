/*
 * Classname             (Main)
 *
 * Date                  (07/07/2020 - 21:15)
 *
 * author                (Bruno Rodrigues Souza)
 * Copyright notice      (Programa de gerenciamento dos produtos de um mercadinho)
 */

import corejava.Console1;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        int quantidadeProduto, quantidadeCategoria, opcaoMenuInicial, opcaoSubMenu, categoriaNumero = 1, descontoContinuo, taxaEmergencial;
        String produtoNome, categoriaNome;
        double produtoPreco;
        boolean continua = true, controle = false, achou = false;

        Produto umProduto = null;
        Categoria umCategoria = null;

        System.out.println("Bem vindo a Lojinha do Bruno");
        quantidadeCategoria = Console1.readInt("\nDigite a quantidade de categorias que pretende cadastrar: ");
        quantidadeProduto = Console1.readInt("\nDigite a quantidade de produtos que pretende cadastrar: ");

        ArrayList<Categoria> lista_de_categorias = new ArrayList(quantidadeCategoria);
        ArrayList<Produto> lista_de_produtos = new ArrayList(quantidadeProduto);

        while(continua)
        {
            System.out.println("\nMenu de Ações");
            System.out.println("1 - Cadastrar.");
            System.out.println("2 - Alterar.");
            System.out.println("3 - Excluir.");
            System.out.println("4 - Listagem completa.");
            System.out.println("5 - Sair.");

            opcaoMenuInicial = Console1.readInt("\nDigite o número (1 à 5) correspondente a ação escolhida: ");

            switch (opcaoMenuInicial) {
                case 1:
                    System.out.println("\nMenu de Cadastramento");
                    System.out.println("1 - Cadastrar nova categoria.");
                    System.out.println("2 - Cadastrar novo produto.");

                    opcaoSubMenu = Console1.readInt("\nDigite o número (1 à 2) correspondente a ação escolhida: ");

                    if((opcaoSubMenu == 1) && (quantidadeCategoria > 0)) {
                        System.out.println("\nCadastramento de Categoria");
                        System.out.println("Número da Categoria: " + categoriaNumero);
                        categoriaNome = Console1.readLine("Descrição da Categoria: ");

                        umCategoria = new Categoria(categoriaNome);
                        lista_de_categorias.add(umCategoria);
                        quantidadeCategoria --;
                        categoriaNumero ++;

                        System.out.println("\nCategoria cadastrada com sucesso!");
                    }
                    else {
                        System.out.println("\nCadastramento de Produto");
                        produtoNome = Console1.readLine("Nome do Produto: ");
                        produtoPreco = Console1.readDouble("Preço do Produto: ");
                        categoriaNumero = Console1.readInt("Número da Categoria: ");

                        for(i = 0; i < lista_de_categorias.size(); ++i) {
                            umCategoria = (Categoria)lista_de_categorias.get(i);
                            if (umCategoria.getNumero() == categoria_numero) {
                                achou = true;
                                break;
                            }
                        }

                    }

            }
        }

    }
}
