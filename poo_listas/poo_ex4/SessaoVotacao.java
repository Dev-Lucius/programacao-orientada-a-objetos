public class SessaoVotacao {

    private int votacao = 0;
    int totalSim = 0;
    int totalNao = 0;

    // Começa a Votação
    boolean condicao;
    public boolean abrir(){
        condicao = true;
        return condicao;
    }

    public boolean fechar(){
        condicao = false;
        return condicao;
    }

    public void votarSim(){
        if(condicao){
            votacao = votacao + 1;
            totalSim++;
        }
    }

    public void votarNao(){
        System.out.println("ignorado");
        totalNao++;
    }

    public int total(){
        return votacao;
    }

    public int sim() {
        return totalSim;
    }

    public int nao() {
        return totalNao;
    }

    public boolean estaAberta(){
        return condicao;
    }
}
