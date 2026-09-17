import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Leitor = new Scanner(System.in);
        ArrayList<Pedido> pedidos = new ArrayList<>();

        Pedido p1 = new Pedido(1, "joão",
                "lapis", 1.99);

        pedidos.add(p1);

        while (true) {

        System.out.println("=== SISTEMA DE PEDIDOS ===");
        System.out.println("1 - Criar pedido");
        System.out.println("2 - Listar todos os pedidos");
        System.out.println("3 - Atualizar status do pedido");
        System.out.println("4 - Remover pedido");
        System.out.println("5 - Listar pedidos de um cliente específico");
        System.out.println("6 - Listar apenas pedidos pendentes");
        System.out.println("7 - Mostar valor total de todos os pedidos");
        System.out.println("8 - Sair");

        System.out.println("Escolha uma opção");
        int opção = Leitor.nextInt();
        Leitor.nextLine();


            if (opção == 1) {
                System.out.println("Você escolheu Criar um pedido!");

                System.out.println("Qual o código do pedido?");
                int codReceb = Leitor.nextInt();
                Leitor.nextLine();

                System.out.println("Qual o seu nome?");
                String nomeReceb = Leitor.nextLine();

                System.out.println("Qual a descrição do produto?");
                String descReceb = Leitor.nextLine();

                System.out.println("Qual o valor do produto?");
                double valorReceb = Leitor.nextDouble();
                Leitor.nextLine();

                Pedido pedido1 = new Pedido(codReceb, nomeReceb, descReceb, valorReceb);

                pedidos.add(pedido1);

                System.out.println("Pedido criado com sucesso!");

            } else if (opção == 2) {
                System.out.println("Você escolheu listar todos os pedidos");

                if (pedidos.size() == 0) {
                    System.out.println("Lista de pedidos vazia!");
                } else {
                    for (int i = 0; i < pedidos.size(); i++) {

                        pedidos.get(i).mostrar();
                    }
                }


            } else if (opção == 3) {
                System.out.println("Você escolheu atualizar!");

                System.out.println("Qual o código do pedido que deseja atualizar?");
                int codigo = Leitor.nextInt();
                Leitor.nextLine();

                boolean encontrado = false;
                for (int i = 0; i < pedidos.size(); i++) {
                    if (pedidos.get(i).getCodigo() == codigo) {
                        encontrado = true;

                        System.out.println("Qual o novo status do seu pedido?");
                        String novoStatus = Leitor.nextLine();

                        pedidos.get(i).setStatus(novoStatus);

                        break;
                    }

                }

                if (!encontrado) {
                    System.out.println("Pedido não encontrado.");
                }

            } else if (opção == 4) {
                System.out.println("Você escolheu remover um pedido!");

                System.out.println("Qual código do pedido para remover?");
                int codigo = Leitor.nextInt();
                Leitor.nextLine();

                boolean encontrado = false;
                for (int i = 0; i < pedidos.size(); i++) {
                    if (pedidos.get(i).getCodigo() == codigo) {
                        encontrado = true;

                        pedidos.remove(i);

                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Pedido não encontrado.");
                }
            } else if (opção == 5) {
                System.out.println("Você escolheu mostar os pedidos de um cliente!");

                System.out.println("Qual o nome do cliente?");
                String nome = Leitor.nextLine();

                int cont = 0;

                for (int i = 0; i < pedidos.size(); i++) {
                    if (pedidos.get(i).getNomeCliente().equals(nome)) {

                        pedidos.get(i).mostrar();
                        cont = cont + 1;

                    }
                }
                if (cont == 0) {
                    System.out.println("Nenhum pedido encontrado para esse cliente.");
                }

            } else if (opção == 6) {
                System.out.println("Você escolheu listar pedidos pendentes");

                int cont = 0;
                for (int i = 0; i < pedidos.size(); i++) {
                    if (pedidos.get(i).getStatus().equals("Pendente")) {

                        pedidos.get(i).mostrar();
                        cont = cont + 1;

                    }
                }
                if (cont == 0) {
                    System.out.println("Não existe pedidos pendentes.");
                }

            } else if (opção == 7) {
                System.out.println("Você escolheu ver o valor total de todos os pedidos!");

                double soma = 0;
                for (int i = 0; i < pedidos.size(); i++) {
                    soma = soma + pedidos.get(i).getValor();

                }
                System.out.println("O valor total de todos os pedidos é de: R$" + soma);

            } else if (opção == 8) {
                break;

            }
        }
    }
}























