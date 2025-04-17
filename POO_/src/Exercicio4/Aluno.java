package Exercicio4;

public class Aluno {

    private String nome;
    private int matricula;
    private double notaFinal;

    public Aluno (String nome, int matricula, double notaFinal) {

        this.nome = nome;
        this.matricula = matricula;
        this.notaFinal = notaFinal;
    }

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", notaFinal=" + notaFinal +
                '}';
    }

}

