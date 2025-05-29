package FormaFuncionario;

public class Desenvolvedor extends  Funcionario{
    private String linguagemFavorita;

    public Desenvolvedor(String linguagemFavorita, String nome, double salarioBase){
        super(nome,salarioBase);
        this.linguagemFavorita = linguagemFavorita;
    }

    public String getLinguagemFavorita() {
        return linguagemFavorita;
    }

    public void setLinguagemFavorita(String linguagemFavorita) {
        this.linguagemFavorita = linguagemFavorita;
    }

    @Override
    public double calcularBonus() {
        return this.getSalarioBase()*0.10;
    }
}
