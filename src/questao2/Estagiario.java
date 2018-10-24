package questao2;
/**
 * @author alunoti
 */
public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salarioBruto) {
        super(nome, salarioBruto);
    }

    public Estagiario() {
    }

    
    @Override
    public double calcularSalarioLiquido() {
       
        return getSalarioBruto();
    }  
}
