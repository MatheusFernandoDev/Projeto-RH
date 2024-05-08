import java.util.Date;

public class FuncionarioCLT extends Funcionario {

    private double valorHora = salarioBruto / 160;
    public Date dataContratacao = new Date();

    public FuncionarioCLT(String nome, String cargo, Double salarioBruto) {
        super(nome, cargo, salarioBruto);  
    }

    public double getValorHora() {
        return valorHora;
    }

    public double calcularSalarioMensal(int qtdHorasExtras) {
        double salarioMensal = salarioBruto - ((salarioBruto * 9)/100);
        salarioMensal += calcularValorHorasExtras(qtdHorasExtras);
        return salarioMensal;
    }

    private double calcularValorHorasExtras(int horasTrabalhadas) {
        return valorHora * horasTrabalhadas;
    }

}
