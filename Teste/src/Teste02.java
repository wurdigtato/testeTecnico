//2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula,
// além de informar a quantidade de vezes em que ela ocorre.

import java.util.Scanner;

public class Teste02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String texto = scanner.nextLine();

        String textoMinusculo = texto.toLowerCase();

        int count = 0;

        for(int i = 0; i < textoMinusculo.length(); i++){
            if(textoMinusculo.charAt(i) == 'a') {
                count++;
            }
        }

        if(count > 0) {
            System.out.println("A String contém " + count + " letra(s) 'a'");
        } else {
            System.out.println("A String não contém a letra 'a'.");
        }
    }
}
