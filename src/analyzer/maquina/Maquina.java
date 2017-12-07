package analyzer.maquina;

public class Maquina {
    private String nome;
    private Estado estadoInicial;

    public Maquina(String nome) {
        super();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstadoInicial() {
        return estadoInicial;
    }

    public void setEstadoInicial(Estado estadoInicial) {
        this.estadoInicial = estadoInicial;
    }

    @Override
    public String toString() {
        return "{\"nome\":\"" + nome + ", \"estadoInicial\":\""
                + estadoInicial + "}";
    }

    boolean aceita(Fita fita, String espaco) {
        System.out.println(espaco + "[TRANSICAO POR MAQUINA] Maquina: " + nome);
        boolean transitou = this.estadoInicial.transitar(fita, espaco + "\t");
        System.out.println(espaco + "[TRANSICAO POR MAQUINA] Maquina: " + nome + " transitou: " + transitou);
        return transitou;
    }
}
