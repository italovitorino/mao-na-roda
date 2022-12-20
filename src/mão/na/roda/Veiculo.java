package mão.na.roda;

public class Veiculo {
    protected String nome;
    protected int ano;
    protected String marca;
    protected String cor;
    protected String placa;
    protected String categoria;

    public Veiculo(String _nome, int _ano, String _marca, String _cor, String _placa, String _categoria) {
        this.nome = _nome;
        this.ano = _ano;
        this.marca = _marca;
        this.cor = _cor;
        this.placa = _placa;
        this.categoria = _categoria;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCategoria() {
        return categoria;
    }
}