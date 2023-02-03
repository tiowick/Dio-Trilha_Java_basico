public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Sr Wick!");
        // tipos primitivos
        //classes String que representam um texto na aplicação

        byte idade = 123;
        short ano = 2023;
        int cep = 21070333; // se começar com zero
        long cpf = 9876543219L;
        //float pi = 3.14F; 
        double salarioMinimo  = 2.500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //adaptando o casting

        int numero = 5;

        numero = 10;
        System.out.println("Este número agora é " + numero);

        final double VALOR_DE_PI = 3.14; // Não pode ser alterada


    }
}
