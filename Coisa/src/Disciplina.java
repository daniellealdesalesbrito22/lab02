import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas = new double[4];

    public Disciplina(String nome) {
        this.nomeDisciplina = nome;
        this.horasEstudo = 0;
    }

    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota-1] = valorNota;
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

    public String toString() { // Poderia ter usado o toString horrivel lixo yuji >>>>>>>
        return this.nomeDisciplina + " " + this.horasEstudo+ " " + media(this.notas) + " " + "[" + this.notas[0] + ", " + this.notas[1] + ", " + this.notas[2] + ", " + this.notas[3] + "]";
    }
}