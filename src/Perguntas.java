import java.util.ArrayList;
import java.util.List;

import classes.Questionario;
import classes.Resposta;

public class Perguntas {
    public static void main(String[] args) throws Exception {
        List<Integer> pessoa = new ArrayList<>();
        Questionario perguntas = new Questionario();
        Resposta resp = new Resposta();
        int respostaTemp = 0;
        int contador = 0;

       
        System.out.println(pessoa.toString());

        for(int i = 0; i <  perguntas.getNumeroPerguntas(); i++){
            System.out.println(perguntas.MostrarPergunta(i));
            respostaTemp = resp.Responder();
            System.out.println(respostaTemp);
            pessoa.add(respostaTemp);
            if(respostaTemp == 1)
                contador++;
        }   

        if(contador == 0)
            System.out.print("INOCENTE");
        else if (contador < 3)
            System.out.print("SUSPEITO");
        else if(contador<5)
            System.out.print("CUMPLICE");
        else
            System.out.print("ASSESSINO");
    }
}
