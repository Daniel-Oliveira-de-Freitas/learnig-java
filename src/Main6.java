import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        // Loops
        System.out.println("Loop");
        int[] numeros = {-2, 0, 1, 4, 7, 9, 17, 25};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        //Loop ao contrario
        System.out.println("Loop ao contrario");
        for (int i = numeros.length -1; i>=0; i--) {
            System.out.println(numeros[i]);
        }

        //aprimorando o loop com o foreach
        System.out.println("Aprimorando o loop");
        for (int numero : numeros){
            System.out.println(numero);
        }
        Arrays.stream(numeros).forEach(System.out::println);

        String[] nomes= {"Ana","Paula","John","Toshiba","Nagazaki"};
        //Para e   continua
        for (String nome : nomes){
            if (nome.equals("Toshiba")){
                break;
            }
            System.out.println(nome);


        }
        for (String nome : nomes){

            if (nome.startsWith("N")){
                continue;
            }
            System.out.println(nome);
        }

    }
}
