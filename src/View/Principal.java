package View;

import Controller.invString;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        invString iS = new invString();


        System.out.println("Insira uma frase a ser invertida");
        String frase = scan.next();

        int tam = frase.length();

        System.out.println(iS.funcInvString(tam, frase));
        

    }

}
