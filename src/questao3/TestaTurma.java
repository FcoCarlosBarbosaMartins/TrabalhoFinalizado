
package questao3;

import java.util.ArrayList;

public class TestaTurma 
{
    public static void main(String[] args) 
    {
        Aluno aluno = new Aluno("JoaoConguinho","2015141215",5);
        Turma turma = new Turma();
        turma.adicionarAluno(aluno);
        turma.imprimir();
        
        ArrayList<Aluno> listaAlunos = new ArrayList();
        Aluno testeAluno = new Aluno("VictorHugo", "151515151", 05);
        listaAlunos.add(testeAluno);
        Turma novaTurma = new Turma(listaAlunos);
        novaTurma.imprimir();
        
        
    }
}
