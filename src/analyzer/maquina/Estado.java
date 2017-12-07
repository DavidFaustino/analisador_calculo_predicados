package analyzer.maquina;

import java.util.ArrayList;
import java.util.List;

public class Estado {
    private String nome;
    private List<AbstractTransicao> transicoes;
    private boolean ehInicial;
    private boolean ehFinal;

    public Estado(String nome, boolean ehInicial, boolean ehFinal) {
        super();
        this.nome = nome;
        this.ehInicial = ehInicial;
        this.ehFinal = ehFinal;
        transicoes = new ArrayList<AbstractTransicao>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<AbstractTransicao> getTransicoes() {
        return transicoes;
    }

    public void setTransicoes(List<AbstractTransicao> transicoes) {
        this.transicoes = transicoes;
    }

    public boolean isEhInicial() {
        return ehInicial;
    }

    public void setEhInicial(boolean ehInicial) {
        this.ehInicial = ehInicial;
    }

    public boolean isEhFinal() {
        return ehFinal;
    }

    public void setEhFinal(boolean ehFinal) {
        this.ehFinal = ehFinal;
    }

    public void addTransicao(AbstractTransicao transicao) {
        this.transicoes.add(transicao);
    }

    public boolean transitar(Fita fita, String espaco) {
        System.out.println(espaco + "[ESTADO " + nome + "]");
        Estado proximo;
        int posicao = fita.getPosicaoCabeca();
        System.out.println(espaco + "[ESTADO " + nome + "] posicao=" + posicao);

        for (AbstractTransicao transicao : transicoes) {
            proximo = transicao.transitar(fita, espaco + "\t");
            System.out.println(espaco + "[ESTADO " + nome + "] proximo=" + proximo);
            if (proximo != null) {
                fita.consumir();
                System.out.println(espaco + "[ESTADO " + nome + "] caractere consumido=" + fita.getConsumido());
                if (fita.getConsumido() == null) {
                    System.out.println(espaco + "[ESTADO " + nome + "] proximo eh " + (proximo.isEhFinal() ? "final" : "nao eh final"));
                    if (proximo.isEhFinal()) {
                        return true;
                    }
                } else {
                    System.out.println(espaco + "[ESTADO " + nome + "] chamando proximo para transitar");
                    if (proximo.transitar(fita, espaco + "\t")) {
                        return true;
                    }
                }
            }
            System.out.println(espaco + "[ESTADO " + nome + "] voltando a posicao da cabeca de " + fita.getPosicaoCabeca() + " para " + posicao);
            fita.setPosicaoCabeca(posicao);
        }
        System.out.println(espaco + "[ESTADO " + nome + "] retornando se o estado atual eh final: " + ehFinal);

        if (ehFinal && fita.getConsumido() != null) {
            fita.retrocedeUm();
        }
        return ehFinal;
    }

    @Override
    public String toString() {
        return "{\"nome\":\"" + nome + "\", \"ehInicial\":\"" + ehInicial + "\", \"ehFinal\":\"" + ehFinal + "\"}";
    }
}
