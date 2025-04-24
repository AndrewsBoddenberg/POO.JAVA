package avaliação;

public class Funcionario {

    private String nome;
    private int matricula;
    private float salario;

    public Funcionario (String nome, int matricula, float salario) {

        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public Funcionario () {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getmatricula() {
        return matricula;
    }

    public void setMatricula (int matricula) {
        this.matricula = matricula;
    }

    public float getsalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;


    }

    @Override
    public String toString() {
        return "Clinica{" +
                "nome='" + nome + '\'' +
                ", cpf=" + matricula +
                ", email='" + salario + '\'' +
                '}';
    }

}