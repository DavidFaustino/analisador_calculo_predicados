package analyzer.maquina;

/**
 *
 */
public class Fita {
    private String fita;
    private int posicaoCabeca;
    private String consumido;

    public Fita(String fita) {
        super();
        this.fita = fita;
        posicaoCabeca = 0;
    }

    public String getFita() {
        return fita;
    }

    public void setFita(String fita) {
        this.fita = fita;
    }

    public int getPosicaoCabeca() {
        return posicaoCabeca;
    }

    public void setPosicaoCabeca(int cabeca) {
        this.posicaoCabeca = cabeca;
        this.consumido = fita.substring(posicaoCabeca - 1, posicaoCabeca);
    }

    String getConsumido() {
        return consumido;
    }

    public void setConsumido(String consumido) {
        this.consumido = consumido;
    }

    void consumir() {
        if (fita.length() == posicaoCabeca) {
            System.out.println("***FIM DE FITA***");
            consumido = null;
        } else {
            consumido = fita.substring(posicaoCabeca, posicaoCabeca + 1);
            posicaoCabeca++;
            System.out.println("Foi consumido o simbolo " + consumido);
        }
    }

    @Override
    public String toString() {
        return "posicao: " + posicaoCabeca + " consumido:" + consumido;
    }

    public void retrocedeUm() {
        System.out.println("RETROCEDEU UM");
        if (posicaoCabeca > 0) {
            posicaoCabeca--;
            consumido = fita.substring(posicaoCabeca, posicaoCabeca + 1);
        }
    }
}