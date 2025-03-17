public class tiposVariaveis {
    public static void main(String[] args) throws Exception {
    //tipos primitivos
        byte numeroPequeno = 127; // 8 bits    
        short numeroCurto =1;   // 16 bits
        int numeroNormal = numeroCurto;     // 32 bits      
        long numeroGrande = numeroNormal;   // 64 bit
        
        //alterando de uma variavel
        int numero = 5;

         numero = 10;
        System.out.println(numero);
        
    //usando final para declarar uma constante que só pode ser declarada em caixa alta  
        final double VALOR_DE_PI = 3.14;

        
        System.out.println(VALOR_DE_PI);

    }
}
