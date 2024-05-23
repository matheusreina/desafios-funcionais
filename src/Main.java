import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        StreamEstudo.ordemCrescente(numeros);
        StreamEstudo.somaPar(numeros);
        StreamEstudo.isPositive(numeros);
        StreamEstudo.soPar(numeros);
        StreamEstudo.mediaMaiorQue5(numeros);
        StreamEstudo.existeMaiorQue10(numeros);
        StreamEstudo.segundoMaior(numeros);
        StreamEstudo.somaDigitos(numeros);
        StreamEstudo.verificarRepeticao(numeros);
        StreamEstudo.juntarValores(numeros);
        StreamEstudo.somaDosQuadrados(numeros);
        StreamEstudo.produtoLista(numeros);
    }
}