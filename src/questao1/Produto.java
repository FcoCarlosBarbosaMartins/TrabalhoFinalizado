
package questao1;

public class Produto {
    private int codigo;
    private String descricao;
    private double preco;
    private double peso;
    
    public Produto(int codigo, String descricao, double preco, double peso)
    {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.peso = peso;
    }
    
    /*Calculando o Frete do Produto sobre o Peso do Produto
    public double CalcularFrete()
    {
        double valor = 6.50;
        valor = (valor * peso);
        return valor;
    }
    */
    public Produto()
    {
     
    }
    
    public double CalcularFrete()
    {
        final double TAXA_FRETE = 6.5; //Finalizando a Constante, Fixando o Valor, Valor nao muda
        return peso * TAXA_FRETE;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "\nCodigo.....: " + codigo + 
               "\nDescricao..: " + descricao + 
               "\nPreco......: " + preco + 
               "\nPeso.......: " + peso;
    }
    
}
