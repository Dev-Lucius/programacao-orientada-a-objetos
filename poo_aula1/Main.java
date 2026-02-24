public class Main{
    public static void main (String[] args){
        // Aula 1 - POO

        // POO tem como foco principal é atingir é a ABSTRAÇÃO
        // Manipular determinados comportamentos do Código
        // Trata-se de Codar para prevenir erros futuros!

        // Ao abstrir um comportamento ele se torna "limpo"
        // Isto é, mais utilizável, testável e afins
        
        // Abstrair um ... Controle E Portão de Garagem
        // - apertar o botao!!
        // - dependendo do estado anterior e estado atual, vai realizar uma ação!!

        /* 
            - estados possíveis
                * Movimento
                * aberto
                * fechado
            - ações possíveis
                * apertar o botao
        */

       // Inicialmente Fechado
       PortaoEletrico portao = new PortaoEletrico();

       boolean aberto = false; // Variável para representar os possíveis estados
       boolean movimento = false; // Variável para representar os possíveis movimentos

       // Uma ideia...
       // String estado = "ABERTO";
       System.out.println("Movimento: " + portao.movimento);
       System.out.println("Aberto: " + portao.aberto);
       
       // Apertar o botão --> Gera uma AÇÃO
       portao.apertarBotao();
       System.out.println("Apertou o Botão...");
       System.out.println("Movimento: " + portao.movimento);
       System.out.println("Aberto: " + portao.aberto);
       // aberto = true;
       // movimento = true;    

       // Depois de um tempo ...
       portao.passouTempo();       
       System.out.println("Passou um Tempo...");

       // botão é apertado novamente...
       portao.apertarBotao();
       System.out.println("Apertou o Botão...");
       System.out.println("Movimento: " + portao.movimento);
       System.out.println("Aberto: " + portao.aberto);
       // movimento = false;

       // Apertou o botão de novo...
       portao.apertarBotao();
       System.out.println("Passou um Tempo...");
       portao.passouTempo();
       // movimento = true;
       // ... Depois de um tempo
       portao.passouTempo();
       // aberto = false;
       // movimento = false;
       System.out.println("Movimento: " + portao.movimento);
       System.out.println("Aberto: " + portao.aberto);

       // Este código é frágil, pois ele possui uma difícil manutenção e reutilização!!
       // Nesse caso, Porque construir uma Classe?
       // Proteger Aquilo que estamos usando e construindo -> Encapsulamento!     
    }
}