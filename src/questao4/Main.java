
package questao4;


public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println(">>> Conta Comum <<<");
        ContaComun contaComun = new ContaComun();      
        contaComun.depositar(200);        
        contaComun.sacar(250);
        System.out.println("Saldo da Conta Comum ou ContaCorrente");
        contaComun.consultarSaldo();
        
        
                
        System.out.println("\n>>> Conta Especial <<<");
        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setLimite(500);
        contaEspecial.depositar(200);     
        contaEspecial.sacar(700);
        System.out.println("Saldo da Conta Especial: ");
        contaEspecial.consultarSaldo();
        
        System.out.println("\n>>> Conta Bancaria <<<");
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.depositar(1000);
        contaBancaria.sacar(800);
        System.out.println("Saldo Conta Bancaria: ");
        contaBancaria.consultarSaldo();
        
        System.out.println("\n>>> Conta Poupanca <<<");
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(500);
        contaPoupanca.setDiaRendimento(24);
        contaPoupanca.calcularRendimento(0.5);
        contaPoupanca.consultarSaldo();
        System.out.println("Saldo da Conta Poupanca: ");
        contaPoupanca.consultarSaldo();
        
        
        
    }
}
