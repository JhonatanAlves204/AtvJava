import java.util.Scanner;


public class Multiplos {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa Para Descobrir de São Multiplos ou Não");
        System.out.println("Digite o Primeiro Valor: ");
        int a = entrada.nextInt();

        System.out.println("Digite o Segundo Valor: ");
        int b = entrada.nextInt();
        
         if(b == 0){
            System.out.println("O valor de B não pode ser zero");
        } else{
             if(a % b == 0){
                System.out.println(a + " é Multiplo de " + b);
             }else{
                System.out.println(a + " não é multiplo de " + b);
            }
        }
        }
    }
