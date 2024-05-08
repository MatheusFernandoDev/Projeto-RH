public class App {
    public static void main(String[] args) throws Exception {
        FuncionarioCLT matheus = new FuncionarioCLT("matheus", "sushiman", 1200.00);

        Departamento financeiro = new Departamento("Departamento Financeiro", "São Paulo");

        financeiro.adicionarFuncionario(matheus);

        financeiro.imprimirFuncionarios();

        System.out.println(matheus.calcularSalarioMensal(30));
        
         
        
    }
}
