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
public class Livro extends Produto
{
    private String nomeDoAutor;
    
    public Livro(int codigo, String descricao, double preco, double peso, String nomeDoAutor)
    {
        super(codigo, descricao, preco, peso);
        this.nomeDoAutor = nomeDoAutor;
    }
    
    public Livro()
    {
        
    }

    @Override
    public String toString() {
        return super.toString() + "\nNome do Autor: " + nomeDoAutor;
    }
    
}
