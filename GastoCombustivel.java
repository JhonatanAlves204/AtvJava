import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class GastoCombustivel {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quanto tempo foi gasto na viagem(em horas)? ");
        int tempo = entrada.nextInt();

        System.out.println("Velocidade Media durante a mesma(em km/h)? ");
        int vel = entrada.nextInt();

        double distancia = tempo*vel;
        double litros = distancia/12;

        //cria uma variavel pra receber os simbolos da biblioteca
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.US);
        //chama a variavel e define onde quer que seja add o simbolo, no caso é o separador de decimal
        simbolos.setDecimalSeparator('.');
        //cria uma val pro formato decimal, dps add quantas casas decimais quer, e add o simbolo
        DecimalFormat df = new DecimalFormat("#.###", simbolos);
        System.out.println("Litros de Gasolina necessario será de: " + df.format(litros));
    }
}