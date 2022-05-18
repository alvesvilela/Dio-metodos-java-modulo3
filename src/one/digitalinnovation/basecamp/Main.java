package one.digitalinnovation.basecamp;

public class Main {



    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("My name is Rinaldo and this is my exercise regarding JAVA methods. ");

        // Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 6 );
        Calculadora.subtracao(9, 1.8 );
        Calculadora.multiplicacao(7, 8 );
        Calculadora.divisao(5, 2.5 );

        //Mensagem
        System.out.println("Exercício Mensagem");
        Mensagem.outerMessage(9);
        Mensagem.outerMessage(14 );
        Mensagem.outerMessage(1);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasparcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }

}