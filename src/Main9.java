
//Um método é um bloco de código que só é executado quando é chamado.
//Você pode passar dados, conhecidos como parâmetros, para um método.
//Os métodos são usados para executar determinadas ações e também são conhecidos como funções .
//Por que usar métodos? Para reutilizar o código: defina o código uma vez e use-o várias vezes.
//Um método deve ser declarado dentro de uma classe. É definido com o nome do método, seguido de parênteses () .
// Java fornece alguns métodos predefinidos, como System.out.println(), mas você também pode criar seus próprios
// métodos para executar determinadas ações:

import java.util.Arrays;

public class Main9 {
        static void myMethod() {
            System.out.println("Hello");
            String brand = "Sansung";
            System.out.println(brand.toUpperCase());
            System.out.println(brand.startsWith("S"));
            System.out.println(brand.endsWith("g"));

        }

        static void myMethod2() {
            char[] letras = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
            int count = contOcorrencias(letras);
            System.out.println(count);
        }

        public static int contOcorrencias(char [] letras){
            System.out.println("O metodo ocorrencias foi invocado");
            System.out.println(Arrays.toString(letras));
            return 0;
        }

        public static void main(String[] args) {
            myMethod();
            myMethod2();
        }
    }

