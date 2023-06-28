public class Main7 {
    public static void main(String[] args) {

        //O whileloop percorre um bloco de código, desde que uma condição especificada seja true:

        int cont = 0;
        int i = 0;
        while (cont <= 10) {
            System.out.println("Contador: "  + cont);
            cont++;

        }
        //O do/whileloop é uma variante do whileloop. Este loop executará o bloco de código uma vez, antes de verificar
        // se a condição é verdadeira, então repetirá o loop enquanto a condição for verdadeira.
        do {
            System.out.println("Contador doWhile: "  + cont);
            cont++;
        } while (cont <= 20);

        int c= 21;
        do {
            System.out.println("Contador do While: "  + c);
            c++;
        } while (c <= 10);

        //O for loop
             for (i = 0; i <= 10; i++) {
            System.out.println("Contador: "  + cont);
            cont++;
        }
    }
}
