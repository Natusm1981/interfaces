import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        List<Double> lista = new ArrayList<Double>();
        List<Double> lista2 = new ArrayList<Double>();
        lista.add(10.0);
        lista.add(1.0);
        lista.add(2.1);
        lista.add(3.8);
        lista.add(8.0);
        lista.add(5.6);
        lista.add(0.4);

        System.out.println(lista.size());
        System.out.println(lista.toString());
        lista.remove(2);
        System.out.println(lista.toString());
        lista.add(1, 9.9);
        System.out.println(lista.toString());
        lista.forEach(item -> System.out.println(item)); //sobrecarga parecida com arrow function JS
        for(Double item : lista)    //percorre o array para cada item (tem inferência de tipo do item)
            if(item > 3.0)          //Se o item for maior que 3.0, executa a proxima linha
                lista2.add(item);
        System.out.println(lista2.toString());


        

    }
}
