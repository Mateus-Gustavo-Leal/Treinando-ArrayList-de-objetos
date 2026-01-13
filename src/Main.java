import Produto.Celular;
import Produto.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Celular> Vitrine = new ArrayList<>();
        Celular Iphone = new Celular(128, "iphone", 5000);
        Vitrine.add(Iphone);
        System.out.println(Vitrine);
        Scanner ler = new Scanner(System.in);
        int opcao =1;
        while(opcao != 0){
            System.out.println("Digite 1 para cadastro");
            System.out.println("Digite 2 para Listar");
            System.out.println("Digite 3 para Buscar");
            System.out.println("Digite 4 para Buscar");
            System.out.println("Digite 5 para sair");
            opcao = ler.nextInt();
            ler.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("digite o nome do celular");
                    String nomeDado = ler.nextLine();
                System.out.println("armazenamento");
                int armazenamentoDado = ler.nextInt();
                    System.out.println("digite o Preço");
                    int PreCoDado = ler.nextInt();
                    ler.nextLine();
                    Celular nomeDoCelular = new Celular(armazenamentoDado, nomeDado, PreCoDado);
                    Vitrine.add(nomeDoCelular);
                    break;
                case 2:
                   for (Celular C : Vitrine){
                       C.mostrarDetalhes();
                   }
                    break;
                case 3:
                    System.out.println("Qual Celular deseja ver?");
                    String busca = ler.nextLine();
                    Celular CelularEncontrado = null;
                        for (Celular unidade : Vitrine) {
                            if (unidade.getNome().equalsIgnoreCase(busca)) {
                                CelularEncontrado = unidade;
                                break;
                            }
                        }

                        if (CelularEncontrado != null) {
                            System.out.println("O objeto está na lista");
                            System.out.println(CelularEncontrado);
                            break;
                        } else {
                            System.out.println("O objeto NÃO está na lista");
                            break;    }
                case 4:
                    System.out.println("Qual Celular deseja remover");
                     String REMOVER = ler.nextLine();
                     Celular removerCelular = null;
                     for (Celular unidade : Vitrine){
                        if (unidade.getNome().equalsIgnoreCase(REMOVER)){
                        removerCelular = unidade;
                         break;
                     }
                     }
                        if (removerCelular != null){
                            System.out.println("o Celular for removido");
                            System.out.println(removerCelular);
                            Vitrine.remove(removerCelular);
                        }

                        else {
                            System.out.println("celular não encontrado");
                       } break;
                case 5:
                    System.out.println("Saindo");
                    opcao = 0;
                     }



                             }
                        }
                    }







