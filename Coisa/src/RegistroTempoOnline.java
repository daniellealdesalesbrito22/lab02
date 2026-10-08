public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoInvestidoOnline;
    private int tempoEsperado;

    public RegistroTempoOnline(String disciplina, int tempoEsperado) {
        this.nomeDisciplina = disciplina;
        this.tempoEsperado = tempoEsperado;
        this.tempoInvestidoOnline = 0;
    }

    public RegistroTempoOnline(String disciplina) {
        this.nomeDisciplina = disciplina;
        this.tempoEsperado = 120;
        this.tempoInvestidoOnline = 0;
    }

    public void adicionaTempoOnline(int tempo) {
        this.tempoInvestidoOnline += tempo;
    }

    public boolean atingiuMetaTempoOnline() {
        if (this.tempoInvestidoOnline >= tempoEsperado) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.nomeDisciplina + " " + this.tempoInvestidoOnline + "/" + tempoEsperado;
    }
}
