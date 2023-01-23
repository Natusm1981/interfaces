package classes;

public class Questionario {



    private String[] perguntas = {"Você telefonou para a vitma?",
     "Esteve no local do crime?", 
     "Você mora perto da vitma?", 
     "Você devia $$$ para a vitma?", 
     "Já trabalhou com a vitma?"};
    private int numeroPerguntas = perguntas.length;

    public int getNumeroPerguntas(){
        return numeroPerguntas;
    }

    public String MostrarPergunta(int p){
        return perguntas[p];
    }

}
