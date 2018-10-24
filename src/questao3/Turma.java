
package questao3;

import java.util.ArrayList;

public class Turma 
{
    private ArrayList<Aluno> listaAlunos;

    public Turma() {     
        this.listaAlunos = new ArrayList();      
    }
        
    public Turma(ArrayList<Aluno> listAlunos)
    {
        this.listaAlunos = listAlunos;
    }
            
    public void imprimir()
    {
        listaAlunos.forEach(Aluno ->{
            System.out.println(Aluno.toString());
        });
    }
    
    
    public void adicionarAluno(Aluno aluno)
    {
        listaAlunos.add(aluno);
    }
}
