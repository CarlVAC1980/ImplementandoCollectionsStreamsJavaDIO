package one.digitalinnovation.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args){

        /* - Implementações
                -java.util.HasSet
                -java.util.TreeSet
                -java.util.LinkeHashSet
            - Por padrão, não garante ordem
            - Não permite itens repetidos
            - Permite adição e remoção nomralmente.
            Não possui busca por item e atualização.
            Para leitura, apenas navegação.
            - Não permite mudança de ordenação
         */

        Set<Double> notasAlunos = new HashSet<>();

        // Adiciona as notas no set
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        System.out.println(notasAlunos);

        System.out.println("-------------------------");

        // Remove a nota do set
        notasAlunos.remove(3.8);

        System.out.println(notasAlunos);

        System.out.println("-------------------------");

        // Retorna a quantidade de itens do set
        System.out.println(notasAlunos.size());

        System.out.println("-------------------------");

        // Navega em todos os itens do iterator
        Iterator<Double> iterator = notasAlunos.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Double nota: notasAlunos) {
            System.out.println("--> " + nota);
        }

        notasAlunos.clear();

        System.out.println(notasAlunos.isEmpty());
    }
}
