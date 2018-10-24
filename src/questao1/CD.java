/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

/**
 *
 * @author alunoti
 */
public class CD extends Produto
{
    private String nomeDaBanda;
    
    public CD(int codigo, String descricao, double preco, double peso, String nomeDaBanda)
    {
        super(codigo, descricao, preco, peso);
        this.nomeDaBanda = nomeDaBanda;
    }
    
    public CD()
    {
        
    }

    @Override
    public String toString() {
        return super.toString() 
                + "\nNomeDaBanda: " + nomeDaBanda;
    }
}
