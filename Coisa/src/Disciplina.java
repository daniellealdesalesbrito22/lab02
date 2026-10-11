import java.util.Arrays;

/**
 * Representação de uma disciplina e as notas do aluno nela
 *
 * @author Daniel Leal
 */
public class Disciplina {
    /**
     * o nome da disciplina
     */
    private final String nomeDisciplina;
    /**
     * a quantidade de horas usadas pelo aluno para estudar a disciplina
     */
    private int horasEstudo;
    /**
     * as notas do aluno, que, por padrão, são 4
     */
    private final double[] notas;
    /**
     * os pesos de cada nota da disciplina
     */
    private final int[] pesos;


    /**
     * Construtor que cria um objeto para uma disciplina que usa média aritmétrica
     * no cálculo e que tem a quantia padrão de notas
     *
     * @param nomeDisciplina nome da disciplina a ser registrada
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[4];
        this.pesos = new int[4];
        Arrays.fill(this.pesos, 1);
    }

    /**
     * Construtor que cria um objeto para uma disciplina que usa média aritmética
     * no cálculo e que tem uma quantia específica, diferente do padrão, de notas
     *
     * @param nome nome da disciplina a ser registrada
     * @param quantiaNotas a quantidade de notas que a disciplina tem
     */
    public Disciplina(String nome, int quantiaNotas) {
        this.nomeDisciplina = nome;
        this.horasEstudo = 0;
        this.notas = new double[quantiaNotas];
        this.pesos = new int[quantiaNotas];
        Arrays.fill(this.pesos, 1);
    }

    /**
     * Construtor que cria um objeto para uma disciplina que usa média ponderada
     * no cálculo e que tem uma quantia específica, diferente do padrão, de notas
     *
     * @param nome nome da disciplina a ser registrada
     * @param quantiaNotas a quantidade de notas que a disciplina tem
     * @param pesos os pesos de cada nota da disciplina
     */
    public Disciplina(String nome, int quantiaNotas, int[] pesos) {
        this.nomeDisciplina = nome;
        this.horasEstudo = 0;
        this.notas = new double[quantiaNotas];
        this.pesos = pesos;
    }

    /**
     * Acrescenta horas gastadas no estudo da disciplina ao contador de horas de estudo
     *
     * @param horas quantia de horas destinadas ao estudo da disciplina
     */
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    /**
     * Substitui o valor de uma das notas do aluno por outro valor
     *
     * @param nota a nota a ser alterada, escolhida no formato X onde cada nota é numerada
     *             de acordo com sua posição
     * @param valorNota o novo valor que será atribuído à nota escolhida
     */
    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota-1] = valorNota;
    }

    /**
     * Retorna a média aritmétrica ou ponderada das notas do aluno na disciplina
     *
     * @param notas array de notas do aluno na disciplina
     * @param pesos array de pesos das notas da disciplina
     * @return a média ponderada ou aritmética das notas do aluno com base nos pesos das notas
     */
    private double media(double[] notas, int[] pesos) {
        double somaNota = 0;
        int somaPeso = 0;
        for (int i = 0; i < notas.length; i++) {
            somaNota += notas[i] * pesos[i];
            somaPeso += pesos[i];
        }
        return somaNota / somaPeso;
    }

    /**
     * Indica por meio de um valor booleano se o aluno foi aprovado na disciplina
     *
     * @return valor booleano dependendo se a média da Disciplina alcançou um valor maior ou igual
     * a 7.0
     */
    public boolean aprovado() {
        return media(this.notas, this.pesos) >= 7.0;
    }

    /**
     * Representação textual dos valores guardados na disciplina
     *
     * @return um texto com todas as informações guardadas na disciplina
     */
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + " " + media(this.notas, this.pesos) + " " + Arrays.toString(this.notas) + " " + Arrays.toString(this.pesos);
    }
}