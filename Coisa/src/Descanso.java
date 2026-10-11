/**
 * Classe destinada ao monitoramento do descanso de um aluno
 *
 * @author Daniel Leal
  */
public class Descanso {
    /**
     * Horas descansadas por um aluno durante uma semana
     */
    private int horasDescanso;
    /**
     * Número de semanas passadas
     */
    private int numeroSemanas;

    /**
     * Constrói um objeto que guarda as horas descansadas e as semanas passadas de um aluno
     */
    public Descanso() {
        this.horasDescanso = 0;
        this.numeroSemanas = 0;
    }

    /**
     * Define a quantidade de horas que o aluno descansou na semana
     *
     * @param horas horas descansadas pelo aluno
     */
    public void defineHorasDescanso(int horas) {
        this.horasDescanso = horas;
    }

    /**
     * Define a quantidade de semanas passadas
     *
     * @param semanas semanas passadas
     */
    public void defineNumeroSemanas(int semanas) {
        this.numeroSemanas = semanas;
    }

    /**
     * Retorna o estado do aluno levando em consideração se ele
     * descansou mais de 26 horas pra cada semanas passada
     *
     * @return o estado, entre cansado e descansado, do aluno
     */
    public String getStatusGeral() {
        if (numeroSemanas != 0) {
            if (this.horasDescanso / numeroSemanas >= 26) {
                return "descansado";
            }
        }
    return "cansado";
    }
}