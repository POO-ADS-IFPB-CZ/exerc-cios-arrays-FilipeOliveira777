public class Main {
    public static void main(String[] args) {
        int numeros = 30;
        int[] serieFibo = new int[numeros];
        int ultimo=0;
        int penultimo;
        int proximo=1;

        for (int i = 0; i < serieFibo.length; i++) {
            serieFibo[i]=proximo;
            penultimo = ultimo;
            ultimo = proximo;
            proximo = ultimo + penultimo;
            System.out.printf(serieFibo[i]+" ");
        }

    }
}