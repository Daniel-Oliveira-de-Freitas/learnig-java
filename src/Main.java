import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Em Java, nós temos tipos de variaveis:
        //String; char; byte; short; int; long; boolean; float; double;
        // alguns exemplos
        String hw = "Hello World! ";
        char a = 'a'; byte b = 127;
        int i = 20; long l = 30; boolean t = true; float f = 12.6F; double d = 13.5;
        System.out.println(hw +"-"+ b +"-"+ i +"-"+ l +"-"+ t +"-"+ f +"-"+ d +"-"+ a);
        System.out.println(hw.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now);

        // mostrando um exemplo entre a diferença entre os
        // tipos primitivos e tipos de referência
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

        // O Java não possui uma classe Date integrada, mas podemos importar o java.time
        // pacote para trabalhar com a API de data e hora. O pacote inclui muitas
        // classes de data e hora. Por exemplo:
        Date date = new Date();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(date);
        System.out.println(localDate);
        System.out.println(localDateTime);

        //alguns exemplos de palavras reservadas que não podem ser usadas como variaveis
        //int void = 1;
        //int final = 1;
        //String class = "Class";
        // boolean assert = "true";
        // float else = 3.3;

        //operações aritimeticas
        int s1 = 10; int s2 = 2;
        int adicao = s1 + s2;
        System.out.println("O resultado da soma é: " +adicao);
        //Embora o +operador seja frequentemente usado para somar dois valores, como no exemplo acima,
        // ele também pode ser usado para somar uma variável e um valor, ou uma variável e outra variável:
        int soma1 = 35 + 15;
        int soma2 = soma1 + 72;
        int soma3 = soma2 + soma2;
        int soma4 = soma3 + 176;
        System.out.println("O resultado da soma é: " + soma4);

        // Outros operadores aritméticos quesão usados para realizar operações comuns.
        // Subtração
        int ss1 = 10; int ss2 = 2;
        int sub = ss1 - ss2;
        System.out.println("O resultado da subtração é: " + sub);
        int sub1 = 37 - 15;
        int sub2 = sub1 - 7;
        int sub3 = sub1 - sub2;
        int sub4 = sub3 - 6;
        System.out.println("O resultado da subtração é: " + sub4);

        // Multiplicação
        int m1 = 25; int m2 = 5;
        int mult = m1 * m2;
        System.out.println("O resultado da multiplicação é: " + mult);
        int mult1 = 7 * 5;
        int mult2 = mult1 * 7;
        int mult3 = mult1 * mult2;
        int mult4 = mult3 * 6;
        System.out.println("O resultado da multiplicação é: " + mult4);

    }

    static class Person{
        String name;
        Person(String name){
            this.name = name;
        }
    }
}