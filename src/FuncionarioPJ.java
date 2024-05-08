import java.util.Date;

public class FuncionarioPJ extends Funcionario {

    public Date dataContratacao = new Date();
    private double valorHora;

    public FuncionarioPJ(String nome, String cargo, Double valorHora) {
        super(nome, cargo);    
        this.valorHora = valorHora;
    }
    
    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double calcularValorPagamento(int horasTrabalhadas) {
        return valorHora * horasTrabalhadas;
    }
}
