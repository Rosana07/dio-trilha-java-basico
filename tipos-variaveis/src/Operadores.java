public class Operadores {

    public static void main(String[] args){
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1); 
        
        System.out.println(concatenacao);

        //operadores unarios 
        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        //incrementar ou decrementar valores, fluxo de repeticao, x repeticao
        int numerodois = 5;

        System.out.println(numerodois ++);

        System.out.println(numerodois);

        int numerotres = 5;

        System.out.println(-- numerotres);

        //converter valores da variavel
        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);

        //condicao ternario, expressao booleana, duas opcoes p/ resultado
        int a, b;
        a = 5;
        b = 6;

        int resultado = a == b ? 1 : 0;

        System.out.println(resultado);

        int c, d;

        c = 7;
        d = 7;

        String resposta = c == d ? "verdadeiro" : "falso";

        System.out.println(resposta);

        //operadores relacionais
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 == numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numeroum é igual a numerodois?" + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroum é diferente a numerodois?" + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroum é maior que numerodois?" + simNao);

        String nomeU = "ROSANA";
        String nomeD = new String("ROSANA");

        System.out.println(nomeU == nomeD);

        String nomeUm = "ROSANA";
        String nomeDois = new String("ROSANA");

        System.out.println(nomeUm.equals(nomeDois));

        String nome1 = "ROSANA";
        String nome2 = "ROSANA";

        System.out.println(nome1 == nome2);

        // operadores logicos, condições , condição da tabela verdade
        boolean condicao1 = true;

        boolean condicao2 = false;

        if (condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        }

        
        if (condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }

        System.out.println("fim");

        boolean condicaoUm = true;

        boolean condicaoDois = true;

        if (condicaoUm && condicaoDois){
            System.out.println("as duas condições são verdadeiras");
        }

        System.out.println("fim");

        if (condicaoUm && (7 > 9)){
            System.out.println("as duas condições são verdadeiras");
        } else {
            System.out.println("uma das condições é false");
        }

        System.out.println("fim");
    }
}
