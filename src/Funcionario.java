
public abstract class Funcionario {

    public String nome;
    public String cargo;
    public Double salarioBruto;
    

    public Funcionario(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBruto = salario;
    }
    
    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

}
