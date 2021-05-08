package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioArraysLista {

    public static void main (String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        System.out.println(nomes);

        for (String nomeDoItem: nomes) {
            System.out.println("--> " + nomeDoItem);
        }
        System.out.println("------------------------------------------");
        nomes.set(2, "Roberto");
        System.out.println(nomes);
        System.out.println("------------------------------------------");
        System.out.println(nomes.get(1));
        System.out.println("------------------------------------------");
        nomes.remove(4);
        System.out.println(nomes);
        System.out.println("------------------------------------------");
        nomes.remove("João");
        System.out.println(nomes);
        System.out.println("------------------------------------------");
        int tamanho = nomes.size();
        System.out.println(tamanho);
        System.out.println("------------------------------------------");
        boolean temJuliano = nomes.contains("Juliano");
        System.out.println(temJuliano);
        System.out.println("------------------------------------------");
        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");
        System.out.println(nomes2);
        System.out.println("------------------------------------------");
        nomes.addAll(nomes2);
        System.out.println(nomes);
        System.out.println("------------------------------------------");
        Collections.sort(nomes);
        System.out.println(nomes);
        System.out.println("------------------------------------------");
    }
}
