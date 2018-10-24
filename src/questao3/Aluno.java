package questao3;

public class Aluno 
{
    private String nome;
    private String matricula;
    private double media;

    public Aluno(String nome, String matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public Aluno()
    {
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return   "\nNome.......: " + nome 
                + "\nMatricula..: " + matricula
                + "\nMedia:.....: " + media;
    }
    
    
    
}
