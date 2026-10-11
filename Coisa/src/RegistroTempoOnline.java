/**
 * Classe destinada ao monitoramento do tempo gastado estudando online em uma disciplina
 *
 * @author Daniel Leal
 */
public class RegistroTempoOnline {
    /**
     * o nome da disciplina
     */
    private String nomeDisciplina;
    /**
     * o tempo investido no estudo online da disciplina
     */
    private int tempoInvestidoOnline;
    /**
     * o tempo de estudo cumulativo a ser atingido pelo aluno
     */
    private int tempoEsperado;

    /**
     * Constrói um objeto para registar o tempo investido online pelo aluno em uma disciplina
     *
     * @param nomeDisciplina o nome da disciplina
     * @param tempoEsperado o tempo de estudo cumulativo a ser atingido pelo aluno
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = tempoEsperado;
        this.tempoInvestidoOnline = 0;
    }

    /**
     * Constrói um objeto para registar o tempo investido online pelo aluno em uma disciplina usando
     * o tempo esperado padrão
     *
     * @param nomeDisciplina o nome da disciplina
     */
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = 120;
        this.tempoInvestidoOnline = 0;
    }

    /**
     * Registra tempo online investido pelo aluno em uma disciplina
     *
     * @param tempo tempo investido pelo aluno
     */
    public void adicionaTempoOnline(int tempo) {
        this.tempoInvestidoOnline += tempo;
    }

    /**
     * Retorna o valor verdadeiro caso o aluno tenha atingido o tempo online esperado a ser
     * investido na disciplina
     *
     * @return verdadeiro caso a meta tenha sido alcançada e falso caso contrário
     */
    public boolean atingiuMetaTempoOnline() {
        if (this.tempoInvestidoOnline >= tempoEsperado) {
            return true;
        }
        return false;
    }

    /**
     * Representação textual do tempo esperado e investido, juntamente ao nome de certa disciplina
     *
     * @return o nome, o tempo investido e o tempo esperado a ser atingido em uma disciplina
     */
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoInvestidoOnline + "/" + tempoEsperado;
    }

}