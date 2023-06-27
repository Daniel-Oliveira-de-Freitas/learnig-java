public class Main2 {

    public static void main(String[] args){
        // A classe Java Math tem muitos métodos que permitem realizar tarefas matemáticas em números.
        System.out.println(Math.abs(-10));
        System.out.println(Math.max(6, 10));
        System.out.println(Math.min(6, 10));
        System.out.println(Math.pow(5, 2));
        System.out.println((int)Math.pow(5, 2));
        System.out.println(Math.sqrt(25));
        System.out.println((int)Math.sqrt(25));
        System.out.println(Math.PI);


        // Comparação de operadores
        int a = 15;
        int b = 25;
        int c = 25;
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(c == b);
        System.out.println(a != c);
        System.out.println(b != c);
        System.out.println("\n");
        //operadores logicos
        boolean x = false;
        boolean y = true;
        boolean z = true;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(x && x);
        System.out.println(y && y);
        System.out.println((x && y) && z);
        System.out.println((x && y) || z);
        System.out.println(!x +", " + !y);

        System.out.println("\n");
        String name = "Mark";
        System.out.println(10 > 8 || 2<= 2 && x && name.contains("M"));

    }
}
