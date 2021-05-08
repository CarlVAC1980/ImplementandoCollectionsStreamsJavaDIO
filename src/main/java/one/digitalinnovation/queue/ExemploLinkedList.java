package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    
    public static void main(String[] args) {
        
        /* - Implementação que aprendemos - java.util.LinkedList
           - Garante oredem de inserção
           - Permite adição, leitura e remoção considerando a regra básica de uma fila:
                "Primeiro que entra, primeiro que sai."
           - Não permite mudança de ordenação
         */

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);
        //.poll() retorna e remove o primeiro elemento da filacaso vazia ele retorna null
        String clienteASerAtendida = filaBanco.poll();

        System.out.println(clienteASerAtendida);

        System.out.println(filaBanco);

        String primeiroCleinte = filaBanco.peek();

        System.out.println(primeiroCleinte);

        System.out.println(filaBanco);

        //filaBanco.clear();

        String primeiroClienteOuErro = filaBanco.element();

        System.out.println(primeiroClienteOuErro);

        System.out.println(filaBanco);

        for (String client: filaBanco) {
            System.out.println(client);
        }

        Iterator<String> iteatorFilaBanco = filaBanco.iterator();

        while(iteatorFilaBanco.hasNext()) {
            System.out.println("---> " + iteatorFilaBanco.next());
        }

        System.out.println(filaBanco.size());

        System.out.println(filaBanco.isEmpty());


    }
}
