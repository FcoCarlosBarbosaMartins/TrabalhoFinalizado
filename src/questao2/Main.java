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
        
        System.out.println(v.calcularSalarioLiquido());
        
    }   
}
