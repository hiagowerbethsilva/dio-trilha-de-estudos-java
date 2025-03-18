public class Usuario {

   public static void main(String[] args) throws Exception {

    smartTv smartTv = new smartTv();

   System.out.println("TV LIGADA ?" + smartTv.ligada);
   System.out.println("CANAL ATUAL: " + smartTv.canal);
   System.out.println("VOLUME: " + smartTv.volume);
   
   smartTv.diminuirVolume();
   smartTv.diminuirVolume();
   smartTv.diminuirVolume();
   smartTv.aumentarVolume();

   System.out.println("CANAL ATUAL: " + smartTv.canal);
   smartTv.novoCanal(13);
   System.out.println("NOVO ATUAL: " + smartTv.canal);

   smartTv.ligar();
   System.out.println("Novo Status -> TV LIGADA ?" + smartTv.ligada);

   smartTv.desligar();
   System.out.println("Novo Status -> TV LIGADA ?" + smartTv.ligada);

   }
    
   } 


