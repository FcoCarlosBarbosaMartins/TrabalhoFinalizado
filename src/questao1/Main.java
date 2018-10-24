
package questao1;

public class Main 
{
    public static void main(String[] args) 
    {
        CD cd = new CD(1,"Pelados em Santos", 45.00, 1, "Mamonas");
                
        System.out.println(cd.toString());
        System.out.println("Frete: " + cd.CalcularFrete());
        
        Livro livro = new Livro(1,"O Homem Que Ri", 75.00, 2, "Victor Hugo");
        System.out.println(livro.toString());
        System.out.println("Frete: " + livro.CalcularFrete());
        
        Software soft = new Software(1,"Editor de Textos", 150.00, 6,"WordStar");
        System.out.println(soft.toString());
        System.out.println("Frete: " + livro.CalcularFrete());
        
    }
}
