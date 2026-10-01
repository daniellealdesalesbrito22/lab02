public class Disciplina {
    String nomeDisciplina;
    int horasEstudo;
    double[] notas;

    public Disciplina(String nome) {
        this.nomeDisciplina = nome;
        this.horasEstudo = 0;
    }

    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        notas[nota] = valorNota;
    }

    private double media(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / 4;
    }

    public boolean aprovado() {
        if (media(this.notas) >= 7.0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.nomeDisciplina + this.horasEstudo + media(this.notas) + notas;
    }
}