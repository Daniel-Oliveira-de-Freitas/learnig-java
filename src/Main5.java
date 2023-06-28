import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        String sexo = "Masculino";

        //Em vez de escrever muitas if..else instruções, você pode usar a switch instrução.
        if (sexo.equals("Feminino")) {
            System.out.println("Eu sou do  sexo feminino if");

        } else if (sexo.equals("Masculino")) {
            System.out.println("Eu sou do  sexo masculino if");

        } else if (sexo.equals("Prefiro não informar")) {
            System.out.println("Eu prefiro não informar if");

        }else{

        }

        //A switch expressão é avaliada uma vez.
        //O valor da expressão é comparado com os valores de cada um case.
        //Se houver uma correspondência, o bloco de código associado será executado.
        //As palavras-chave breake defaultsão opcionais e serão descritas mais adiante neste capítulo

        switch (sexo){
            case "Feminino":
                System.out.println("Eu sou do  sexo feminino switch");
                break;
            case "Masculino":
                System.out.println("Eu sou do  sexo masculino switch");
                break;
            case "Prefiro não informar":
                System.out.println("Eu prefiro não informar switch");
                break;
            default:
                break;
        }


        // Arrays são usados ​​para armazenar vários valores em uma única variável,
        // em vez de declarar variáveis separadas para cada valor.
        //Para declarar um array, defina o tipo de variável com colchetes :
        int zero = 0;
        int um = 1;

        int [] n = new int[3];
        System.out.println("\nArrays");
        System.out.println(Arrays.toString(n));

        System.out.println("\n");
        boolean [] num = new boolean[2];
        System.out.println(Arrays.toString(num));

        System.out.println("\n");
        n [0] = 0;
        n [1] = 1;
        n [2] = 2;
        System.out.println(Arrays.toString(n));

        // Forma simplificada e passar o array
        int [] numeros = {4,1,14,9,5,12};
        String [] nome = {"D","a","n","i","e","l"};
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(nome));
        System.out.println(numeros.length);
        System.out.println(nome.length);

        // arrays index
        String d = nome[0];
        String e = nome[4];
        int x = numeros[3];
        int y = numeros[5];
        System.out.println(d);
        System.out.println(e);
        System.out.println(x);
        System.out.println(y);

    }
}
