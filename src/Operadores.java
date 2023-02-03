public class Operadores {
    public static void main(String[] args) {
        System.out.println("Hello, Sr Wick!");

        String nomeUm = "Jeferson";
        String nomeDois= "Jeferson";
        System.out.println(nomeUm == nomeDois);

        // comparando objetos
        String pessoa1 = "Jeferson";
        String pessoa2 = new String("Jeferson");
        System.out.println(pessoa1.equals(pessoa2)); 

        String nome1 = "Linguagem " + "Java";
        System.out.println(nome1);

        // transformando em negativo forma 1
        int numero = 5;
        System.out.println( - numero);

        // transformando em negativo forma 2
        numero = - numero;
        System.out.println(numero);

        //transformando em positivo
        numero = numero * - 1;
        System.out.println(numero);

        System.out.println("[////////////////////////]");
        // x repetição
        int numero1 = 7;

        numero1 = numero1 + 2;
        //numero1++;
        System.out.println(++ numero1);
        System.out.println(numero);
 
        boolean  variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);

        variavel = !variavel;

        System.out.println(variavel);

        System.out.println("[//////////////////////////]");
        //operador ternario

        int a, b;
        a = 6;
        b = 5;

        //jeito 1
        String resultado = "";
        if(a == b){
            resultado = "Verdadeiro";
        }else{
            resultado = "falso";
        }
        System.out.println(resultado);

        //jeito 2
        String resultado2 = a==b?"Verdadeiro" : "falso";
        int result = a == b ? 1 : 0;
        System.out.println(resultado2);
        System.out.println(result);

        System.out.println("[//////////////////////////]");

        int num1 = 1;
        int num2 = 2;

        boolean simNao = num1 == num2;
        if(num1 < num2){ // verdadeira
            System.out.println("Condição verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = num1 != num2;

        System.out.println("Num1 é diferente de num2? " + simNao);

        simNao = num1 > num2;

        System.out.println("Num1 é maior que num2? " + simNao);
        

        System.out.println("[//////////////////////////]");

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        }else{
            System.out.println("fim");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }else{
            System.out.println("fim");
        }




 

    }
}
