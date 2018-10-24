
package questao4;

import java.util.Calendar;


public class ContaPoupanca extends ContaBancaria{
    
    private int diaRendimento;
    
    public void calcularRendimento(double taxaRendimento){
        
        Calendar diaAtual = Calendar.getInstance();
        
        if (diaRendimento == diaAtual.get(Calendar.DAY_OF_MONTH)){
            setSaldo(getSaldo() + (getSaldo() * taxaRendimento /100));
        }
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
     
}
