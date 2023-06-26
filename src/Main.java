import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Em Java, nós temos tipos de variaveis:
        //String; char; byte; short; int; long; boolean; float; double;
        // alguns exemplos
        String hw = "Hello World! ";
        char a = 'a'; byte b = 127;
        int i = 20; long l = 30; boolean t = true; float f = 12.6F; double d = 13.5;
        Date date = new Date();
        System.out.println(hw +"-"+ b +"-"+ i +"-"+ l +"-"+ t +"-"+ f +"-"+ d +"-"+ a);
        System.out.println(date);
        System.out.println(hw.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now);

        Person john = new Person("John");
        Person yoko = john;
        System.out.println("Antes de mudar o nome");
        System.out.println(john.name +" "+ yoko.name);

        john.name = "John Lennon";
        System.out.println("depois de mudar o nome");
        System.out.println(john.name +" "+ yoko.name);

        yoko.name = "yoko Ono";
        System.out.println("depois de mudar o nome");
        System.out.println(john.name +" "+ yoko.name);

    }

    static class Person{
        String name;
        Person(String name){
            this.name = name;
        }
    }
}