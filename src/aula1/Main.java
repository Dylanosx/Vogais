package aula1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);

        System.out.print("Digite a frase desejada ");
        String frase = entrada.nextLine().toLowerCase();
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};




        int[] quantidadevogais  = new int[5];

        for (int i = 0; i < frase.length(); i++) {
            char letra  = frase.charAt(i);
            switch (letra) {
                case 'a':
                    quantidadevogais[0]++;
                    break;
                case 'e':
                    quantidadevogais[1]++;
                    break;
                case 'i':
                    quantidadevogais[2]++;
                    break;
                case 'o':
                    quantidadevogais[3]++;
                    break;
                case 'u':
                    quantidadevogais[4]++;
                    break;
//            } /aqui
        }


        System.out.println("Frase: " + frase);

        for (int i = 0; i < vogais.length; i++) {
            System.out.println(vogais[i] + ": " + quantidadevogais[i]);
        }
System.out.println("aqui esta suas vogais");



    }
}
