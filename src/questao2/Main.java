package questao2;
/**
 * @author alunoti
 */
public class Main { 
   
    public static void main(String[] args) {
        
        Vendedor v = new Vendedor();
        v.setSalarioBruto(2000);
        v.setQuantidadeDeVendas(99);
        v.calcularSalarioLiquido();
        System.out.println("Vendedor R$:");
        System.out.println(v.calcularSalarioLiquido());
        
        Estagiario e = new Estagiario();
        e.setSalarioBruto(2500);
        //e.setQuantidadeDeVendas(99);
        e.calcularSalarioLiquido();
        System.out.println("\nEstagiario R$:");
        System.out.println(e.calcularSalarioLiquido());
        
        Funcionario f = new Funcionario();
        f.setSalarioBruto(2500);
        //e.setQuantidadeDeVendas(99);
        f.calcularSalarioLiquido();
        System.out.println("\nFuncionario R$:");
        System.out.println(f.calcularSalarioLiquido());
        
    }   
}
