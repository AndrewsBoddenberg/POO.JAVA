package FormaFuncionario;

public class Gerente extends Funcionario{
    private int projetosGerenciados;

    public Gerente(int projetosGerenciados , String nome, double salarioBase){
        super(nome, salarioBase);
        this.projetosGerenciados = projetosGerenciados;
    }

    public int getProjetosGerenciados() {
        return this.projetosGerenciados;
    }

    public void setProjetosGerenciados(int projetosGerenciados) {
        this.projetosGerenciados = projetosGerenciados;


    }

    @Override
    public double calcularBonus () {
        return this.getSalarioBase()*0.15;
    }
}


