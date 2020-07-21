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
        int quantidadeProduto, quantidadeCategoria, opcaoMenuInicial, opcaoSubMenu, opcaoTipoProduto, categoriaNumero,
                categoriaNumeroControle = 1, i, descontoContinuo, taxaEmergencial;
        String produtoNome, categoriaNome;
        double produtoPreco;
        boolean continuaRotina = true, achouValor = false, controle = false;

        Produto umProduto = null;
        Categoria umCategoria = null;

        System.out.println("Bem vindo a Lojinha do Bruno");
        quantidadeCategoria = Console1.readInt("\nDigite a quantidade de categorias que pretende cadastrar: ");
        quantidadeProduto = Console1.readInt("\nDigite a quantidade de produtos que pretende cadastrar: ");

        ArrayList<Categoria> lista_de_categorias = new ArrayList(quantidadeCategoria);
        ArrayList<Produto> lista_de_produtos = new ArrayList(quantidadeProduto);

        while(continuaRotina)
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

                    if(opcaoSubMenu == 1) {
                        if(quantidadeCategoria > 0) {
                            System.out.println("\nCadastramento de Categoria");
                            System.out.println("Número da Categoria: " + categoriaNumeroControle);
                            categoriaNome = Console1.readLine("Nome da Categoria: ");

                            if(lista_de_categorias.isEmpty() == false) {
                                for(i = 0; i < lista_de_categorias.size(); i++) {
                                    umCategoria = lista_de_categorias.get(i);
                                    if (umCategoria.getNome() == categoriaNome) {
                                        achouValor = true;
                                        break;
                                    }
                                }
                            }

                            if(achouValor) {
                                System.out.println("\nCategoria já cadastrada!");
                            }
                            else {
                                umCategoria = new Categoria(categoriaNome);
                                lista_de_categorias.add(umCategoria);
                                quantidadeCategoria --;
                                categoriaNumeroControle ++;

                                System.out.println("\nCategoria cadastrada com sucesso!");
                            }
                        }
                        else {
                            System.out.println("\nJá cadastrou o número total de categorias.");
                        }
                    }
                    else if(opcaoSubMenu == 2) {
                        if(lista_de_categorias.isEmpty() == false) {
                            System.out.println("\nCadastramento de Produto");
                            produtoNome = Console1.readLine("Nome do Produto: ");
                            produtoPreco = Console1.readDouble("Preço do Produto: ");
                            categoriaNumero = Console1.readInt("Número da Categoria: ");

                            for(i = 0; i < lista_de_categorias.size(); ++i) {
                                umCategoria = lista_de_categorias.get(i);
                                if (umCategoria.getNumero() == categoriaNumero) {
                                    achouValor = true;
                                    break;
                                }
                            }

                            if(achouValor) {
                                System.out.println("\nTipos de Produto");
                                System.out.println("1 - Produto Continuo.");
                                System.out.println("2 - Produto Emergencial.");

                                opcaoTipoProduto = Console1.readInt("\nDigite o número (1 à 2) correspondente ao tipo de produto: ");
                            }
                        }


                    }
                    else {
                        System.out.println("\nNúmero digitado não corresponde as opções do menu!");
                    }
            }
        }

    }
}
