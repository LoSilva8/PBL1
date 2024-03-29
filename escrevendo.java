import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class GeradorLista {
    public List<Integer> gerarLista(int tamanho) {
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            lista.add(random.nextInt(100) + 1);
        }
        return lista;
    }

    public void imprimir(List<Integer> lista) {
        for (int num : lista) {
            System.out.println("Numero: " + num);
            if (num % 3 == 0) {
                System.out.println("eh multiplo de 3");
            }
            if (num % 2 == 0) {
                System.out.println("eh par");
            } else {
                System.out.println("eh impar");
            }
            System.out.println();
        }
    }
}
/* Metodo da aula (Inserir o import java.util.Scanner;)
public class Main {
    public static void main(String[] args) {
        GeradorLista gerador = new GeradorLista();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho da lista: ");
        int tamanho = scanner.nextInt();
        List<Integer> lista = gerador.gerarLista(tamanho);
        gerador.imprimir(lista);
        scanner.close(); */
        
public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Digite o tamanho da lista: ");
            return;
        }
        int tamanho = Integer.parseInt(args[0]);
        GeradorLista gerador = new GeradorLista();
        List<Integer> lista = gerador.gerarLista(tamanho);
        gerador.imprimir(lista);
    }
}
