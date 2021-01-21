package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramListas {

    public static void main(String[] args) {

        //Listas não aceitam tipos primitivos, usar String, Integer, Double, etc
        List<String> list = new ArrayList<>();// List é uma interface e não classe, sendo assim
                                              // precisa de uma classe q a implemente
                                              // aqui usamos a classe ArrayList
        list.add("Maria"); // adiciona um item a lista
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");
        System.out.println(list.size()); // imprime o tamanho da lista
        for (String x : list) { // percorre a lista adicionando os elementos na variavel X
            System.out.println(x);
        }
        System.out.println("---------------------");
        // list.remove --> remove itens da lista
        list.removeIf(x -> x.charAt(0) == 'M'); // remove todos os itens q começam com M da lista
        for (String x : list) {
            System.out.println(x);
        }

        // indexOf encontra a posição q o elemento esta na lista
        System.out.println("---------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("---------------------");

        // para filtrar os elementos da lista, converte a lista em stream,
        // faz a operação de filtragem
        // depois converte novamente para lista
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        //mesmo caso de cima, porem utilizando o findFirst para encontar o primeiro elemento
        // conforme a expressão de filtragem e .orElse(null) para retornar Null caso não
        // encontre nenhum elemento que atenda o filtro
        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}
