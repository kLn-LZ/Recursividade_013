package Controller;


public class invString {

    public invString() {
        super();


    }


    public String funcInvString (int n, String frase) {



        // Checando se a string tem apenas 1 caracter
        if ( n < 2 ) {

            return frase;
        }


        // Concatenando o último caracter da String com uma outra iteração onde esse último caracter foi excluído
        return frase.substring(frase.length() - 1) + funcInvString(n - 1, frase.substring(0, n - 1));



    }


}
