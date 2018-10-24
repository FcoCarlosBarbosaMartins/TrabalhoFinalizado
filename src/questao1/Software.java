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
public class Software extends Produto
{
    private String categoria;
    
    public Software(int codigo, String descricao, double preco, double peso, String categoria)
    {
        super(codigo, descricao, preco, peso);
        this.categoria = categoria;
    }
    
    public Software()
    {
        
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCategoria: " + categoria;
    }
    
    
    
}
