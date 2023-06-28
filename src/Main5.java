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

    }
}
