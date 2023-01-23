import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        List<Gato> lista = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};
        System.out.println(lista); // É necessário sobrescrever o método toString, senão retorna somente o endereço de memória;
        System.out.println(">>>>>> ordem aleatória");
        Collections.shuffle(lista);
        System.out.println(lista);
        System.out.println(">>>>>> ordem Natural");
        Collections.sort(lista);;
        System.out.println(lista);



    }       
}

class Gato implements Comparable <Gato> {

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", idade='" + getIdade() + "'" +
            ", cor='" + getCor() + "'" +
            "}";
    }

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    private String nome;
    private int  idade;
    private String cor;



    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override // Estudar a interface COMPARABLE
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

}
