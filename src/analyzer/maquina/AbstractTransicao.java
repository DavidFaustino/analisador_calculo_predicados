package analyzer.maquina;

public abstract class AbstractTransicao {
    protected Estado proximo;
    protected boolean criaToken;

    public AbstractTransicao(Estado proximo, boolean criaToken) {
        super();
        this.proximo = proximo;
        this.criaToken = criaToken;
    }

    public Estado getProximo() {
        return proximo;
    }

    public void setProximo(Estado proximo) {
        this.proximo = proximo;
    }

    public boolean isCriaToken() {
        return criaToken;
    }

    public void setCriaToken(boolean criaToken) {
        this.criaToken = criaToken;
    }

    public abstract Estado transitar(Fita fita, String espaco);
}
