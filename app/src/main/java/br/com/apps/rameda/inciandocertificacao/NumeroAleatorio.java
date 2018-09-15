package br.com.apps.rameda.inciandocertificacao;

import java.util.Random;

public class NumeroAleatorio {
   static public int GerarNumeroAleatorio() {
        int numero=0;
       Random rand = new Random();
       numero = rand.nextInt(101);

       return numero;
    }
}
