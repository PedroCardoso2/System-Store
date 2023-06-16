package application;

import entities.Client;
import entities.NewClient;
import entities.PriceProducts;
import entities.Products;
import statusenums.status;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] productsTable = new String[]{
                "MOUSE",
                "GELADEIRA",
                "COMPUTADOR",
                "MOUSEPAD",
                "CARREGADOR",
                "CELULAR",
                "FONE",
                "SSV",
                "RÁDIO",
                "TABLET",
                "ADAPTADOR",
                "CADEIRA-GAMER",
                "MONITOR",
                "ROTIADOR"};


        List<Products> list = new ArrayList<>();

        System.out.println("Bem - vindo");
        System.out.println("Você já é cadastrado (s/n)?");
        char resp = sc.next().charAt(0);
        if (resp == 's'){
            System.out.println("Informe..");
            System.out.println("Nome: ");
            String name = sc.next();
            System.out.println("ID: ");
            Integer holder = sc.nextInt();
            System.out.println("Senha: ");
            Integer password = sc.nextInt();

            Client client = new Client(name, holder, password);
        }else if (resp == 'n'){
            boolean a;
            System.out.println("Informe..");
            System.out.println("Nome: ");
            String name = sc.next();
            System.out.println("ID: ");
            Integer holder = sc.nextInt();
            System.out.println("Senha: ");
            Integer password = sc.nextInt();
            System.out.println("Senha confirmação: ");
            int newPassword = sc.nextInt();
            while(true){
                if (!password.equals(newPassword)){
                    System.out.println("Senha não é compatível ! :C ");
                    System.out.println();
                    System.out.println("Senha confirmação: ");
                    newPassword = sc.nextInt();
                }else {
                    break;
                }
            }
            NewClient client = new NewClient(name, holder, password,newPassword);
        }else {
            System.out.println("Reinicie o sistema, e informe os valores corretos");
        }


        System.out.println();


        System.out.println("Lista de produtos disponiveis: ");
        System.out.println(Arrays.toString(productsTable));

        System.out.println();

        System.out.println("Você deseja algum produto ? (s/n)");
        resp = sc.next().charAt(0);

        if (resp == 's'){
            System.out.println("Quantos ?");
            int n = sc.nextInt();


            for(int i = 1; i <= n; i++){
                System.out.println("Produto " + i + " : ");
                String name = sc.next().toUpperCase();
                System.out.println("Quantidade: ");
                int quantity = sc.nextInt();
                System.out.println("Preço: ");
                double price = sc.nextDouble();
                System.out.println("---------");


                list.add(new Products(name,new PriceProducts(price,quantity)));

            }
        }else if (resp == 'n'){
            System.out.println("Sistema Finalizado !");

            System.out.println("Você não inseriu nada no seu Carrinho.....");
        }else {
            System.out.println("Reinicie o sistema, e informe os valores corretos");
        }

        System.out.println(status.PROCESSADO);
        System.out.println("Deseja remover ? (s/n)");
        char c = sc.next().charAt(0);

        int position = -1;

        if(c == 's'){
            System.out.println("Digite o nome do produto: ");
            String nameProduct = sc.next().toUpperCase();

            for (int i = 0; i < list.size(); i++){
                if (list.get(i).getName().equals(nameProduct)){
                    position = i;
                    list.remove(i);
                    break;
                }
            }
        }




        System.out.println("Lista atualizada: ");
        double sum = 0.0;


        for (Products products : list){
            System.out.println(products);
            System.out.println("---------");

            sum += products.getPriceProducts().valueAmount();
        }

        System.out.println("Valor total das Compras: ");
        System.out.println("$ "+ sum);
        System.out.println(status.ENVIADO + " : " +status.FINALIZADO);


    }
}
