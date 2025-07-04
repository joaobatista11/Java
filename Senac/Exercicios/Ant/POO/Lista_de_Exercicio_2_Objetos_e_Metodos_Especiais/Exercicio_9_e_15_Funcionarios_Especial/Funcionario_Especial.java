
package Lista_de_Exercicio_2_Objetos_e_Metodos_Especiais.Exercicio_9_e_15_Funcionarios_Especial;

public class Funcionario_Especial {
String funcionario, departamento;
double salario;

    public Funcionario_Especial(String funcionario, String departamento, double salario) {
        this.funcionario = funcionario;
        this.departamento = departamento;
        this.salario = salario;
    }

public void status(){
        System.out.println("\n## Informação do Funcionario ##\n\n"
                + "Nome: "+this.funcionario+"\nDepartamento: "+this.departamento
                +"\nSalário: R$"+this.salario);
}
    
public void aumentar_salario(double percentual){
percentual*=0.01;
salario *= (percentual+1);
}

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
