package list;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramA {
    public static void main(String[] args) {

       List<String> list = new ArrayList<>();

       list.add("Vinicius");
       list.add("Joao");
       list.add("Ajkz");
       list.add("Marcus");
       list.add("Saint-Laurein");
       list.add(2, "Saint-Laurein");

        System.out.println("Tamanho: "+ list.size());

        list.removeIf(x -> x.charAt(0) == 'M');  // função LAMBDA para remover um predicado, nesse caso, começando com M
       for (String x : list){
            System.out.println(x);
       }
       System.out.println("------------");
       System.out.println("Index of Bob" + list.indexOf("Bob")); // identificar posição do elemento com indexof.
        System.out.println("----------------");

        List <String> result = list.stream().filter(x -> x.charAt(0) == 'V').collect(Collectors.toList());
            // converter pra STREAM, operação lambda pra imprimir começando com a letra V, voltar pra lista com collect.

        for (String x : result){
            System.out.println(x);
        }
        System.out.println("------------");
        String name = list.stream().filter(x->x.charAt(0) == 'A').findFirst().orElse(null); //encontrar o primeiro elemento que começe com A
        System.out.println(name);

    }
}
