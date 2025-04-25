package avaliação;

public class Produto {

    private String nome;
    private float preco;
    private int quantidade;

    public Produto (String nome, float preco, int quantidade) {

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto () {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco (float preco) {
        this.preco = preco;
        if(preco > 0){
            this.preco  = preco;
        } else {
        throw new IllegalArgumentException("Erro");
        }


    }

    public float getquantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;

        this.quantidade = quantidade;
        if(quantidade < 0){
            this.quantidade  = quantidade;
        } else {
            throw new IllegalArgumentException("Erro");
        }


    }

    @Override
    public String toString() {
        return "Clinica{" +
                "nome='" + nome + '\'' +
                ", cpf=" + preco +
                ", email='" + quantidade + '\'' +
                '}';
    }

    public void imprimirInformacoes() {
    }
}