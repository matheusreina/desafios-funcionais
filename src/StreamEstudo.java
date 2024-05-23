import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamEstudo {

    //Desafio 1 - Mostre a lista na ordem numérica:
    static void ordemCrescente(List<Integer> listaNumerica) {
        //Variavel temporaria só para não ficar muito grande a expressão do System.out
        List<Integer> temp = listaNumerica.stream().sorted().toList();
        System.out.println("Desafio 1: " + temp);
    }

    //Desafio 2 - Imprima a soma dos números pares da lista:
    static void somaPar(List<Integer> listaNumerica) {
        int temp = listaNumerica.stream()
                .filter(a -> a % 2 == 0)
                .reduce(0, Integer::sum);

        System.out.println("Desafio 2: " + temp);
    }

    //Desafio 3 - Verifique se todos os números da lista são positivos:
    static void isPositive(List<Integer> listaNumerica) {
        boolean temp = listaNumerica.stream().allMatch(num -> num > 0);
        System.out.println("Desafio 3: " + temp);
    }

    //Desafio 4 - Remova todos os valores ímpares:
    static void soPar(List<Integer> listaNumerica) {
        List<Integer> temp1 = listaNumerica.stream().filter(n -> n%2 == 0).toList();
        System.out.println("Desafio 4: " + temp1);
    }

    //Desafio 5 - Calcule a média dos números maiores que 5:
    static void mediaMaiorQue5(List<Integer> listaNumerica) {
        long count = listaNumerica.stream().filter(n -> n > 5).count();
        Optional<Integer> temp = listaNumerica.stream().filter(n -> n > 5).reduce(Integer::sum);
        System.out.println("Desafio 5: "+(temp.orElse(0) / count));
    }

    //Desafio 6 - Verificar se a lista contém algum número maior que 10:
    static void existeMaiorQue10(List<Integer> listaNumerica) {
        boolean temp = listaNumerica.stream().anyMatch(numero -> numero > 10);
        System.out.println("Desafio 6: " + temp);
    }

    //Desafio 7 - Encontrar o segundo número maior da lista:
    static void segundoMaior(List<Integer> listaNumerica) {
        Optional<Integer> temp = listaNumerica.stream().sorted().limit(listaNumerica.size() - 1).max(Comparator.naturalOrder());
        System.out.println("Desafio 7: "+temp.orElse(0));
    }

    //Desafio 8 - Somar os dígitos de todos os números da lista:
    static void somaDigitos(List<Integer> listaNumerica) {
        List<String> temp = listaNumerica.stream().map(Object::toString).toList();
        List<String> numString = List.of(temp.stream().reduce((s1, s2) -> s1 + s2).orElse("").split(""));
        int sum = numString.stream().map(Integer::valueOf).reduce(0, Integer::sum);

        System.out.println("Desafio 8: " + sum);
    }

    //Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
    static void verificarRepeticao(List<Integer> listaNumerica) {

        List<Integer> temp = listaNumerica.stream().distinct().toList();
        boolean repetidos = temp.size() == listaNumerica.size();

        String desafio = "Desafio 9: ";
        if (repetidos) {
            desafio += "Não existem repetições!";
        } else {
            desafio += "Existem repetições!";
        }
        System.out.println(desafio);
    }

    //Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
    static void juntarValores(List<Integer> listaNumerica) {
        List<Integer> temp = listaNumerica.stream().filter(num -> num%3==0 || num%5==0).toList();
        System.out.println("Desafio 10: "+ temp);
    }

    //Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
    static void somaDosQuadrados(List<Integer> listaNumerica) {
        List<Integer> temp = listaNumerica.stream().map(num -> num*num).reduce(Integer::sum).stream().toList();
        System.out.println("Desafio 11: "+ temp);
    }

    //Desafio 12 - Encontre o produto de todos os números da lista:
    static void produtoLista(List<Integer> listaNumerica) {
        int temp = listaNumerica.stream().reduce(0, (num1, num2) -> num1 * num2);

        System.out.println("Desafio 12: "+ temp);
    }

    //Desafio 13 - Filtrar os números que estão dentro de um intervalo:
    static void filtarIntervalo(List<Integer> listaNumerica, long inicio, long fim) {
        List<Integer> intervalo = listaNumerica.stream().sorted().filter(num -> num > inicio && num < fim).toList();


        System.out.println("Desafio 13: "+ intervalo);
    }

}
