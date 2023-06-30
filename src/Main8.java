import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        //Scanner
        System.out.println("|--------------------------------|");
        System.out.println("|       BEM VINDO A OWSE         |");
        System.out.println("|--------------------------------|");
        System.out.println("|     Cadastro de Usuarios       |");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = scanner.nextLine();
        System.out.println("Oláa " + nome + " para coninuar digita as seguintes informações:");

        System.out.println("data de nascimento:?");
        String data = scanner.nextLine();
        System.out.println("seu endeereco:?");
        String endereco = scanner.nextLine();
        System.out.println();

        System.out.println("|--------------------------------|");
        System.out.println("| Cadastro realizado com sucesso |");
        System.out.println("|--------------------------------|");
        System.out.println("| Nome:" +nome + "               |");
        System.out.println("| data:" +data + "               |");
        System.out.println("| Endereço:" +endereco + "       |");
        System.out.println("|________________________________|");

    }
}
