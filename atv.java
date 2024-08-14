import java.util.Scanner;

public class Geometrica {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Menu das Formas Geometricas \n Digite 1 pra calcular a area do circulo \n Digite 2 pra calcular a area do trapezio \n Digite 3 pra calcular a area do triangulo");
        int opc = entrada.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Digite o raio do circulo");
                double raio = entrada.nextDouble();
                areaCirculo(raio);
                break;

            case 2:
                System.out.println("Digite a base maior");
                double baseMa = entrada.nextDouble();

                System.out.println("Digite a base menor");
                double baseMe = entrada.nextDouble();

                System.out.println("Digite a altura");
                double altura = entrada.nextDouble();
                areaTrapezio(baseMa,baseMe,altura);

                
                break;
            
                case 3:
                System.out.println("Digite a base do triangulo");
                double baseTri = entrada.nextDouble();

                System.out.println("Digite a altura do triangulo");
                double alturaTri = entrada.nextDouble();
                areaTriangulo(baseTri,alturaTri);
                break;

                case 4: 

                System.out.println("Informe o valor do cateto adjacente: ");
                int catetoAd = entrada.nextInt();
                System.out.println("Informe o valor do cateto oposto: ");
                int catetoOp = entrada.nextInt();

                pitagora(catetoAd, catetoOp);
                break;
                default:
                System.out.println("Numeros inexistentes");
        }
    }

    public static void areaCirculo(double raio) {
        double areaCirculo = 3.14 * (raio * raio);
        System.out.println("A área do círculo é: " + areaCirculo);
    }

    public static void areaTrapezio(double x,double y,double h) {
        double trapezio = ((x+y)*h)/2;
        System.out.println("Area do trapezio é igual a: " + trapezio);
        
    }

    public static void areaTriangulo(double baseTri, double alturaTri) {
        double triangulo = (baseTri*alturaTri)/2;
        System.out.println("a Area do triangulo é igual a: " + triangulo);
        
    }

    public static void pitagora(int ca, int co){
        double hipotenusa = Math.sqrt(ca * ca + co * co);
        System.out.println("O valor da hipotenusa é igual a:" + hipotenusa);
    }
}