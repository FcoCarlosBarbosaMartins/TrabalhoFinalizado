
package questao4;

public class ContaEspecial extends ContaBancaria{
    
    private double limite;

    public ContaEspecial(double limite, String numeroDaConta) {
        super(numeroDaConta);
        this.limite = limite;
    }

    public ContaEspecial(String numeroDaConta) {
        super(numeroDaConta);
    } 

    public ContaEspecial() {
    }
    
    @Override
    public void sacar(double valor) 
    {
        if(valor <= (getSaldo() + limite))
        {
            setSaldo(getSaldo() - valor);
            System.out.println("Sacado com sucesso!");
        }
        else
        {
            System.out.println("Não foi possivel sacar!");
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
}
