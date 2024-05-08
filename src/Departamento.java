import java.util.ArrayList;

public class Departamento {
    //Departamento: Uma classe para representar os diferentes departamentos da empresa, com atributos como nome do departamento, localização, etc.

    public String nome;
    public String endereco;
    public int qtdFuncionarios;
    
    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    

    public Departamento(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
        this.qtdFuncionarios += 1;
    }

    public void imprimirFuncionarios(){
        System.out.println("Funcionarios: ");
        for(int i = 0; i < funcionarios.size(); i++){
            System.out.println("==> " + funcionarios.get(i).nome + "| " + funcionarios.get(i).cargo);
        }
    }
}
