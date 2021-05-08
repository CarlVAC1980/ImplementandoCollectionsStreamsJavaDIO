package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main (String[] args) {

        //List permite criar uma lista
        List<String> nomes = new ArrayList<>();

        //.add adiciona um item a uma lista
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        //.set permite manipular um item da lista
        nomes.set(2, "Larissa");

        //System.out.println permite 'imprimir' o resultado do codigo no terminal/tela
        System.out.println(nomes);

        //Permite uma ordenação simplescomo texto
        Collections.sort(nomes);

        nomes.set(2, "Wesley");

        System.out.println(nomes);

        //.remove permite remover um item da lista por meio do indice ou do objeto
        nomes.remove(4);

        System.out.println(nomes);

        nomes.remove("Wesley");

        System.out.println(nomes);

        //.get permite retornar uma variavel par ao indice pedido
        String nome = nomes.get(1);

        System.out.println(nome);

        //.indexOf retorna a posição de um item da lista
        int posicao = nomes.indexOf("Carlos");

        System.out.println(posicao);

        //.size retorna um numero inteiro informando quantos itens tem na lista
        int tamanho = nomes.size();

        System.out.println(tamanho);

        nomes.remove("Larissa");

        System.out.println(nomes);

        /*Como já havia informado o tipo da variavel não há necessidade de informar novamente,
         a não ser que ocorra uma mudança n tipo, mas para isso tem um procedimento apropriado.*/
        tamanho = nomes.size();

        System.out.println(tamanho);

        //.contains retorna se há um elemento na ista
        boolean temAnderson = nomes.contains("Anderson");

        System.out.println(temAnderson);

        boolean temFernando = nomes.contains("Fernando");

        System.out.println(temFernando);

        //.isEmpty retorna um booleano caso a lista estaja vazia ou cheia
        boolean listaEstaVAzia = nomes.isEmpty();

        System.out.println(listaEstaVAzia);

        //for é utilizado para navegar entre as posições de uma lista, array ou qualquer outra collction
        for (String nomeDoItem: nomes) {
            System.out.println("--> " + nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();
        //iterator.hasNext retorna um booleano sempre que existir mais um objeto ele retorna true
        while(iterator.hasNext()) {
            //o metoro .next retorna o objeto que esta iterando naquele momento
            System.out.println("---> " + iterator.next());
        }

        //.clear limpa a lista por completo
        nomes.clear();

        listaEstaVAzia = nomes.isEmpty();

        System.out.println(listaEstaVAzia);


    }
}
