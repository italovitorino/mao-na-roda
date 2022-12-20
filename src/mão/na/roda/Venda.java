package mão.na.roda;

public class Venda extends Veiculo {
    
    private double valorVenda;
    
    public Venda(String _nome, int _ano, String _marca, String _cor, String _placa, String _categoria, double _valorVenda) {
        super(_nome, _ano, _marca, _cor, _placa, _categoria);
        this.valorVenda = _valorVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }
}