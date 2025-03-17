public class operadores {
    
    public static void main(String[] args) {
        
       String nomeComcatenado = "linguagem" + "java"; //concatenação é feita com o operador +   
       System.out.println(nomeComcatenado);



       String nomeNumero = "linguagem" + 1; //quando um dos valores é uma string, o operador + é interpretado como concatenação
         System.out.println(nomeNumero);

       String concatenacao = "?";  

       concatenacao = 1+"1"+1+1;
         System.out.println(concatenacao); //aqui o operador + é interpretado como concatenação

       concatenacao = 1+1+"1"+1;
         System.out.println(concatenacao);  //aqui o operador + é interpretado como soma

       concatenacao = 1+"1"+1+"1";
         System.out.println(concatenacao); //aqui o operador + é interpretado como concatenação
         
       concatenacao = "1"+(1+1+1); //usando parenteses para forçar a soma
         System.out.println(concatenacao);  

      //operadores unários.

       int numero = 10;

       numero = -numero; //inverte o sinal
         System.out.println(numero);

       numero = +numero; //não faz nada
         System.out.println(numero);
         
       numero = numero * -1; //inverte o sinal para positivo
         System.out.println(numero);  

      //usando o operador ++
         
       int numero1 = 10;
       
       // ++numero1; //aumenta o valor de numero1 em 1
         System.out.println(numero1++); //imprime o valor de numero1 e depois aumenta o valor em 1

         System.out.println(++numero1); //aumenta o valor de numero1 em 1 e depois imprime o valor

       //usando condições com o operador ternário ?:
       //exemplo usando if e else
        int a = 10;
        int b = 20;

        String resultado = "";
        if (a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        System.out.println(resultado);
      //exemplo usando operador ternário  
       int c = 3;
       int d = 2;
         

       String resultado1 = (c == d) ? "verdadeiro" : "falso";
        System.out.println(resultado1);
        

      //operadores logicos
      //  > maior < menor >= maior ou igual <= menor ou igual == igual != diferente
      int numero2 = 10;
      int numero3 = 20;

      boolean simNao = numero2 == numero3;
        System.out.println("o numero2 é igual o numero3 ? " + simNao);

      simNao = numero2 != numero3;
        System.out.println("o numero2 é diferente do numero3 ? " + simNao);
        
      simNao = numero2 > numero3;
        System.out.println("o numero2 é maior que o numero3 ? " + simNao);
        
      String nome1 = "java";
      String nome2 = "java";
      
        System.out.println(nome1  == nome2);  //também é possivel comparar strings com o operador == 
        System.out.println(nome1.equals(nome2)); //para comparar strings é melhor usar o método equals

      //operadores condicionais
      // && e || ou
      boolean verdadeiro = true;
      boolean falso = false;    

      if (verdadeiro && falso){
      System.out.println("as duas condicoes são verdadeiras ");
      }

      if (verdadeiro || falso){
        System.out.println("uma das condições é verdadeira");

      }

    }

    }

