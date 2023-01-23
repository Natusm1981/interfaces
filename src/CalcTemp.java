import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import classes.*;

public class CalcTemp {
    public static void main(String[] args) throws Exception {
        Double tempMedia = 0d;
        List<Temperaturas> lista = new ArrayList<>();
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        for(int i = 1; i <= 6; i++){
            lista.add(new Temperaturas(meses[i-1], String.format("%.1f", (20 + Math.random()* 6))));
        }
        System.out.println("Lista de Mes x Temperatura: \n" + lista.toString());

        //Calcular a média semestral
        for(Temperaturas temp : lista){
            tempMedia += DecimalFormat.getNumberInstance().parse(temp.getTemp()).doubleValue();
        }
        tempMedia = tempMedia / lista.size();
        System.out.println("A temperatura média é: " + String.format("%.1f", tempMedia));

        //Mostrar todas temperaturas acima desta média
        System.out.println("Mostrando as temperaduras acima da média de " + String.format("%.1f", tempMedia) + " graus:");
        for(Temperaturas temp : lista){
            if(DecimalFormat.getNumberInstance().parse(temp.getTemp()).doubleValue() > tempMedia)
                System.out.println("Mês " + temp.getMes() + " ficou acima da média com a temperatura de " + temp.getTemp() + " graus.");
        }
        
    }
}
