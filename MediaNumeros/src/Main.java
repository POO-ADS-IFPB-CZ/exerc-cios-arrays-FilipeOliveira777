import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade = 0;
        int numero;
        ArrayList<Integer> numeros = new ArrayList<>();
        int soma = 0;
        while (true){
            System.out.println("Informe um numero inteiro para continuar ou negativo para sair: ");
            numero = scanner.nextInt();
            if (numero < 0){
                break;
            }
            else {
                numeros.add(numero);
                soma += numero;
                quantidade++;
            }
        }
    double media = (double) soma / quantidade;
        System.out.println("O total de numeros digitados foi: "+quantidade);
        System.out.println("A media dos numeros digitados foi: "+media);
        System.out.println("Os numeros digitados foram:");
        for (Integer num : numeros){
            System.out.printf(num+" ");
        }
    }
}