import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int totalAlunos = 10;
        double[] notas = new double[totalAlunos];
        double soma = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <notas.length ; i++) {
            System.out.println("Informe a nota do aluno "+(i+1)+": ");
            notas[i]= scanner.nextDouble();
            soma += notas[i];
        }
        double media = soma / totalAlunos;
        int acimaMedia = 0;
        int abaixoMedia = 0;
        for (double nota : notas){
            if (nota > media){
                acimaMedia++;
            }
            else if (nota < media){
                abaixoMedia++;
            }
        }
        System.out.println("A media das notas foi: "+media);
        System.out.println("Total de notas acima da media: "+acimaMedia);
        System.out.println("Total de notas abaixo da media: "+abaixoMedia);
    }
}