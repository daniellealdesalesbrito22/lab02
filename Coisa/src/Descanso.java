public class Descanso {
    int horasDescanso;
    int numeroSemanas;

    public Descanso() {
        this.horasDescanso = 0;
        this.numeroSemanas = 0;
    }

    public void defineHorasDescanso(int horas) {
        this.horasDescanso += horas;
    }

    public void defineNumeroSemanas(int semanas) {
        this.numeroSemanas += semanas;
    }

    public String getStatusGeral() {
        if (numeroSemanas != 0) {
            if (this.horasDescanso / numeroSemanas >= 26) {
                return "descansado";
            }
        }
    return "cansado";
    }

}