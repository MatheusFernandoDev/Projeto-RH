import java.util.ArrayList;

public class Empresa {
    // Esta classe representaria a própria empresa, contendo uma lista de funcionários e departamentos, bem como métodos para adicionar, atualizar, listar e excluir funcionários e departamentos (as operações CDRU).

    public String nome;
    public String cnpj;
    public int qtdFuncionarios;

    ArrayList<Departamento> departamentos = new ArrayList<>();

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    private int calcularQtdFuncionarios(ArrayList<Departamento> departamentos){
        int soma = 0;
        for (Departamento departamento : departamentos) {
            soma += departamento.qtdFuncionarios;
        }
        return soma;
    }

    public void adicionarDepartamento(Departamento departamento){
        departamentos.add(departamento);
        this.qtdFuncionarios = calcularQtdFuncionarios(departamentos);
    }

    
}
